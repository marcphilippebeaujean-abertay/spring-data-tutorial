package com.example.jpatutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaTutorialApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(JpaTutorialApplication.class, args);
		CityRepository cityRepository = applicationContext.getBean(CityRepository.class);

		City berlin = new City("Berlin", true);
		cityRepository.save(berlin);

		City dusseldorf = new City("Duesseldorf", false);
		cityRepository.save(dusseldorf);

		City queriedCity = cityRepository.findByName("asdfasdf");
		System.out.println(queriedCity == null);
	}

}
