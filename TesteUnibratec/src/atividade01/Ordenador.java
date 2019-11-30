package atividade01;

import java.util.ArrayList;

public class Ordenador implements IOrdenador {	
	private ArrayList<String> colecao;
		
	@Override
	public void inserirColecao(ArrayList<String> pColecao) {
		int temp = 0;
		int i = 0;
		boolean next = false;
		
		while(next){
			int numAtual = Integer.parseInt(pColecao.get(i));
			
			if(numAtual > temp){
				
			}
			i++;
		}
		
		for(String item : pColecao){
			int numAtual = Integer.parseInt(item);
			
			if(numAtual > temp){
				temp = numAtual;
			}
		}
	}

	@Override
	public void informarValor(String pValor) {
		// TODO Auto-generated method stub

	}

	@Override
	public Double getMaiorValor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getMenorValor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getValorMedio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getValorMediana() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<String> getColecao() {
		return colecao;
	}

	public void setColecao(ArrayList<String> colecao) {
		this.colecao = colecao;
	}
}