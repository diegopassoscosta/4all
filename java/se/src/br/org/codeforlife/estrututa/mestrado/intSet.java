/**
 * 
 */
package br.org.codeforlife.estrututa.mestrado;

/**
 * O que seria arbitrario
 * @author Diego
 *
 */
public class intSet {
	
	private int tam[];
	private int size;
	

	public intSet(){
		//1 atribuica n + 1 comparacoes n incrementos
		for (int i = 0; i < tam.length; i++) {
			tam[i] = 0;
		}
		//1 atribuicao
		size = tam.length;
	}

	public int size(){
		//1 retorno --> comparavel?
		return this.size;
	}
	
	public boolean isIn(int x){
		
		//1 atribuicao n+1 comparacoes  n incrementos
		for (int i = 0; i < tam.length; i++) {
			//1 comparacao n vezes (1*n)
			if (tam[i] == x){
				// ponto de retorno + 1
				return true;
			} 
			
		}
		return false;
	}
	
	
}
