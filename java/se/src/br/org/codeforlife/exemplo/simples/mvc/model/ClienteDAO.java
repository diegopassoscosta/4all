/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.exemplo.simples.mvc.model;

import br.org.codeforlife.exemplo.conexao.banco.diego.Conexao;
import br.org.codeforlife.exemplo.conexao.banco.diego.FaltaParametroDeConexaoException;
import br.org.codeforlife.exemplo.conexao.banco.diego.NaoFoiEscolhidoBancoParaConectarException;
import br.org.codeforlife.exemplo.simples.mvc.control.Cliente;
import java.sql.SQLException;

/**
 *
 * @author lab01
 */
public class ClienteDAO {

    /**
     *
     * @param c
     * @return
     * @throws ClassNotFoundException
     * @throws FaltaParametroDeConexaoException
     * @throws NaoFoiEscolhidoBancoParaConectarException
     * @throws SQLException
     */
    public static int insereCliente(Cliente c) throws ClassNotFoundException, FaltaParametroDeConexaoException, NaoFoiEscolhidoBancoParaConectarException, SQLException {
        Conexao conn = new Conexao();
        conn.conecteAoBanco("mysql", "localhost", "3306", "exemplo_teste_aula_oo_simples", "root", "123123");
        String comando = "INSERT INTO `exemplo_teste_aula_oo_simples`.`cliente` (`nome`, `idade`) VALUES ('" + c.getNome() + "', '" + c.getIdade() + "')";
        return conn.grava(comando);
    }
}
