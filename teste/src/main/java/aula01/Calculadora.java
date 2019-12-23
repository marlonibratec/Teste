package aula01;

import interfaces.ICalculadora;

public class Calculadora implements ICalculadora{

	public double dividir(String v1, String v2) {
		double valor1 = Double.parseDouble(v1);
		double valor2 = Double.parseDouble(v2);
		
		return valor1 / valor2;
	}
}