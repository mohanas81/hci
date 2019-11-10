package com.anas.hci;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@MapperScan("com.anas.hci.repository")
public class HciApplication {

	public static void main(String[] args) {
		SpringApplication.run(HciApplication.class, args);
	}


}
