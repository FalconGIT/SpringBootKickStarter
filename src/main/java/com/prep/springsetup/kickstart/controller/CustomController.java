package com.prep.springsetup.kickstart.controller;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CustomController {

    @GetMapping("/test")
    public String test() {
        return "this is the test";
    }

    @GetMapping("/get-books")
    public Map<String, Integer> getBooks(){
        return new HashMap<String, Integer>() {{
            put("Book 1", 8);
            put("Book 2", 37);
        }};
    }

    @GetMapping("/v1/cart/all")
    public ResponseEntity getAllCarts() {
//        //Cart cart = Cart.builder().Id("cart1").items(Sets.newHashSet(Item.builder().id("item1").name("rajat").build())).build();
//        Item item = new Item();
//        item.setId("id-1");
//        Cart cart = new Cart("cart1", Sets.newHashSet(item));
        //return ResponseEntity.ok(Lists.newArrayList("apple"));
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}
