package com.walking.online_library.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.walking.online_library.model.User;

import com.walking.online_library.service.UserLogin;
import com.walking.online_library.service.UserService;

import java.io.IOException;
import java.io.OutputStream;


public class UserRegistrationHandler extends HandlerService implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        if ("POST".equals(exchange.getRequestMethod())) {
            String[] userData = exchange.getRequestURI().getQuery().split("&");
            String response;
            userContainer = new User(userData[0], Integer.parseInt(userData[1]));
            if (UserLogin.isCreateNewUser(userContainer)) {
                response = "User created";
                LoginCheckHandler.userLogged = true;
                userService.setUser(bookService.setUser(userContainer));
            } else response = "This user already exists";
            System.out.println(response);
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}