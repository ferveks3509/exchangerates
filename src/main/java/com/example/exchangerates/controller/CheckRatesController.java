package com.example.exchangerates.controller;

import com.example.exchangerates.service.ExchangeCurrencyService;
import com.example.exchangerates.service.GiphyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckRatesController {

   private final ExchangeCurrencyService exchangeCurrencyService;
   private final GiphyService giphyService;

    public CheckRatesController(ExchangeCurrencyService exchangeCurrencyService, GiphyService giphyService) {
        this.exchangeCurrencyService = exchangeCurrencyService;
        this.giphyService = giphyService;
    }

    @GetMapping("/giphy")
    public String getGiphy() {
        return exchangeCurrencyService.findGiphy();
    }
}
