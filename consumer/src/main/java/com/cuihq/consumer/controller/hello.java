package com.cuihq.consumer.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by cuihq on 2018-4-24.
 */
@FeignClient(name="spring-cloud-producer")
public interface hello {
    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name1);
}
