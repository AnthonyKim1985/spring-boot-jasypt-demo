package com.ru.rocker.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JasyptApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JasyptApplication.class, args);
		MyBean bean = context.getBean(MyBean.class);
		bean.printVariable();
	}
}
