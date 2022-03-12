package com.example.cardatabase.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.cardatabase.domain.Car;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Long> {
	// fetch cars by brand
	List<Car> findByBrand(@Param("brand") String brand);

	// fetch cars by color
	List<Car> findByColor(@Param("color") String color);

	// fetch cars by model
	List<Car> findByModel(@Param("model") String model);

	// fetch cars by brand and model
	List<Car> findByBrandAndModel(@Param("brand") String brand, @Param("model") String model);

	// fetch cars by brand or color
	List<Car> findByBrandOrColor(@Param("brand") String brand, @Param("color") String color);

	// Fetch cars by brand and sort by year
	List<Car> findByBrandOrderByYearAsc(@Param("brand") String brand);
}
