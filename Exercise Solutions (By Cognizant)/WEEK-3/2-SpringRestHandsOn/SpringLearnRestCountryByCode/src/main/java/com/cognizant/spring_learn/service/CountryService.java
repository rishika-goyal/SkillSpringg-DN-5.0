package com.cognizant.spring_learn.service;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.CountryList;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@Service
public class CountryService {

    public Country getCountry(String code) {

        XmlMapper xmlMapper = new XmlMapper();

        try {

            InputStream inputStream =
                    new ClassPathResource("country.xml").getInputStream();

            CountryList countryList =
                    xmlMapper.readValue(inputStream, CountryList.class);

            for (Country country : countryList.getCountryList()) {

                if (country.getCode().equalsIgnoreCase(code)) {
                    return country;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}