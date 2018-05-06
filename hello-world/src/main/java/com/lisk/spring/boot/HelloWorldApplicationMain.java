package com.lisk.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 5. 增加Spring Boot应用程序入口类注解
 */
@SpringBootApplication
public class HelloWorldApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplicationMain.class, args);
    }

}
