package com.hwz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringServiceOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringServiceOrderApplication.class, args);
	}

	/**
	 * 注册了一个bean: restTemplate;
	 * 通过@ LoadBalanced注册表明
	 * ，这个restRemplate是负载均衡的
	 */
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
