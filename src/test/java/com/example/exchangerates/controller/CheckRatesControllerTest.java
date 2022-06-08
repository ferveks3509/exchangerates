package com.example.exchangerates.controller;

import com.example.exchangerates.client.GiphyClient;
import com.example.exchangerates.client.OpenExchangeRatesClient;
import com.example.exchangerates.service.ExchangeCurrencyService;
import com.example.exchangerates.service.GiphyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest()
class CheckRatesControllerTest {

    @Autowired
    private ExchangeCurrencyService exchangeCurrencyService;

    @MockBean
    private GiphyService giphyService;

    @MockBean
    private GiphyClient giphyClient;

    @MockBean
    private OpenExchangeRatesClient openExchangeRatesClient;


    @Test
    void getGiphy() throws Exception {

    }
}