/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.exemplo.conexao.banco.leonardo;

/**
 *
 * @author gabriel
 */
public class NaoFoiInformandaNenhumaQueryException extends Exception{
    
    public NaoFoiInformandaNenhumaQueryException(String message){
        super(message);
    }
    
    public NaoFoiInformandaNenhumaQueryException(){
        super("Não foi informada nenhuma query");
    }
}
