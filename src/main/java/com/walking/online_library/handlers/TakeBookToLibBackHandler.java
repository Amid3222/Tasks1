package com.walking.online_library.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;


public class TakeBookToLibBackHandler extends HandlerService implements HttpHandler{

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        if ("POST".equals(exchange.getRequestMethod())) {
            String query = exchange.getRequestURI().getQuery();
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