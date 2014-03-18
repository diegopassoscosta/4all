package br.org.codeforlife.estrututa.mestrado;
public class InserionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public static void insertionSort0() {
		int vet[] = new int[4];
		
		// 1 atribuicao
		int chave = -1;
		//1 atribuicao
		int i = 0;

		//contamos?
		vet[0] = 5;
		vet[1] = 1;
		vet[2] = 3;
		vet[3] = 2;

		//+1 atribuição n-1 comparacoes n-1 incrementos
		for (int j = 1; j < vet.length; j++) {
			//1 atribuicao
			chave = vet[j];
			//1 operacao -> atribuicao
			i = j - 1;
			
			while (i > -1 && vet[i] > chave) {
				vet[i + 1] = vet[i];
				--i;
			}
			vet[i + 1] = chave;

		}

		for (int j = 0; j < vet.length; j++) {
			System.out.println(vet[j]);
		}

	}

}
