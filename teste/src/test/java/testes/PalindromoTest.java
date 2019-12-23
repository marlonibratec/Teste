package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import atividades.Palindromo;

public class PalindromoTest {

	@Test
	public void testIsPalindromo() {
		Palindromo palindromo = new Palindromo();
		
		String p1 = "A Sacada da Casa";
		String p2 = "Ana";
		String p3 = "Arara";
		String p4 = "Ame o Poema";
		String p5 = "Após a Sopa";
		String p6 = "A Sacada da Casa";
		String p7 = "Luz Azul";
		String p8 = "Reviver";

		assertEquals(true, palindromo.isPalindromo(p8));
	}
}