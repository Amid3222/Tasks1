package com.walking.online_library.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.walking.online_library.service.BookService;

import java.io.IOException;
import java.io.OutputStream;

public class BooksHandler extends HandlerService implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        if ("GET".equals(exchange.getRequestMethod())) {
            String response = checksUser();
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    public static String checksUser() {
        if (userService.isDaysExpiredOnAnyBook()) userService.addViolation();
        if (userService.doCheck() == null) {
            return BookService.getListOfAvailableBooks() + "\nYour books: \n" + bookService.getUserBooksLib();
        }
        return userService.doCheck();
    }
}
