package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
public class DemoController {
    
    @GetMapping("/hello")
    public String getMessage(){
        log.info("inside controller");
        return "Hello World!";
    }
}
