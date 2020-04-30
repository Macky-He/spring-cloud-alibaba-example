package com.macky.sentineldemo.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @Title class TestService
 * @Description: TODO
 * @Author Macky
 * @Date 2020/4/30
 */
@Service
public class TestService {

    /**
     *
     * 注解用来标识资源是否被限流、降级。上述例子上该注解的属性 sayHello 表示资源名。
     * @param name
     * @return java.lang.String
     **/
    @SentinelResource(value = "sayHello")
    public String sayHello(String name){
        return "Hello, "+  name;
    }
}
