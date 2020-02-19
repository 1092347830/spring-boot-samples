package com.jiangxindc.freemarker;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FreeMarkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreeMarkerApplication.class, args);
		System.out.println("open http://localhost:8080");
	}

}
