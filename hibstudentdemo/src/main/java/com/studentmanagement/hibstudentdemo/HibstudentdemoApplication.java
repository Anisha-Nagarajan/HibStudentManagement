package com.studentmanagement.hibstudentdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
@EnableAutoConfiguration(exclude=HibernateJpaAutoConfiguration.class)
public class HibstudentdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibstudentdemoApplication.class, args);
	}

}
