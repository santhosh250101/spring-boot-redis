package com.santhosh.springboot_redis.spring_with_redis.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    

    @GetMapping("/")
    public String sayHello() {
        return "Working";
    }

}
