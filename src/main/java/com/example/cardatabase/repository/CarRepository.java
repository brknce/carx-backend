package com.example.cardatabase.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cardatabase.domain.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
	// fetch cars by brand
	List<Car> findByBrand(String brand);

	// fetch cars by color
	List<Car> findByColor(String color);

	// fetch cars by model
	List<Car> findByModel(String model);

	// fetch cars by brand and model
	List<Car> findByBrandAndModel(String brand, String model);

	// fetch cars by brand or color
	List<Car> findByBrandOrColor(String brand, String color);
	
	// Fetch cars by brand and sort by year
	List<Car> findByBrandOrderByYearAsc(String brand);
}
