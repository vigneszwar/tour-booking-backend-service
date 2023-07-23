package com.system.TourBookingSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@Configuration
@SpringBootApplication
public class TourBookingSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(TourBookingSystemApplication.class, args);

		RestTemplate rest = new RestTemplate();

		String baseurl = "localhost:8080";

		ResponseEntity<String> response = rest.getForEntity(baseurl + "/adventure", String.class);
		String adventureImageUrl = response.getBody();
//        System.out.print("Adventure Image URL: " + adventureImageUrl);

		// Call the "Nature" method from activityconfiguration class
		ResponseEntity<String> natureResponse = rest.getForEntity(baseurl + "/nature", String.class);
		String natureImageUrl = natureResponse.getBody();
//        System.out.println("Nature Image URL: " + natureImageUrl);

		// Call the "HillStation" method from activityconfiguration class
		ResponseEntity<String> hillsResponse = rest.getForEntity(baseurl + "/hills", String.class);
		String hillsImageUrl = hillsResponse.getBody();
//        System.out.println("Hill Station Image URL: " + hillsImageUrl);
	}
	@Bean
	public RestTemplate rest(RestTemplateBuilder builder){
		return builder.build();
	}

}

