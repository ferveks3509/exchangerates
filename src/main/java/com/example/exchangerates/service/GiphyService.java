package com.example.exchangerates.service;

import com.example.exchangerates.client.GiphyClient;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GiphyService {

    private GiphyClient giphyClient;

    public GiphyService(GiphyClient giphyClient) {
        this.giphyClient = giphyClient;
    }

    @Value("${giphy.api_key}")
    private String api_key;

    @Value("${giphy.rating}")
    private String rating;

    public String getGiphyUrl(String tag) {
        JsonNode jsonNode = null;
        try {
           jsonNode = new ObjectMapper().readTree(giphyClient.getRandomGiphy(api_key, tag, rating));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        String url = jsonNode.get("data")
                .get("images")
                .get("fixed_height_downsampled")
                .get("url").asText();
        return url;
    }
}
