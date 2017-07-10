package com.hwz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ZhangZaipeng on 2017/7/9.
 */
@RestController
public class TestController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    String port;

    @Autowired
    private SchedualServiceUser schedualServiceUser;

    @Value("${foo}")
    String foo;

    @RequestMapping("/use_ribbon_say_hi")
    public String home() {
        String res = restTemplate.getForObject("http://SPRING-SERVICE-USER/user/hi",String.class);
        return "hi i am is:" + applicationName + ", i am from port:" +port + ", use_ribbon_say_hi --> " + res;
    }

    @RequestMapping("/use_feign_say_hi")
    public String home1() {
        return "hi i am is:" + applicationName + ", i am from port:" +port + ", use_feign_say_hi --> " + schedualServiceUser.sayHiFromClientOne();
    }

    @RequestMapping("/foo")
    public String foo() {
        return foo;
    }
}
