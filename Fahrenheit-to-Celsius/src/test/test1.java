package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Conversao;



public class test1 {
	
	
	@Test
	
	public void fahrenParaCelsius() {
		Conversao conver = new Conversao();
	assertEquals(100, conver.Celsius(212));
	assertEquals(0,conver.Celsius(32));
	assertEquals(10,conver.Celsius(50));
	}
}
