package atividade01;

import java.util.Collection;

public interface IOrdenador {
	void inserirColecao(Collection<String> pColecao);
	void informarValor(String pValor);
	Double getMaiorValor();
	Double getMenorValor();
	Double getValorMedio();
	Double getValorMediana();
}