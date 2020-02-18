package com.jiangxindc.webstatic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebStaticApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebStaticApplication.class, args);
		System.out.println("please open http://localhost:8080");
	}

}
