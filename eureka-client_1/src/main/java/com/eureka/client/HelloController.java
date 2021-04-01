package com.eureka.client;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements Hello{
    @Override
    public String hello() {
        return String.format("Добрый день");
    }
}
