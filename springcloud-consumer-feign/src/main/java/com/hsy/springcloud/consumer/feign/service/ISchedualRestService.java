package com.hsy.springcloud.consumer.feign.service;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path springboot.demo/com.hsy.springboot.demo.springboot.jdbc
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
//@FeignClient(name = "springcloud-producer-rest", fallback = ISchedualRestServiceFallback.class)
@FeignClient(value = "springcloud-producer-rest",fallback = SchedualRestServiceHystrix.class)
public interface ISchedualRestService {

    //@GetMapping("/api/rest/crm/user/v1/login")
    //String infos1() ;

    @GetMapping("/api/rest/info")
    String infos() ;

}
