/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.exemplo.conexao.banco.leonardo;

/**
 *
 * @author gabriel
 */
class NaoEncontradoTipoDeBanco extends Exception {

    public NaoEncontradoTipoDeBanco(String message) {
        super(message);
    }
    public NaoEncontradoTipoDeBanco(){
        super("Não foi encontrado nenum banco");
    }
    
}
