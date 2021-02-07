package com.example.springEvent;

import com.example.springEvent.service.FaceHandler;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	FaceHandler faceHandler;
	@Test
	void contextLoads() {
		faceHandler.handle();
	}

}
