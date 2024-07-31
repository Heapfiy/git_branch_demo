package com.hezy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hezhongying
 * @create 2024/7/31 15:10
 */
@RestController
public class DemoController {

    @GetMapping("/hello")
    public String demo() {
        return "hello";
    }
}
