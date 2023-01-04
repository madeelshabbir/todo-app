package com.dev.springboot.todoapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

  @RequestMapping("hello/say")
  @ResponseBody
  public String say() {
    return "Hello World!";
  }


  @RequestMapping("hello/say-in-html")
  @ResponseBody
  public String sayInHtml() {
    StringBuffer buffer = new StringBuffer();
    buffer.append("<html>");
    buffer.append("<head>");
    buffer.append("<title>Hello Page</title>");
    buffer.append("</head>");
    buffer.append("<body>");
    buffer.append("<p>Hello World!</p>");
    buffer.append("</body>");
    buffer.append("</html>");
    return buffer.toString();
  }
}
