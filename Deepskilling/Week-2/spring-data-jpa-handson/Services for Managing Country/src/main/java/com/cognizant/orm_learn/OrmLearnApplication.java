package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {
	public static void main(String[] args) {
		ApplicationContext context =
				SpringApplication.run(OrmLearnApplication.class,args);

		CountryService service =
				context.getBean(CountryService.class);

		System.out.println(service.getCountry("IN"));
		Country c = new Country("NP","Nepal");
		service.addCountry(c);
		Country d = new Country("IN","Republic of India");
		service.updateCountry(d);
		service.deleteCountry("NP");
		List<Country> countries =
				service.searchCountry("Ind");
		countries.forEach(System.out::println);
		
	}
}