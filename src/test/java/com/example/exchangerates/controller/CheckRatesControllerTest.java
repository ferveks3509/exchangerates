package com.example.exchangerates.controller;

import com.example.exchangerates.service.ExchangeCurrencyService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest()
class CheckRatesControllerTest {

    @MockBean
    ExchangeCurrencyService exchangeCurrencyService;

    @Autowired
    CheckRatesController checkRatesController;

    @Test
    void getGiphy() throws Exception {
        Mockito.when(exchangeCurrencyService.findGiphy())
                .thenReturn("https://media4.giphy.com/media/xT8qB4foF1nxHZwpLa/" +
                        "200_d.gif?cid=5ca48bbb398139643468517e16e41d451697e8137115e626&rid=200_d.gif&ct=g");

        assertEquals(checkRatesController.getGiphy(), "https://media4.giphy.com/media/xT8qB4foF1nxHZwpLa/" +
                "200_d.gif?cid=5ca48bbb398139643468517e16e41d451697e8137115e626&rid=200_d.gif&ct=g");
    }
}