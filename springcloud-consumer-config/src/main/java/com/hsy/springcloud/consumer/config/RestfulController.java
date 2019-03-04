package com.hsy.springcloud.consumer.config;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人 steffens
 * @创建时间 2019/3/3
 * @描述 文件创建
 */
@RestController
@RequestMapping(value = "/api/rest")
public class RestfulController {

    @Value("${user.name}")
    String name;
    @Value("${user.age}")
    String age;

    @GetMapping("/name")
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public String getName() {
        System.out.println("name-->age===========>ok");
        return name + "---:" + age;
    }

    public String processHystrix_Get() {
        return "Hystrix is error.";
    }
}
