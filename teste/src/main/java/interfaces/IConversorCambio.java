package interfaces;

import commons.Moedas;

public interface IConversorCambio {
	/**@param v: 		valor a ser convertido
	 * @param moeda:	moeda para a qual o valor será convertido */
	public String converter(String v, Moedas moeda);
}