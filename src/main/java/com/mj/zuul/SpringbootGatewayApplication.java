package com.mj.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableZuulProxy
@SpringBootApplication
public class SpringbootGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGatewayApplication.class, args);
	}
}
