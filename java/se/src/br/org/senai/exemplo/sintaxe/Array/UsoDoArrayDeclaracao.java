/**
 * 
 */
package br.org.senai.exemplo.sintaxe.Array;

/**
 * @author gabriel
 *
 */
public class UsoDoArrayDeclaracao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declaração de um vetor de multiplas dimens�es
		int nota[][] = new int [2][2];
		nota[0][0] = 0;
		nota[0][1] = 1;
		nota[1][0] = 2;
		nota[1][1] = 3;
		
		for (int i = 0; i < nota.length; i++) {
			for (int j = 0; j < nota.length; j++) {
				System.out.print(nota[i][j]);
				if (j==1)
					System.out.println();				
			}
			
		}
	}
}
