package com.venu;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyRestControllerTest {

	@Test
	public void testHello( ) {
		
		MyRestController controller = new MyRestController();
		assertEquals("Hello! This is a simple Rest Service Example.......", controller.sayHello() );
	}
	
}
