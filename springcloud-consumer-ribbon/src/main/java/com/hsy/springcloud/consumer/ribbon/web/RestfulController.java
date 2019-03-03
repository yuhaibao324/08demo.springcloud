package com.hsy.springcloud.consumer.ribbon.web;

import com.hsy.springcloud.consumer.ribbon.service.RestfulServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path springboot.demo/com.hsy.springboot.demo.springboot.jdbc
 * @date ${data} ${time}
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@RestController
@RequestMapping("/api/rest")
public class RestfulController {

    @Autowired private RestfulServiceImpl restfulService ;

    @Value("${server.port}")
    String port ;
    @Value("${spring.application.name}")
    String name ;

    @RequestMapping("/getMessage")
    public String getMessage(){
        System.out.println("getMessage is ok.");
        return "I am info from port("+port+") from application name("+name+") invoke other service." + "\n"
                +restfulService.getRestData();
    }
}
