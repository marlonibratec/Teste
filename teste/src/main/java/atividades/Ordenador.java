package atividades;

import java.util.ArrayList;

import interfaces.IOrdenador;

public class Ordenador implements IOrdenador {	
	/**
	 * Orienta��es:
	- Implemente-os um a um.
	- Quando um item da lista de Requisitos estiver OK (Implementado e com Testes), fa�a um Commit no seu Reposit�rio de Controle de Vers�es, 
	e somente ent�o passe para o pr�ximo item da lista de Requisitos)
	
	Requisitos
	1) Implementar uma classe Ordenador, que dever� Ordenar uma Cole��o de Valores	
	2) Esta dever� ser capaz de determinar qual foi o Maior Valor inserido na cole��o.	
	3) N�o dever� utilizar nenhuma Biblioteca, Classe ou M�todo, nem mesmo da API de Java.	
	4) M�todos que dever�o ser implementados:	
	5) O envio deve ser feito atrav�s um link do seu reposit�rio no GitHub ou outra ferramenta equivalente.
	6) Sugest�o de Tag a ser utilizada no GIT: - ATIV_01_JUnit_Ordenador*/
	private ArrayList<String> colecao;

	public void inserirColecao(ArrayList<String> pColecao) {
		this.colecao = pColecao;
		this.ordenar();		
	}
	
	/**
	4.1) void inserirColecao(Collection<String> pColecao);
	4.1.1) Dever� varrer a cole��o, e caso o valor lido na cole��o for maior que o Maior Valor atualmente armazenado, substituir este por aquele.*/
	public void ordenar() {
		/**Algor�tmo usado na ordena��o: Bubble sort
		 * Neste algor�tmo, fazemos uma itera��o comparando os valores das duas primeiras posi��es.
		 * Trocamos as posi��es destes dois valores se o primeiro for menor que o segundo.
		 * Ap�s esta etapa, fazemos a mesma compara��o com a segunda e terceira posi��es, e da mesma forma at� o final da cole��o.
		 * Como apenas uma itera��o pode n�o ser suficiente para ordenar toda a cole��o, ent�o devemos fazer tantas itera��es quantas posi��es
		 * existirem na cole��o.*/
		boolean sorted = false;
		int temp;
		
		while(!sorted) {
			sorted = true;
			
			for(int i = 0; i < this.getColecao().size() -1; i++) {
				if (Integer.parseInt(this.getColecao().get(i)) > Integer.parseInt(this.getColecao().get(i + 1))){
	                temp = Integer.parseInt(this.getColecao().get(i));
	                
	                this.getColecao().set(i, this.getColecao().get(i + 1));
	                this.getColecao().set(i + 1, String.valueOf(temp));
	                sorted = false;
	            }
			}
		}
	}

	/**
	4.2) void informarValor(String pValor);
	4.2.1) Se pValor for maior que o Maior Valor atualmente armazenado, substituir este por aquele.*/
	public void informarValor(String pValor) {		
		this.colecao.add(pValor);
		this.ordenar();
	}

	/**
	 * 	4.3) Double getMaiorValor();
		4.3.1) Dever� devolver o Maior Valor atualmente armazenado;*/
	public Double getMaiorValor(){
		return Double.valueOf(this.colecao.get(this.colecao.size() - 1));
	}

	/**
	 * 	4.4) Double getMenorValor();
		4.4.1) Dever� devolver o Menor Valor atualmente armazenado;*/
	public Double getMenorValor(){
		return Double.valueOf(this.colecao.get(0));
	}

	
	/**
	 * 	4.5) Double getValorMedio();
		4.5.1) Dever� devolver o Valor M�dio, gerado a partir da soma de todos os valores, e dividir pela quantidade de itens na cole��o, para obter o Valor M�dio da Cole��o;*/
	public Double getValorMedio() {
		double soma = 0;
		
		for(String item : this.colecao) {
			soma += Double.valueOf(item);
		}
		
		return soma / this.colecao.size();
	}

	/**
	 * 	4.6) Double getValorMediana();
		4.6.1) Dever� descobrir qual � o valor do meio da cole��o, se esta tiver uma quantidade de valores impar.
		4.6.2) Se for par, tirar a m�dia dos dois valores do meio da cole��o*/
	public Double getValorMediana() {
		int qtdValores = this.colecao.size();
		
		//se a quantidade de valores for �mpar
		if(qtdValores % 2 != 0) {
			int itemMeio = (qtdValores / 2);
			return Double.valueOf(this.colecao.get(itemMeio));
		}
		else {
			int itemMeio1 = (qtdValores / 2) - 1;
			int itemMeio2 = itemMeio1 + 1;
			double media = Double.valueOf(this.colecao.get(itemMeio1)) + Double.valueOf(this.colecao.get(itemMeio2));
			return media / 2;
		}
	}

	public ArrayList<String> getColecao() {
		return colecao;
	}
}