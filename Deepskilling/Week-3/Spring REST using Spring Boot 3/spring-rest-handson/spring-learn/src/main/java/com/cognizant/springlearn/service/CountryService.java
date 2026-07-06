package com.cognizant.springlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.repository.CountryRepository;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    public List<Country> getAllCountries() {
        return repository.findAll();
    }

    public Country getCountry(String code) throws CountryNotFoundException {

        return repository.findById(code.toUpperCase())
                .orElseThrow(CountryNotFoundException::new);
    }

}