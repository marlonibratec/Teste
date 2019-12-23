package aulaMockito;

import commons.Util;
import interfaces.IConversorValores;

public class ConversorValores implements IConversorValores{	
	
	public String converterValor(String v){
		return Util.formataMoedaSemTipo(v);
	}
}