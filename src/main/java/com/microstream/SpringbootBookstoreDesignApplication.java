package com.microstream;

import com.microstream.model.FullName;
import com.microstream.model.MicroStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.microstream.serviceImpl.BookstoreCRUDServiceImpl;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringbootBookstoreDesignApplication implements CommandLineRunner {

	@Autowired
	BookstoreCRUDServiceImpl bookstoreCRUDServiceImpl;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBookstoreDesignApplication.class, args);
		System.out.println("Hello world!");
		System.out.println("Hello devtools");
		System.out.println("Hello devtool2");
		System.out.println("Hello devtool3");
		System.out.println("Hello devtool4");
		System.out.println("Hello devtool5");
		System.out.println("Hello devtool6");
	}

	@Override
	public void run(String... args) throws Exception {
		MicroStream microStream = MicroStream.builder().courseName("Spring Boot")
				.courseType("IT")
				.instructorName(
						FullName.builder().firstName("Samarth").lastName("Narula").build()).build();
		System.out.println("microStream: " + microStream);
	}

}
