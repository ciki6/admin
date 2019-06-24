package com.bitstudio.admin.controller;


@RestController
public class HelloController {

    @GetMapping(value="/hello")
    public Object hello() {
        return "Hello Kitty!";
    }

}
