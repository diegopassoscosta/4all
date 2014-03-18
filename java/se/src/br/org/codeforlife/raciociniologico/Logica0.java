package br.org.codeforlife.raciociniologico;

public class Logica0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// indices da matriz de dados
		int i;
		int j;

		// indice da matriz de resposta
		int k;
		int l;
		System.out.println("=");
		// matrizes

		boolean[][] mat = { { false, true, true}, 
							{ true, true, true },
							{ false, false, false },

		};

		// matriz de resposta deve estar igual a matriz de dados, o nao p e nao
		// q
		boolean[][] matResp = { { false, true, true, 	false, false, false },
								{ true, true, true, 	false, false, false },
								{ false, false, false, 	false, false, false }, };

		
		//INICIO PROCESSAMENTO "PROGRAMA"
		for (i = 0; i < mat.length; i++) {
			for (j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + " ");
				if (j == mat.length - 1)
					System.out.println();
			}
		}

		i = 0;
		j = i;

		// so pegar a 1 linha p teste trava na matriz resultado
		for (l = 0; l < 3; l++) {
			for (k = 0; k < 5; k++) {

				// E
				if (k == 0) {
					//for (i = l; i < l + 1; i++) {
						for (j = 0; j < 3; j++) {
							matResp[l][k] = matResp[l][k] && mat[l][j];
						}

					//}

				}
				// OU
				if (k == 1) {
					//for (i = l; i < l + 1; i++) {
						for (j = 0; j < 3; j++) {
							matResp[l][k] = matResp[l][k] || mat[l][j];
						}

					//}

				}

				// NOT P
				if (k == 2) {
					matResp[l][k] = !mat[l][k - 2];
				}

				// NOT Q
				if (k == 3) {
					matResp[l][k] = !mat[l][k - 2];
				}
				
				// NOT R
				if (k == 4) {
					matResp[l][k] = !mat[l][k - 2];
				}

			}
		}
		//FIM DO PROCESSAMENTO "PROGRAMA"

		System.out.println("--ORI--");
		for (i = 0; i < mat.length; i++) {
			for (j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + " ");
				if (j == mat.length - 1)
					System.out.println();
			}
		}

		System.out.println();
		System.out.println("---FIM---");
		for (i = 0; i < matResp.length; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(matResp[i][j] + " ");
				if (j == 4)
					System.out.println();

			}
		}

	}

}
