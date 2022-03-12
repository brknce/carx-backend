package com.example.cardatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.cardatabase.domain.Car;
import com.example.cardatabase.domain.Owner;
import com.example.cardatabase.repository.CarRepository;
import com.example.cardatabase.repository.OwnerRepository;

@SpringBootApplication
public class CardatabaseApplication {
	@Autowired
	private CarRepository carRepository;

	@Autowired
	private OwnerRepository ownerRepository;

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
	}

	@Bean
	ApplicationRunner runner() {
		return args -> {
			// Save demo owner to database
			Owner owner1 = new Owner("John", "Johnson");
			Owner owner2 = new Owner("Mary", "Robinson");
			ownerRepository.save(owner1);
			ownerRepository.save(owner2);

			// Add car object with link to owners and save these to db.
			carRepository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2017, 59000, owner1));
			carRepository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2014, 29000, owner2));
			carRepository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2018, 39000, owner2));
		};
	}
}