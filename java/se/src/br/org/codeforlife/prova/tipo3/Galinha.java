package br.org.codeforlife.prova.tipo3;

public class Galinha {
	//Caracterist�ca nome
	private String nomeCompleto = "Rex";
	
	/**
	 * A��o ajustaNomeDaGalinha(String novoNome)
	 * @param novoNome
	 */
	public void ajustaNomeDaGalinha(String novoNome){
		nomeCompleto = novoNome;
	} 
	
	/**
	 * A��o retornarNomeDaGalinha()
	 * @return
	 */
	public String retornarNomeDaGalinha(){
		return nomeCompleto;
	}
}
