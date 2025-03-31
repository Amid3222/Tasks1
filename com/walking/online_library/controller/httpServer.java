package com.walking.online_library.controller;

import com.sun.net.httpserver.*;
import com.walking.online_library.service.UserLogin;
import com.walking.online_library.model.User;
import com.walking.online_library.service.BookService;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;


public class httpServer {
    private static boolean userLogged = false;
    private static BookService bookService;

    public static void checkRegistration(HttpExchange ex) throws IOException {
        if (!userLogged) {
            String response = "please login or register";
            ex.sendResponseHeaders(200, response.length());
            OutputStream os = ex.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(5050), 0);
        httpServer.createContext("/reg", new usersRegLogic());
        httpServer.createContext("/login", new usersLoginLogic());
        httpServer.createContext("/books", new BooksHandler()); //посмотреть список книг
        httpServer.createContext("/books/book", new chooseBookHandler()); //взять книгу по айди book?10
        httpServer.createContext("/books/bookreturn", new takeBookToLibBackHandler());
        httpServer.setExecutor(null);
        httpServer.start();
        System.out.println(bookService.getListOfAvailableBooks());
        System.out.println("Server started on port 5050");
    }

    static class BooksHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if ("GET".equals(exchange.getRequestMethod())) {
                checkRegistration(exchange);
                String response = BookService.getListOfAvailableBooks() + "\nYour books: \n" + bookService.getUserBooksLib();
                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        }
    }

    static class chooseBookHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if ("GET".equals(exchange.getRequestMethod())) {
                checkRegistration(exchange);
                URI requestURI = exchange.getRequestURI();
                String query = requestURI.getQuery();
                String response = bookService.findBook(bookService.getBookById(query));
                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        }
    }

    static class takeBookToLibBackHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if ("POST".equals(exchange.getRequestMethod())) {
                checkRegistration(exchange);
                URI requestURI = exchange.getRequestURI();
                String query = requestURI.getQuery();

                System.out.println("User sent id " + query);

                // Формирование ответа
                String response = bookService.takeBookToLib(query);

                // Отправка HTTP-заголовков ответа
                exchange.sendResponseHeaders(200, response.getBytes("UTF-8").length);

                // Получение потока вывода для записи тела ответа
                OutputStream os = exchange.getResponseBody();

                // Запись строки ответа в поток вывода с указанием кодировки
                os.write(response.getBytes("UTF-8"));

                // Закрытие потока вывода
                os.close();
            }

        }
    }

    static class usersRegLogic implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if ("POST".equals(exchange.getRequestMethod())) {
                URI requestURI = exchange.getRequestURI();
                String query = requestURI.getQuery();
                String[] userData = query.split("&");
                String response = null;
                User user = new User(userData[0], Integer.parseInt(userData[1]));
                if (UserLogin.isCreateNewUser(user)) {
                    response = "User created";
                    userLogged = true;
                    bookService = new BookService(user);
                } else response = "This user already exists";
                System.out.println(response);
                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
                System.out.println(UserLogin.getUserlist().toString());
            }
        }
    }

    static class usersLoginLogic implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if ("POST".equals(exchange.getRequestMethod())) {
                URI requestURI = exchange.getRequestURI();
                String query = requestURI.getQuery();
                String[] userData = query.split("&");
                String response = null;
                User user = UserLogin.foundUserInList(userData[0], Integer.parseInt(userData[1]));
                if (user != null) {
                    response = "User logged";
                    userLogged = true;
                    bookService = new BookService(user);
                } else response = "Data wrong";
                System.out.println(response);
                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        }
    }
}
