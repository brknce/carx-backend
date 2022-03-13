package com.example.cardatabase;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.cardatabase.controller.CarController;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class CardatabaseApplicationTests {
	
	@Autowired
	private CarController carController;

	@Test
	void contextLoads() {
		assertThat(carController).isNotNull();
	}

}
