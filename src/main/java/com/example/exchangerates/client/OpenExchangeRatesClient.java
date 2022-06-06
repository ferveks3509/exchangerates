package com.example.exchangerates.client;

import com.example.exchangerates.model.CurrencyModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ratesCurrency", url = "${openexchangerates.api_url}")
public interface OpenExchangeRatesClient {

    @GetMapping("/historical/{date}.json")
    CurrencyModel getСurrencyByDate(@RequestParam String app_id,
                                    @PathVariable String date,
                                    @RequestParam String symbols);
}
