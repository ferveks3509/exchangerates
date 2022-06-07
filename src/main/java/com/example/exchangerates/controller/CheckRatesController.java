package com.example.exchangerates.controller;

import com.example.exchangerates.service.ExchangeCurrencyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckRatesController {

   private final ExchangeCurrencyService exchangeCurrencyService;

    public CheckRatesController(ExchangeCurrencyService exchangeCurrencyService) {
        this.exchangeCurrencyService = exchangeCurrencyService;
    }

    @GetMapping("/giphy")
    public String getGiphy() {
        return exchangeCurrencyService.findGiphy();
    }
}
