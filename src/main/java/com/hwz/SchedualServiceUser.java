package com.hwz;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ZhangZaipeng on 2017/7/10 0010.
 * 通过@ FeignClient（“服务名”），来指定调用哪个服务：
 */
@FeignClient(value = "spring-service-user")
public interface SchedualServiceUser {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne();
}
