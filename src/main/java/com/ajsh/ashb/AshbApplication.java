package com.ajsh.ashb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AshbApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(AshbApplication.class, args);

		MyFirstService myFirstService = ctx.getBean(MyFirstService.class );
		System.out.println(myFirstService.getString());
	}

}
