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
    private RestTemplate RestTemplate;

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home() {
        return "hi i am is:" + applicationName + ",i am from port:" +port;
    }
}
