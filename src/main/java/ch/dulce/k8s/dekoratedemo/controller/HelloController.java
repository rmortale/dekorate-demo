package ch.dulce.k8s.dekoratedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
public class HelloController {

  @GetMapping
  public String hello() {
    return "Hello World!";
  }
}
