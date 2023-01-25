package com.prep.springsetup.kickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CustomController {

    @GetMapping("/test")
    public String test() {
        return "this is the test";
    }

    @GetMapping("/getBooks")
    public Map<String, Integer> getBooks(){
        return new HashMap<String, Integer>() {{
            put("Book 1", 8);
            put("Book 2", 37);
        }};
    }
}
