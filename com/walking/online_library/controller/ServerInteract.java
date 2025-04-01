package com.walking.online_library.controller;

import com.sun.net.httpserver.HttpServer;
import com.walking.online_library.handlers.BooksHandler;
import com.walking.online_library.handlers.ChooseBookHandler;

import com.walking.online_library.handlers.LoginCheckHandler;
import com.walking.online_library.handlers.TakeBookToLibBackHandler;
import com.walking.online_library.handlers.UserLoginHandler;
import com.walking.online_library.handlers.UserRegistrationHandler;
import com.walking.online_library.service.BookService;

import java.io.IOException;

import java.net.InetSocketAddress;


public class ServerInteract {
    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(5050), 0);
        createContexts(httpServer);
        httpServer.setExecutor(null);
        httpServer.start();
        System.out.println(BookService.getListOfAvailableBooks());
        System.out.println("Server started on port 5050");
    }

    public static void createContexts(HttpServer httpServer) {
        httpServer.createContext("/reg", new UserRegistrationHandler());
        httpServer.createContext("/login", new UserLoginHandler());
        httpServer.createContext("/books", new LoginCheckHandler(new BooksHandler())); //посмотреть список книг
        httpServer.createContext("/books/book", new LoginCheckHandler(new ChooseBookHandler())); //взять книгу по айди book?10
        httpServer.createContext("/books/bookreturn", new LoginCheckHandler(new TakeBookToLibBackHandler()));
    }
}
