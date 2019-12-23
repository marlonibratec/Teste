package atividades;

import commons.Util;
import interfaces.IPalindromo;

public class Palindromo implements IPalindromo{
	/**
	 * Um Palindromo é uma frase que, lida da Esquerda para a Direita, ou vice-versa, apresenta a mesma ordem entre seus caracteres.
	- Exemplos: Ana, Arara, Ame o Poema, Após a Sopa, A Sacada da Casa, Luz Azul, Reviver
	
	Dada esta definição, você deverá
	
	1) Implementar uma Interface Palindromo
	
	2) Declarar um método boolean isPalindromo(String);
	
	3) Implementar Casos de Teste
	3.1) Positivos
	3.2) Negativos
	3.3) Exceção
	
	4) Use os conceitos do Princípio F.I.R.S.T., incluindo os 3 A's, indicando-os com Comentários. Procure também aplicar os conceitos de Classes de Equivalência.
	
	5) O envio deve ser feito através um link do seu repositório no GitHub ou outra ferramenta equivalente.
	
	6) Tag sugerida a ser utilizada no GIT:
	- ATIV_02_JUnit_Palindromo*/

	public Palindromo() {
		
	}

	public boolean isPalindromo(String palavra){
		
		//vamos remover todos os espaços vazios, caso o valor passado seja composto de mais de uma palavra
		palavra = palavra.replaceAll(" ", "");
		
		//vamos colocar todas as letras em maiúsculo, porque o método charAt é case sensitive
		palavra = palavra.toUpperCase();

		palavra = Util.removerAcentos(palavra);
		
		int j = palavra.length() - 1;			

		//fazemos uma verredura por todas as letras
		//e fazemos uma comparação dos caracteres, nos dois sentidos,
		//de frente para trás e de trás para frente.
		for(int i = 0; i < palavra.length() - 1; i++){
			if(palavra.charAt(i) != palavra.charAt(j)){
				return false;
			}

			j--;
		}

		return true;
	}
}