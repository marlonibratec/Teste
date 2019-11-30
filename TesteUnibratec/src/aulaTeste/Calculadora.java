package aulaTeste;

import aulaTeste.interfaces.ICalculadora;

public class Calculadora implements ICalculadora{

	@Override
	public double dividir(String v1, String v2) {
		double valor1 = Double.parseDouble(v1);
		double valor2 = Double.parseDouble(v2);
		
		return valor1 / valor2;
	}
}