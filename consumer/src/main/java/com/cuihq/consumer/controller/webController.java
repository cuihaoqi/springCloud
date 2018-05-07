package com.cuihq.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cuihq on 2018-4-24.
 */
@RestController
public class webController {
    @Autowired
    hello hello;
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name1){
        return hello.hello(name1);
    }
}
