package com.prep.springsetup.kickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {

    @GetMapping("/test")
    public String test() {
        return "this is the test";
    }
}
