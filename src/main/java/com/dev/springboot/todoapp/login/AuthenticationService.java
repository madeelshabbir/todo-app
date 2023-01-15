package com.dev.springboot.todoapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
  boolean authenticate(String name, String password) {
    return name.equalsIgnoreCase("adeel") &&
           password.equals("Password");
  }
}
