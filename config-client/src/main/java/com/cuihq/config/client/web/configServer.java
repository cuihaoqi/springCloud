package com.cuihq.config.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cuihq on 2018-4-25.
 */
@RestController
@RefreshScope
public class configServer {
    //这里注入读取的git中的配置key
    @Value("${neo.hello}")
    public String hello;
    @RequestMapping("/hello")
    public String index(){
        return this.hello;
    }

}
