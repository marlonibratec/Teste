package aulaMockito;

import java.math.BigDecimal;

import commons.Moedas;
import interfaces.IConversorCambio;

public class ConversorCambio implements IConversorCambio {
	private static BigDecimal taxa = new BigDecimal(4);
	private ConversorValores conversorValor;
	
	public ConversorCambio(ConversorValores pConversorValor) {
		this.conversorValor = pConversorValor;
	}

	public String converter(String v, Moedas moedaDestino) {
		v = this.conversorValor.converterValor(v);

		BigDecimal vOriginal = new BigDecimal(v);
		BigDecimal vConvertido = new BigDecimal(0);

		switch (moedaDestino){
			case REAL:
				vConvertido = vOriginal.divide(taxa);				
				v = "R$ " + vConvertido.toString();
				break;

			case DOLAR:
				vConvertido = vOriginal.multiply(taxa);
				v = "US$ " + vConvertido.toString();
		}

		return v;
	}	
}