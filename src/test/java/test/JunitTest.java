package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTest {

	@Test
	public void testMultiply() {
		Codeclass test = new Codeclass();
				int result = test.multiply(3,4);
				System.out.println(result);
				assertEquals(12,result);
	
	}

}
