package com.dev.springboot.todoapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
  private Logger logger = (Logger) LoggerFactory.getLogger(getClass());

  @RequestMapping("login")
  public String show(@RequestParam String name, ModelMap model) {
    model.put("name", name);
    logger.info("Request params is {}", name);
    logger.debug("Request params is {}", name);
    logger.warn("Request params is {}", name);
    return "login";
  }
}
