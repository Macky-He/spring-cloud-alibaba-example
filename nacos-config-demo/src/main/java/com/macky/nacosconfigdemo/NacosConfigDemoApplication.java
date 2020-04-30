package com.macky.nacosconfigdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class NacosConfigDemoApplication {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext run = SpringApplication.run(NacosConfigDemoApplication.class, args);
        while (true) {
            String userName = run.getEnvironment().getProperty("user.name");
            String userAge = run.getEnvironment().getProperty("user.age");
            String test = run.getEnvironment().getProperty("test");
            //获取当前部署的环境
            String currentEnv = run.getEnvironment().getProperty("current.env");
            System.err.println("in " + currentEnv + " enviroment; " + "user name :" + userName + "; age: " + userAge + ";" + "test:" + test);
            TimeUnit.SECONDS.sleep(1);
        }
    }

}
