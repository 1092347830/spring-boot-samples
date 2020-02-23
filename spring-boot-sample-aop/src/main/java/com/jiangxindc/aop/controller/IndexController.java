package com.jiangxindc.aop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("index");
        return "success";
    }
}
