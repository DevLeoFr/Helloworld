package com.example.Helloworld1;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.service.BusinessService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Helloworld1ApplicationTests {
	@Autowired
	private BusinessService bs;
	@Test
	void contextLoads() {
	}

	@Test
	public void testGetHelloWorld() {

		String expected = "Hello world";

		String result = bs.getHelloWorld().getValue();

		assertEquals(expected, result);
	}
}

