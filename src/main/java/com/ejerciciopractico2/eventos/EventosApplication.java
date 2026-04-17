package com.ejerciciopractico2.eventos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ejerciciopractico2.eventos")
public class EventosApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventosApplication.class, args);
    }
}