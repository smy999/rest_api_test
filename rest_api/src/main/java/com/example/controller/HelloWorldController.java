package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	private static final String template = "Hello, %s!";

    @RequestMapping("/greeting")
    public void greeting(@RequestParam(value="name", defaultValue="World") String name) {
        System.out.println("Hello, " + name);
    }

}
