package com.demo.school_app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication 
@ComponentScan(basePackages={"com.demo.school_app"})
@MapperScan(basePackages={"com.demo.school_app.mapper"})
public class Application {
	public static void main(String[] args) {  
		
        SpringApplication.run(Application.class, args);  
    }  
}
