package atividades;

import java.util.ArrayList;

import interfaces.IOrdenador;

public class Ordenador implements IOrdenador {	
	/**
	 * Orientações:
	- Implemente-os um a um.
	- Quando um item da lista de Requisitos estiver OK (Implementado e com Testes), faça um Commit no seu Repositório de Controle de Versões, 
	e somente então passe para o próximo item da lista de Requisitos)
	
	Requisitos
	1) Implementar uma classe Ordenador, que deverá Ordenar uma Coleção de Valores	
	2) Esta deverá ser capaz de determinar qual foi o Maior Valor inserido na coleção.	
	3) Não deverá utilizar nenhuma Biblioteca, Classe ou Método, nem mesmo da API de Java.	
	4) Métodos que deverão ser implementados:	
	5) O envio deve ser feito através um link do seu repositório no GitHub ou outra ferramenta equivalente.
	6) Sugestão de Tag a ser utilizada no GIT: - ATIV_01_JUnit_Ordenador*/
	private ArrayList<String> colecao;

	public void inserirColecao(ArrayList<String> pColecao) {
		this.colecao = pColecao;
		this.ordenar();		
	}
	
	/**
	4.1) void inserirColecao(Collection<String> pColecao);
	4.1.1) Deverá varrer a coleção, e caso o valor lido na coleção for maior que o Maior Valor atualmente armazenado, substituir este por aquele.*/
	public void ordenar() {
		/**Algorítmo usado na ordenação: Bubble sort
		 * Neste algorítmo, fazemos uma iteração comparando os valores das duas primeiras posições.
		 * Trocamos as posições destes dois valores se o primeiro for menor que o segundo.
		 * Após esta etapa, fazemos a mesma comparação com a segunda e terceira posições, e da mesma forma até o final da coleção.
		 * Como apenas uma iteração pode não ser suficiente para ordenar toda a coleção, então devemos fazer tantas iterações quantas posições
		 * existirem na coleção.*/
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
		4.3.1) Deverá devolver o Maior Valor atualmente armazenado;*/
	public Double getMaiorValor(){
		return Double.valueOf(this.colecao.get(this.colecao.size() - 1));
	}

	/**
	 * 	4.4) Double getMenorValor();
		4.4.1) Deverá devolver o Menor Valor atualmente armazenado;*/
	public Double getMenorValor(){
		return Double.valueOf(this.colecao.get(0));
	}

	
	/**
	 * 	4.5) Double getValorMedio();
		4.5.1) Deverá devolver o Valor Médio, gerado a partir da soma de todos os valores, e dividir pela quantidade de itens na coleção, para obter o Valor Médio da Coleção;*/
	public Double getValorMedio() {
		double soma = 0;
		
		for(String item : this.colecao) {
			soma += Double.valueOf(item);
		}
		
		return soma / this.colecao.size();
	}

	/**
	 * 	4.6) Double getValorMediana();
		4.6.1) Deverá descobrir qual é o valor do meio da coleção, se esta tiver uma quantidade de valores impar.
		4.6.2) Se for par, tirar a média dos dois valores do meio da coleção*/
	public Double getValorMediana() {
		int qtdValores = this.colecao.size();
		
		//se a quantidade de valores for ímpar
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