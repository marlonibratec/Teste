package atividade01;

import java.util.ArrayList;

public interface IOrdenador {
	void inserirColecao(ArrayList<String> pColecao);
	void informarValor(String pValor);
	Double getMaiorValor();
	Double getMenorValor();
	Double getValorMedio();
	Double getValorMediana();
}