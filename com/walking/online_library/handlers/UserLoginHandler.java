package com.walking.online_library.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import com.walking.online_library.service.UserLogin;

import java.io.IOException;
import java.io.OutputStream;

public class UserLoginHandler extends HandlerService implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        if ("POST".equals(exchange.getRequestMethod())) {
            String[] userData = exchange.getRequestURI().getQuery().split("&");
            String response;
            userContainer = UserLogin.foundUserInList(userData[0], Integer.parseInt(userData[1]));
            if (userContainer != null) {
                userService.setUser(bookService.setUser(userContainer));
                response = "User logged";
                LoginCheckHandler.userLogged = true;
            } else response = "Data wrong";
            System.out.println(response);
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}
