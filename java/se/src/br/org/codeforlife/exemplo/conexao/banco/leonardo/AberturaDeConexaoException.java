/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.exemplo.conexao.banco.leonardo;

/**
 *
 * @author gabriel
 */
public class AberturaDeConexaoException extends Exception{
    
    public AberturaDeConexaoException(String message){
        super(message);
    }
    
    public AberturaDeConexaoException(){
        super("problema na abertura da conexão");
    }
    
}
