package com.example.devopsdemo3;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
@SpringBootTest
class BasicCalculationTest {
	BasicCalculation basicCalculation = new BasicCalculation();
	@Test
	void testSum() {
		
		assertNotNull(basicCalculation.sum(5, 5));
		//fail("Not yet implemented");
	}

	@Test
	void testSubtraction() {
		assertNotNull(basicCalculation.subtraction(5, 5));
		//fail("Not yet implemented");
	}

	@Test
	void testMultiply() {
		assertNotNull(basicCalculation.multiply(5, 5));
		//fail("Not yet implemented");
	}

	@Test
	void testDevide() {
		assertNotNull(basicCalculation.devide(5, 5));
		//fail("Not yet implemented");
	}

}
