package com.qingguatang.product.t;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.qingguatang.product", "com.qingguatang.product.control",
    "com.qingguatang.product.service.impl"})
public class TranscriptApplication {

  public static void main(String[] args) {
    SpringApplication.run(TranscriptApplication.class, args);
  }
}