package ch.dulce.k8s.dekoratedemo;

import io.dekorate.docker.annotation.DockerBuild;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DockerBuild(group = "rmortale", registry = "ghcr.io")
public class DekorateDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DekorateDemoApplication.class, args);
  }
}
