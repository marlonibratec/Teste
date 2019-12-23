package atividades;

import commons.Util;
import interfaces.IPalindromo;

public class Palindromo implements IPalindromo{
	/**
	 * Um Palindromo � uma frase que, lida da Esquerda para a Direita, ou vice-versa, apresenta a mesma ordem entre seus caracteres.
	- Exemplos: Ana, Arara, Ame o Poema, Ap�s a Sopa, A Sacada da Casa, Luz Azul, Reviver
	
	Dada esta defini��o, voc� dever�
	
	1) Implementar uma Interface Palindromo
	
	2) Declarar um m�todo boolean isPalindromo(String);
	
	3) Implementar Casos de Teste
	3.1) Positivos
	3.2) Negativos
	3.3) Exce��o
	
	4) Use os conceitos do Princ�pio F.I.R.S.T., incluindo os 3 A's, indicando-os com Coment�rios. Procure tamb�m aplicar os conceitos de Classes de Equival�ncia.
	
	5) O envio deve ser feito atrav�s um link do seu reposit�rio no GitHub ou outra ferramenta equivalente.
	
	6) Tag sugerida a ser utilizada no GIT:
	- ATIV_02_JUnit_Palindromo*/

	public Palindromo() {
		
	}

	public boolean isPalindromo(String palavra){
		
		//vamos remover todos os espa�os vazios, caso o valor passado seja composto de mais de uma palavra
		palavra = palavra.replaceAll(" ", "");
		
		//vamos colocar todas as letras em mai�sculo, porque o m�todo charAt � case sensitive
		palavra = palavra.toUpperCase();

		palavra = Util.removerAcentos(palavra);
		
		int j = palavra.length() - 1;			

		//fazemos uma verredura por todas as letras
		//e fazemos uma compara��o dos caracteres, nos dois sentidos,
		//de frente para tr�s e de tr�s para frente.
		for(int i = 0; i < palavra.length() - 1; i++){
			if(palavra.charAt(i) != palavra.charAt(j)){
				return false;
			}

			j--;
		}

		return true;
	}
}