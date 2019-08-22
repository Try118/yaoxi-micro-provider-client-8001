package com.yx.demo;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication//@EnableEurekaClient//微服务
@EnableEurekaClient
@MapperScan(basePackages = {"com.yx.demo.mapper"})
public class YaoxiMicroProviderClient8001Application {

	public static void main(String[] args) {
		SpringApplication.run(YaoxiMicroProviderClient8001Application.class, args);
	}

}
