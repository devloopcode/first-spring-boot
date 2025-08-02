package com.ajsh.ashb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AshbApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(AshbApplication.class, args);

		MyFirstClass myFirstClass = ctx.getBean("myBean", MyFirstClass.class);
		System.out.println(myFirstClass.sayHey());
	}

}
