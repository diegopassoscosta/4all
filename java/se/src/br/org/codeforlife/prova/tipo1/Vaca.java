package br.org.codeforlife.prova.tipo1;

public class Vaca {
	//Caracterist�ca peso
	private int peso = 40;
	
	/**
	 * A��o comer(int comida)
	 * @param comida
	 */
	public void comer(int comida){
		peso = peso + comida;
	} 
	
	/**
	 * A��o retornarPesoDaVaca()
	 * @return
	 */
	public int retornaPesoDaVaca(){
		return peso;
	}
}
