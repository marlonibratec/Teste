package interfaces;

import commons.Moedas;

public interface IConversorCambio {
	/**@param v: 		valor a ser convertido
	 * @param moeda:	moeda para a qual o valor ser� convertido */
	public String converter(String v, Moedas moeda);
}