package com.eureka.client;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeController implements Bye{
    @Override
    public String bye() {
        return String.format("Всего доброго! Вы здоровались N-ое количество раз");
    }
}
