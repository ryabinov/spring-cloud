package com.eureka.client;

import org.springframework.web.bind.annotation.RequestMapping;

public interface Hello {
    @RequestMapping("/hello")
    String hello();
}
