/**
 * 
 */
package br.org.senai.exemplo.sintaxe.execao;

/**
 * @author gabriel
 *
 */
public class UsoDoTratamentoDeExecao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Tratamento de Exce��o Divis�o por zero
		int nota1 = 10;
		int nota2 = 10;
		int dividendo = 0;
		int resultado = 0;
		try{
			resultado = (nota1+nota2)/dividendo;
			System.out.println(resultado);
		}catch(Exception e){
			System.out.print(e.getMessage());
		}finally{
			System.out.println("Divis�o Finalizada?");
		}
	}
}
