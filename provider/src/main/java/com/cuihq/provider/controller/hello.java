package com.cuihq.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cuihq on 2018-4-24.
 */
@RestController
public class hello {
    @RequestMapping("/hello")
    public String index(@RequestParam String name){
        return "hello2"+name+"!";
    }
}
