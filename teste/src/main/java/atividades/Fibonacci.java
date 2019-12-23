package atividades;

import interfaces.IFibonacci;

public class Fibonacci implements IFibonacci {
	/**
	 * N�meros (ou Sequ�ncia) de Fibonacci � composta por N�meros Inteiros, come�ando por 0 e 1.

		Cada termo subsequente � composto pela soma dos termos anteriores.
		
		Exemplo:
		- 1� termo = 0
		- 2� termo = 1
		- 3� termo = 1� + 2� = 0 + 1 = 1
		- 4� termo = 2� + 3� = 1 + 1 = 2
		- 5� termo = 3� + 4� = 1 + 2 = 3
		...
		
		Resumindo, a implementa��o natural destes n�meros � atrav�s de uma invoca��o recursiva.
		
		1) Implementar uma Interface NumerosFibonacci
		2) Declarar um m�todo
		- public long getNumeroFibonacci(int pPosicaoTermo);
		3) Implementar Casos de Teste
		3.1) Positivos
		3.2) Negativos
		3.3) Exce��o
		
		4) Use os conceitos do Princ�pio F.I.R.S.T., incluindo os 3 A's, indicando-os com Coment�rios. Procure tamb�m aplicar os conceitos de Classes de Equival�ncia.		
		5) O envio deve ser feito atrav�s um link do seu reposit�rio no GitHub ou outra ferramenta equivalente.		
		6) Crie um Pacote espec�fico para esta Atividade, contendo a numera��o 04:		
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