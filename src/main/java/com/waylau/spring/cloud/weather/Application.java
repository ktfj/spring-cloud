package com.waylau.spring.cloud.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//该注解，让这个boot 成为注册中心
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
