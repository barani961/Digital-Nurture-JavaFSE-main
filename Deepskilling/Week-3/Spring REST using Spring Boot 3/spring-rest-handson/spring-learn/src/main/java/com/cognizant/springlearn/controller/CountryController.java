package com.cognizant.springlearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@RestController
public class CountryController {

    @Autowired
    private CountryService service;

    @RequestMapping("/country")
    public Country getCountry() throws CountryNotFoundException {

        return service.getCountry("IN");
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {

        return service.getAllCountries();
    }

    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code)
            throws CountryNotFoundException {

        return service.getCountry(code);
    }
}