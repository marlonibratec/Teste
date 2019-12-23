package mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import aulaMockito.ConversorValores;

public class ConversorValoresTest {

	@Test
	public void testConverterValor() {
		String valorUsuario = "R$ 5.432,10";
		String valorEsperado = "5432.10";
		
		ConversorValores conversor = new ConversorValores();
		String valorConvertido = conversor.converterValor(valorUsuario);
		
		assertEquals(valorEsperado, valorConvertido);
	}
}