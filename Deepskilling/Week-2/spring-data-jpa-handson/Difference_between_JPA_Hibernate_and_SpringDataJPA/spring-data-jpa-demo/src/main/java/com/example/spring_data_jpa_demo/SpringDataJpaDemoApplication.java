package com.example.spring_data_jpa_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.spring_data_jpa_demo.model.Employee;
import com.example.spring_data_jpa_demo.service.EmployeeService;

@SpringBootApplication
public class SpringDataJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner run(EmployeeService service) {
		return args -> {
			service.addEmployee(new Employee("Mojo"));
			System.out.println("Employee Saved Successfully!");
		};
	}
}