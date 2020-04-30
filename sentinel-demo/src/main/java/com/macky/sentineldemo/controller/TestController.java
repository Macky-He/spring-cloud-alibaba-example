package com.macky.sentineldemo.controller;

import com.macky.sentineldemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title class TestController
 * @Description: TODO
 * @Author Macky
 * @Date 2020/4/30
 */
@RestController
public class TestController {

    @Autowired
    private TestService service;

    @RequestMapping(value = "/hello")
    public String sayHello(@RequestParam(value = "name") String name) {
        return service.sayHello(name);
    }
}
