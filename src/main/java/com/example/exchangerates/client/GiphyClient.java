package com.example.exchangerates.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "giphy", url = "${giphy.api_url}")
public interface GiphyClient {

    @GetMapping("/random")
    String getRandomGiphy(@RequestParam String api_key,
                              @RequestParam String tag,
                              @RequestParam String rating);

}
