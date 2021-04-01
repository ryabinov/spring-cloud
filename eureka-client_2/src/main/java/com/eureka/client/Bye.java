package com.eureka.client;

import org.springframework.web.bind.annotation.RequestMapping;

public interface Bye {
    @RequestMapping("/bye")
    String bye();
}
