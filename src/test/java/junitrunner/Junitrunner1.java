package junitrunner;

import static org.junit.Assert.*;

import org.junit.Test;

import restassured.TC1;

public class Junitrunner1 {

	@Test
	public void test() {
		
		TC1 get1 = new TC1();
		
	    @SuppressWarnings("unused")
		String getresponsevalue = get1.getweatherdetails();
	   
	}

}
