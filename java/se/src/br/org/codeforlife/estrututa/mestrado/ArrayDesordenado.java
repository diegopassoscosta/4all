package br.org.codeforlife.estrututa.mestrado;

import java.util.Scanner;

/**
 * Array ---> Valor fixo, número finito de iterações alocacao de memoria e fixa
 * pesquisa --> pesquisa tende a ser ruim; remocao --> pesquisa nao e boa tende
 * a ser igual a pesquisa inserir --> mesmo criterio dos demais;
 * 
 */

public class ArrayDesordenado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arranjo[] = new int[10];

		// ------------------------------- FOR -------------------------------

		/**
		 * Zera vetor
		 */
		// 1 atribuicao; n+1 comparacoes; n incrementos
		for (int i = 0; i < arranjo.length; i++) {
			// n atribuicoes
			arranjo[i] = -1;
		}
		// 1 + n + 1 + n + n --> n + n + n + 1 + 1 --> 3n + 1 + 1 --> 3n+2

		System.out.print("Informe o valor para insercao: ");
		Scanner leia = new Scanner(System.in);
		int value = leia.nextInt();

		/**
		 * Inserir no vetor
		 */
		// 1 atribuicao; n+1 comparacoes; n incrementos
		for (int i = 0; i < arranjo.length; i++) {
			// n * 1 comparacoes NAO CONSIGO VER
			if (arranjo[i] == -1) {
				// 1 atribuicao
				arranjo[i] = value;
				// ponto parada
				break;
			}
		}
		// 1 + n + 1 + n + (n*1) + 1 --> 1+1+1 + n + n + (n*1) --> 3 + 2n + n
		// --> 3 + 3n --> 3n+3

		/**
		 * Remover vetor
		 */
		System.out.print("Informe o valor para remover: ");
		// 1 atribuicao; n+1 comparacoes; n incrementos
		for (int i = 0; i < arranjo.length; i++) {
			// n * 1 comparacoes NAO CONSIGO VER
			if (arranjo[i] == value) {
				// 1 atribuicao
				arranjo[i] = -1;
				// ponto parada
				break;
			} else {// IGNORO É COMO SE FOSSE O PONTO DE RETORNO??
				System.out.println("Valor não encontrado...");
			}
		}
		// 1 + n + 1 + n + (n*1) + 1 --> 1+1+1 + n + n + (n*1) --> 3 + 2n + n
		// --> 3 + 3n --> 3n+3

		/**
		 * Pesquisar vetor
		 */
		System.out.print("Informe o valor para pesquisa: ");
		// 1 atribuicao; n+1 comparacoes; n incrementos
		for (int i = 0; i < arranjo.length; i++) {
			// n * 1 comparacoes NAO CONSIGO VER
			if (arranjo[i] == value) {
				// 1 ponto de retorno
				System.out.println("Valor encontrado... " + arranjo[i]);
				// ponto parada
				break;
			} else {
				System.out.println("Valor não encontrado...");
			}
		}
		// 1 + n + 1 + n + (n*1) + 1 --> 1+1+1 + n + n + (n*1) --> 3 + 2n + n
		// --> 3 + 3n --> 3n+3
		// ------------------------------- FOR -------------------------------

		// ------------------------------- WHILE -------------------------------

		/**
		 * Zera vetor
		 */
		// 1 atribuicao;
		int j = 0;
		// n+1 comparacoes;
		while (j < arranjo.length) {
			// n atribuicoes
			arranjo[j] = -1;
			// n incrementos
			++j;
		}
		// 1 + n + 1 + n + n  --> 3n+2

		// ERRADO ABAIXO?
		// 1 + n + 1 + (n + n)* n+1 --> 1 + 1 + n +( n + n )* n+1 --> 2 + n +
		// (2n) * n + 1 -->
		// --> 2 + n + 2n^2 + 2n --> 2n^2 + 3n + 2

		System.out.print("Informe o valor para insercao: ");
		value = leia.nextInt();

		/**
		 * Inserir no vetor
		 */
		// 1 atribuicao;
		j = 0;
		// (n+1)*2 + 1 operacao subtracao --> 2n+3 
		while (j < arranjo.length && arranjo[j - 1] != value) {
			//n*1 comparacoes
			if (arranjo[j] == -1)
				//1 atribuicao
				arranjo[j] = value;
			// n incrementos
			++j;
		}
		//1 + 2n + 3 + (n*1)*1 + n --> 1 + 2n + 3 + n + n --> 5n + 4

		/**
		 * Remover vetor
		 */
		// 1 atribuicao;
		j = 0;
		// (n+1)*2 + 1 operacao subtracao --> 2n+3 
		while (j < arranjo.length && arranjo[j - 1] == -1) {
			//n*1 comparacoes
			if (arranjo[j] == value)
				//1 atribuicao
				arranjo[j] = -1;
			// n incrementos
			++j;
		}
		//1 + 2n + 3 + (n*1)*1 + n --> 1 + 2n + 3 + n + n --> 5n + 4


		/**
		 * Pesquisar vetor
		 */
		value = leia.nextInt();
		// 1 atribuicao;
		j = 0;
		// (n+1)*2 + 1 operacao subtracao --> 2n+3 
		while (j < arranjo.length && arranjo[j - 1] == value) {
			//n*1 comparacoes
			if (arranjo[j] == value)
				//1 retorno
				System.out.println("valor: " + arranjo[j]);
			// n incrementos
			++j;
		}
		//1 + 2n + 3 + (n*1)*1 + n --> 1 + 2n + 3 + n + n --> 5n + 4


		leia.close();
	}

}
