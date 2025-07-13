package com.cognizant.GetCountryCode.service;
import com.cognizant.springlearn.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
public class CountryService {

    @Service
    public class CountryService {

        public Country getCountry(String code) {
            ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
            List<Country> countries = (List<Country>) context.getBean("countryList");

            // Find matching country (case-insensitive)
            return countries.stream()
                    .filter(c -> c.getCode().equalsIgnoreCase(code))
                    .findFirst()
                    .orElse(null);  // or throw exception if not found
        }
    }
}

