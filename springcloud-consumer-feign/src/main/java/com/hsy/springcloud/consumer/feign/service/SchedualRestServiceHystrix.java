package com.hsy.springcloud.consumer.feign.service;

import org.springframework.stereotype.Service;

/**
 * @创建人 steffens
 * @创建时间 2019/3/3
 * @描述 文件创建
 */
@Service(value = "schedualRestService")
public class SchedualRestServiceHystrix implements ISchedualRestService{

    @Override
    public String infos() {
        return "error,this is Hystrix return";
    }
}