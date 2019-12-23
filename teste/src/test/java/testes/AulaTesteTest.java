package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import aula01.AulaTeste;

public class AulaTesteTest {

	@Test
	public void testTeste1() {
		AulaTeste at = new AulaTeste();
		String resultado = at.Teste1();
		
		assertEquals("teste1", resultado);
	}
}