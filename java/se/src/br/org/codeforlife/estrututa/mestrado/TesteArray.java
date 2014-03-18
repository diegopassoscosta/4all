package br.org.codeforlife.estrututa.mestrado;
/**
 * ADS = IDE
 * USO DE CADA ESTRUTURA
 * 
 * @author Diego
 * 
 * Algoritmo
 * Defini��o formal de TAD -> Tipo Abstrato de Dados -->  
 * 		"conjunto de dados e opera��es que podem ser executadas sobre esses dados"
 * 				desde os simples quantos os complexos
 * Estrutura de Dados.
 *
 *NoSQL         ---------> n�o fica restrito a estrutura de tabela
 *							perde na quest�o de inser��o de valores
 *							ganha na recupera��o de valores.
 *							*** escalaveis
 *
 *	Array ---> Valor fixo, n�mero finito de itera��es
 *				alocacao de memoria e fixa
 *				
 *				pesquisa 	--> pesquisa tende a ser ruim;
 *				remocao 	--> pesquisa nao e boa  tende a ser igual a pesquisa
 *				inserir 	--> mesmo criterio dos demais;
 *   	
 *
 *	ArrayOrdenado --> Pesquisa bom desempenho
 *  ArrayOrdenado --> Remo��o mal desempenho .. dado que � necess�rio ordenar todo o vetor
 *  ArrayOrdenado --> Inser��o pode ter desempenho dado que pode ocorrer ap�s a inser��o; pode ser 
 *  					necess�rio reordenar todo vetor desempenho ruim
 *  
 *  ***DICOT�MICA (log n)
 *
 *
 *ChaveValor
 *Grafos
 *Colunas
 *Documentos
 *
 *
 *Slide 
 */


public class TesteArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int foo1(int a[], int chave){

		//1 atribuicao; n + 1 comparacoes; n incrementos
		//1 + (n+1) + n
		for(int i =0; i < a.length;i++){
			//1 comparacao n vezes ( 1*n )
			if (chave == a[i]){
				//ponto de retorno + 1
				return a[i];
			}
		}
		//ponto de retorno + 1
		return -1;
		//laco       comparacao     retorno
		//1+(n+1) +  (1*n)            + 1
	}
	
	public static int foo2(int a[], int chave){

		//1 atribuicao
		int retorno = -1;
		//1 atribuicao; n + 1 comparacoes; n incrementos
		for(int i =0; i < a.length;i++){
			//1 comparacao n vezes (1 * n)
			if (chave == a[i]){
				//ponto de retorno + 1
				retorno = a[i];
			}
		}
		//ponto de retorno +1
		return retorno;
		//atribuicao     laco      comparacoes      ponto de retorno
		//    1       + 1+(n+1)+n     + (1*n)    +       1
	}
	
	public static int foo3(int a[], int chave){

		//1 atribuicao
		int retorno = -1;
		//1 atribuicao
		int i = 0;
		//n + 1 comparacoes
		while(i < a.length){
			//1 comparacao n vezes (1*n)
			if (chave == a[i]){
				//1 atribuicao
				retorno = chave;
			}
			// n incrementos
			++i;
		}
		//+ 1 ponto de retorno
		return retorno;
		//atribuicao   atribuicao       laco
		//+1            + 1              n+1
	}
	
	public static int foo4(int a[], int chave){

		boolean continua = true;
		int retorno = -1;
		int i = 0;
		while(i < a.length && continua){
			if (chave == a[i]){
				retorno = chave;
				continua = false;
			}
			++i;
		}
		
		return retorno;
	}
		
}
