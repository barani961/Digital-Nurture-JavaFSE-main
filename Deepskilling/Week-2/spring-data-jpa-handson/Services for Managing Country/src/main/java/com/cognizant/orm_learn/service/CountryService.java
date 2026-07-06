package com.cognizant.orm_learn.service;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    @Transactional(readOnly = true)
    public List<Country> getAllCountries() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Country getCountry(String code) {
        return repository.findById(code).orElse(null);
    }

    @Transactional
    public void addCountry(Country country) {
        repository.save(country);
    }

    @Transactional
    public void updateCountry(Country country) {
        repository.save(country);
    }

    @Transactional
    public void deleteCountry(String code) {
        repository.deleteById(code);
    }

    @Transactional(readOnly = true)
    public List<Country> searchCountry(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }
}