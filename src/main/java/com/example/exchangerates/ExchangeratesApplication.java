package com.example.exchangerates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
public class ExchangeratesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExchangeratesApplication.class, args);
	}
	//6e8c12cd4abe4d98814044f3ebfd9501

}
