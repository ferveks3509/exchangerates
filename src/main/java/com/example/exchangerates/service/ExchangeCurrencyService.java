package com.example.exchangerates.service;

import com.example.exchangerates.client.OpenExchangeRatesClient;
import com.example.exchangerates.model.CurrencyModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class ExchangeCurrencyService {

    private final OpenExchangeRatesClient openExchangeRatesClient;
    private final GiphyService giphyService;

    public ExchangeCurrencyService(OpenExchangeRatesClient openExchangeRatesClient, GiphyService giphyService) {
        this.openExchangeRatesClient = openExchangeRatesClient;
        this.giphyService = giphyService;
    }

    @Value("${openexchangerates.app_id}")
    private String app_id;

    @Value("${openexchangerates.symbols}")
    private String symbols;

    public String findGiphy() {
        String giphyUrl = giphyService.getGiphyUrl(checkValueCurrency());
        return "<img src=\"" + giphyUrl + "\" width=300/>";
    }

    public String checkValueCurrency() {
        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String yesterday = LocalDate.now().minusDays(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        CurrencyModel currencyToday = openExchangeRatesClient.getСurrencyByDate(app_id, today, symbols);
        CurrencyModel currencyYesterday = openExchangeRatesClient.getСurrencyByDate(app_id, yesterday, symbols);

        Double resultToday = currencyToday.getRates().get(symbols);
        Double resultYesterday = currencyYesterday.getRates().get(symbols);
        if (resultToday > resultYesterday) {
            return "rich";
        } else {
            return "broke";
        }
    }
}
