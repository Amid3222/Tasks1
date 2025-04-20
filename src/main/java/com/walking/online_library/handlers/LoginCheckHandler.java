package com.walking.online_library.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;


public class LoginCheckHandler implements HttpHandler {
    public static boolean userLogged = false;
    HttpHandler nextHandler;

    public LoginCheckHandler(HttpHandler httpHandler) {
        this.nextHandler = httpHandler;
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        if (!userLogged) {
            String response = "please login or register";
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
        else nextHandler.handle(exchange);
    }


}
