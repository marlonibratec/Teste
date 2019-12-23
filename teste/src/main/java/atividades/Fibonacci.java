package atividades;

import interfaces.IFibonacci;

public class Fibonacci implements IFibonacci {
	/**
	 * Números (ou Sequência) de Fibonacci é composta por Números Inteiros, começando por 0 e 1.

		Cada termo subsequente é composto pela soma dos termos anteriores.
		
		Exemplo:
		- 1º termo = 0
		- 2º termo = 1
		- 3º termo = 1º + 2º = 0 + 1 = 1
		- 4º termo = 2º + 3º = 1 + 1 = 2
		- 5º termo = 3º + 4º = 1 + 2 = 3
		...
		
		Resumindo, a implementação natural destes números é através de uma invocação recursiva.
		
		1) Implementar uma Interface NumerosFibonacci
		2) Declarar um método
		- public long getNumeroFibonacci(int pPosicaoTermo);
		3) Implementar Casos de Teste
		3.1) Positivos
		3.2) Negativos
		3.3) Exceção
		
		4) Use os conceitos do Princípio F.I.R.S.T., incluindo os 3 A's, indicando-os com Comentários. Procure também aplicar os conceitos de Classes de Equivalência.		
		5) O envio deve ser feito através um link do seu repositório no GitHub ou outra ferramenta equivalente.		
		6) Crie um Pacote específico para esta Atividade, contendo a numeração 04:		
		7) Tag sugerida a ser utilizada no GIT:
		- ATIV_04_JUnit_Fibonacci
		8) Envie o Link do Commit final como resposta desta Atividade*/
	public long getNumeroFibonacci(int pPosicaoTermo) {
		return fibo(pPosicaoTermo -1);
	}
	
	static long fibo(int n) {
        if (n < 2) {
            return n;
        } 
        else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}