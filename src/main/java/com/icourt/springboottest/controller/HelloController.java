package com.icourt.springboottest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: icourt
 * @date: 2018/8/1 12:41
 * @description:
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String test() {
        return "hello";
    }
}
