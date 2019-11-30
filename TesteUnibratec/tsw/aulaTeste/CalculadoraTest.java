package aulaTeste;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testDividir10Por1() {
		Calculadora calc = new Calculadora();
		
		double result = calc.dividir("10", "1");
		assertEquals(10, result, 0);		
	}
	
	@Test
	public void testDividir1Por10(){
		Calculadora calc = new Calculadora();
		
		double result = calc.dividir("1", "10");
		assertEquals(0.1, result, 0);
	}
	
	@Test
	public void testDividir257Por529(){
		Calculadora calc = new Calculadora();
		
		double result = calc.dividir("2.57", "5.29");
		assertEquals(0.48, result, 0.006);
	}
}