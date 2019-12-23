package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import atividades.Anagrama;

public class AnagramaTest {
	
	@Test
	public void isAnagramaTest() {
		/* Amor <-> Roma
			Voa <-> Avo
			Moça <-> Maço
			Ola <-> Alo
			Pedra <-> Perda
			Calo <-> Cola*/
		
		Anagrama anagrama = new Anagrama();

		boolean resultado = anagrama.isAnagramas("pedra", "perda");
		
		assertEquals(true, resultado);
	}
}