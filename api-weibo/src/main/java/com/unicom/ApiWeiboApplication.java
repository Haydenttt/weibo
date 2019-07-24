package com.unicom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
public class ApiWeiboApplication {

  public static void main(String[] args) {
    SpringApplication.run(ApiWeiboApplication.class, args);
  }
}
