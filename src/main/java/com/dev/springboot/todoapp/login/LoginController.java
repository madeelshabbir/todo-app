package com.dev.springboot.todoapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
  @RequestMapping(value = "login", method = RequestMethod.GET)
  public String show() {
    return "login";
  }

  @RequestMapping(value = "login", method = RequestMethod.POST)
  public String welcome(@RequestParam String name, ModelMap model) {
    model.put("name", name);
    return "welcome";
  }
}
