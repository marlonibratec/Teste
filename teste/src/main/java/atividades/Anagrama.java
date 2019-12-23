package atividades;

import interfaces.IAnagrama;

public class Anagrama implements IAnagrama{
	/**
	 * Um Anagrama � uma palavra ou frase que, modificada a ordem de seus caracteres, � igual a uma outra palavra ou frase.. Exemplos:

		Amor <-> Roma
		Voa <-> Avo
		Mo�a <-> Ma�o
		Ola <-> Alo
		Pedra <-> Perda
		Calo <-> Cola
		
		
		Dada esta defini��o, voc� dever�
		
		1) Implementar uma Interface Anagrama
		2) Declarar um m�todo boolean isAnagramas(String, String);
		3) Implementar Casos de Teste
		3.1) Positivos
		3.2) Negativos
		3.3) Exce��o
		
		4) Use os conceitos do Princ�pio F.I.R.S.T., incluindo os 3 A's, indicando-os com Coment�rios. Procure tamb�m aplicar os conceitos de Classes de Equival�ncia.
		
		5) O envio deve ser feito atrav�s um link do seu reposit�rio no GitHub ou outra ferramenta equivalente.
		
		6) Crie um Pacote espec�fico para esta Atividade, contendo a numera��o 03:
		
		7) Tag sugerida a ser utilizada no GIT:
		- ATIV_03_JUnit_Anagrama
		
		8) Envie o Link do Commit final como resposta desta Atividade*/

	public boolean isAnagramas(String p1, String p2) {
		//setando as duas palavras para caixa alta.
		p1 = p1.toUpperCase();
		p2 = p2.toUpperCase();

		//se as duas palavras n�o t�m o mesmo tamanho, j� n�o s�o um anagrama
		if(p1.length() != p2.length()) {
			return false;
		}
		else {
			//varrendo todas as letras da primeira palavra
			for(int i = 0; i < p1.length() - 1; i++) {
								
				//verificando se a letra lida na itera��o existe na segunda palavra 
				int index = p2.indexOf(p1.charAt(i));
				
				//se existir, vamos remover a letra da segunda palavra
				if(index != -1){
					p2 = p2.replace(p1.charAt(i), " ".charAt(0));
				}
				else {
					//se n�o existir, j� podemos dizer que as duas palavras n�o s�o anagrama
					return false;
				}
			}
		}
		
		return true;
	}
}