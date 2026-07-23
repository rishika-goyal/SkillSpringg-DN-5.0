package com.cognizant.spring_learn.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.Country;

@RestController
public class CountryController {

    @RequestMapping("/country")
    @SuppressWarnings("resource") // This removes the yellow warning line
    public Country getCountryIndia() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        Country country = context.getBean("in", Country.class);

        return country;
    }
}