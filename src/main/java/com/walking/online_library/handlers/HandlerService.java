package com.walking.online_library.handlers;

import com.walking.online_library.model.User;
import com.walking.online_library.service.BookService;
import com.walking.online_library.service.UserService;

public abstract class HandlerService  {
   public static User userContainer;
   public static BookService bookService = new BookService();
   public static UserService userService = new UserService();
}
