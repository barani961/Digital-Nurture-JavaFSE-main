package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER =
			LoggerFactory.getLogger(OrmLearnApplication.class);

	private static CountryService countryService;

	public static void main(String[] args) {

		ApplicationContext context =
				SpringApplication.run(OrmLearnApplication.class,args);

		countryService = context.getBean(CountryService.class);

		LOGGER.info("Inside main");

		testGetAllCountries();
		testGetCountry();
		testAddCountry();
		testUpdateCountry();
		testDeleteCountry();
		testSearchCountry();

	}

	private static void testGetAllCountries() {

		LOGGER.info("Start");

		List<Country> countries =
				countryService.getAllCountries();

		LOGGER.debug("Countries={}",countries);

		LOGGER.info("End");
	}

	private static void testGetCountry() {

		LOGGER.info("Start");

		Country country =
				countryService.getCountry("IN");

		LOGGER.debug("Country={}",country);

		LOGGER.info("End");
	}

	private static void testAddCountry() {

		LOGGER.info("Start");

		Country country = new Country();

		country.setCode("NP");
		country.setName("Nepal");

		countryService.addCountry(country);

		LOGGER.info("Country Added");

		LOGGER.info("End");
	}

	private static void testUpdateCountry() {

		LOGGER.info("Start");

		Country country = countryService.getCountry("US");

		System.out.println(country);

		if (country == null) {
			LOGGER.error("US not found");
			return;
		}

		country.setName("United States of America");

		countryService.updateCountry(country);

		LOGGER.info("Country Updated");

		LOGGER.info("End");
	}

	private static void testDeleteCountry() {

		LOGGER.info("Start");

		countryService.deleteCountry("NP");

		LOGGER.info("Country Deleted");

		LOGGER.info("End");
	}

	private static void testSearchCountry() {

		LOGGER.info("Start");

		List<Country> countries =
				countryService.searchCountry("Ind");

		LOGGER.debug("Countries={}",countries);

		LOGGER.info("End");
	}

}