package com.bms.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ResponseForSuccessTest {
	
	ResponseForSuccess response = new ResponseForSuccess();
@Test
public void ResponseForSuccess() {
	response.setMessage("ok");
	assertEquals("ok", response.getMessage());
}
}
