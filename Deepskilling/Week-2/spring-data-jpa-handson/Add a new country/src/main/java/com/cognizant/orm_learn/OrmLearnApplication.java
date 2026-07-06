package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication
public class OrmLearnApplication {
	private static final Logger LOGGER =
			LoggerFactory.getLogger(OrmLearnApplication.class);
	private static CountryService countryService;

	private static void testAddCountry() {
		LOGGER.info("Start");
		Country country = new Country("NP", "Nepal");
		countryService.addCountry(country);
		try {
			Country result = countryService.findCountryByCode("NP");
			LOGGER.info("Country Added: {}", result);
		}
		catch (CountryNotFoundException e) {
			LOGGER.error(e.getMessage());
		}
		LOGGER.info("End");
	}
	public static void main(String[] args) {
		ApplicationContext context =
				SpringApplication.run(OrmLearnApplication.class, args);
		countryService = context.getBean(CountryService.class);
		testAddCountry();
	}
}