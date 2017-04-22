package helloMaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest {
	
	@Test
	public void shouldreturnTrue(){

	Demo demo = new Demo();
	assertTrue(demo.getBoolean());
}
}
