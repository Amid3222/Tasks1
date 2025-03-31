package com.walking.online_library;

import com.sun.net.httpserver.*;
import com.walking.online_library.model.User;
import com.walking.online_library.service.BookService;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class httpServer {
    static User user1 = new User("genda", 123);
    static BookService bookService = new BookService(user1);


    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(5050), 0);
        httpServer.createContext("/", new BooksHandler());
        httpServer.setExecutor(null);
        httpServer.start();
        System.out.println(bookService.getListOfBooks());
        System.out.println("Server started on port 5050");

    }

    static class BooksHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            /*if ("GET".equals(exchange.getRequestMethod())) {
                String response = bookService.getListOfBooks();
                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();

            } */
            String response = bookService.getListOfBooks();

            // Отправляем HTTP-заголовки ответа
            exchange.sendResponseHeaders(200, response.getBytes("UTF-8").length);

            // Получаем поток вывода для записи тела ответа
            OutputStream os = exchange.getResponseBody();

            // Записываем строку ответа в поток вывода
            os.write(response.getBytes(StandardCharsets.UTF_8));

            // Закрываем поток вывода
            os.close();

        }


    }
}
