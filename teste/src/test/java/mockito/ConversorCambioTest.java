package mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import aulaMockito.ConversorCambio;
import aulaMockito.ConversorValores;
import commons.Moedas;

public class ConversorCambioTest {

	@Test
	public void testConverter() {
		String valorUsuario = "R$ 5.432,10";
		String valorEsperado = "US$ 21728.40";
		
		ConversorCambio conversor = new ConversorCambio(new ConversorValores());
		String valorConvertido = conversor.converter(valorUsuario, Moedas.DOLAR);

		assertEquals(valorEsperado, valorConvertido);
	}

	
	@Test
	public void testConverterCambioMock() {
		String valorUsuario = "R$ 5.432,10";
		String valorUsuarioSemForm = "5432.10";
		String valorEsperado = "US$ 21728.40";
		
		ConversorValores conversorFalso = mock(ConversorValores.class);
		when(conversorFalso.converterValor(valorUsuario)).thenReturn(valorUsuarioSemForm);
		
		ConversorCambio conversor = new ConversorCambio(conversorFalso);
		String valorConvertido = conversor.converter(valorUsuario, Moedas.DOLAR);

		assertEquals(valorEsperado, valorConvertido);
	}
}