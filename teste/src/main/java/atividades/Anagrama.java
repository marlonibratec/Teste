package atividades;

import interfaces.IAnagrama;

public class Anagrama implements IAnagrama{
	/**
	 * Um Anagrama é uma palavra ou frase que, modificada a ordem de seus caracteres, é igual a uma outra palavra ou frase.. Exemplos:

		Amor <-> Roma
		Voa <-> Avo
		Moça <-> Maço
		Ola <-> Alo
		Pedra <-> Perda
		Calo <-> Cola
		
		
		Dada esta definição, você deverá
		
		1) Implementar uma Interface Anagrama
		2) Declarar um método boolean isAnagramas(String, String);
		3) Implementar Casos de Teste
		3.1) Positivos
		3.2) Negativos
		3.3) Exceção
		
		4) Use os conceitos do Princípio F.I.R.S.T., incluindo os 3 A's, indicando-os com Comentários. Procure também aplicar os conceitos de Classes de Equivalência.
		
		5) O envio deve ser feito através um link do seu repositório no GitHub ou outra ferramenta equivalente.
		
		6) Crie um Pacote específico para esta Atividade, contendo a numeração 03:
		
		7) Tag sugerida a ser utilizada no GIT:
		- ATIV_03_JUnit_Anagrama
		
		8) Envie o Link do Commit final como resposta desta Atividade*/

	public boolean isAnagramas(String p1, String p2) {
		//setando as duas palavras para caixa alta.
		p1 = p1.toUpperCase();
		p2 = p2.toUpperCase();

		//se as duas palavras não têm o mesmo tamanho, já não são um anagrama
		if(p1.length() != p2.length()) {
			return false;
		}
		else {
			//varrendo todas as letras da primeira palavra
			for(int i = 0; i < p1.length() - 1; i++) {
								
				//verificando se a letra lida na iteração existe na segunda palavra 
				int index = p2.indexOf(p1.charAt(i));
				
				//se existir, vamos remover a letra da segunda palavra
				if(index != -1){
					p2 = p2.replace(p1.charAt(i), " ".charAt(0));
				}
				else {
					//se não existir, já podemos dizer que as duas palavras não são anagrama
					return false;
				}
			}
		}
		
		return true;
	}
}