package com.Ulearn.PackageService;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UlearnDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UlearnDemoApplication.class, args);
		
		Date date=new Date();
		SimpleDateFormat dateFormat=new SimpleDateFormat("DD-MM-YYYY HH:MM:SS");
		System.out.println(dateFormat.format(date));
	}

}
