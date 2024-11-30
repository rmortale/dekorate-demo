package ch.dulce.k8s.dekoratedemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
public class HelloController {

  @Value("${app.greeting}")
  private String greeting;

  @GetMapping()
  public String hello() {
    return greeting;
  }
}
