package com.example.springbootjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiye
 * @create 2022-10-2022/10/11 18:26
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "哈哈";
    }
}
