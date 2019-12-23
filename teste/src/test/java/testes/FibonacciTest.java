package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import atividades.Fibonacci;

public class FibonacciTest {

	@Test
	public void testFibo() {
		
		/* 1 - 0, 
		 * 2 - 1, 
		 * 3 - 1, 
		 * 4 - 2, 
		 * 5 - 3, 
		 * 6 - 5, 
		 * 7 - 8, 
		 * 8 - 13, 
		 * 9 - 21, 
		 * 10 - 34, 
		 * 11 - 55, 
		 * 12 - 89, 
		 * 13 - 144, 
		 * 14 - 233, 
		 * 15 - 377, 
		 * 16 - 610, 
		 * 17 - 987, 
		 * 18 - 1597, 
		 * 19 - 2584*/
		
		Fibonacci fibonacci = new Fibonacci();
		long resultado = fibonacci.getNumeroFibonacci(19);
		assertEquals(2584, resultado);
	}
}