package br.org.codeforlife.prova.tipo1;

public class Vaca {
	//Caracteristíca peso
	private int peso = 40;
	
	/**
	 * Ação comer(int comida)
	 * @param comida
	 */
	public void comer(int comida){
		peso = peso + comida;
	} 
	
	/**
	 * Ação retornarPesoDaVaca()
	 * @return
	 */
	public int retornaPesoDaVaca(){
		return peso;
	}
}
