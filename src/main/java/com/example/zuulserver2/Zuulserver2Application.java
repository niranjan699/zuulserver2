package com.example.zuulserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;



@EnableZuulProxy
@EnableHystrixDashboard

@SpringBootApplication
public class Zuulserver2Application {

	public static void main(String[] args) {
		SpringApplication.run(Zuulserver2Application.class, args);
	}

}
