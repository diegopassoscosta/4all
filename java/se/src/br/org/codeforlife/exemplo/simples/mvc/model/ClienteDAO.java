/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.exemplo.simples.mvc.model;

import br.org.codeforlife.exemplo.conexao.banco.diego.Conexao;
import br.org.codeforlife.exemplo.conexao.banco.diego.FaltaParametroDeConexaoException;
import br.org.codeforlife.exemplo.conexao.banco.diego.NaoFoiEscolhidoBancoParaConectarException;
import br.org.codeforlife.exemplo.simples.mvc.control.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author Diego Passos Costa
 */
public class ClienteDAO {

    /**
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
    
    /**
     * yupe
     * @param c
     * @return
     * @throws ClassNotFoundException
     * @throws FaltaParametroDeConexaoException
     * @throws NaoFoiEscolhidoBancoParaConectarException
     * @throws SQLException 
     */
    
    public static  Cliente consultaClienteId(Cliente c) throws ClassNotFoundException, FaltaParametroDeConexaoException, NaoFoiEscolhidoBancoParaConectarException, SQLException {
        Cliente cr = new Cliente();
        Conexao conn = new Conexao();
        conn.conecteAoBanco("mysql", "localhost", "3306", "exemplo_teste_aula_oo_simples", "root", "123123");
        String comando = "select id_cliente, nome, idade from cliente where id_cliente ="+c.getId()+";";
        
        ResultSet rs = conn.consulta(comando);
        while(rs.next()){
            cr.setId(rs.getInt(1));
            cr.setNome(""+rs.getString(2));
            cr.setIdade(rs.getInt(3));
        }
        
        return cr;
    }
    
    public static  Vector<Cliente> consultaClienteNome(Cliente c) throws ClassNotFoundException, FaltaParametroDeConexaoException, NaoFoiEscolhidoBancoParaConectarException, SQLException {
        Vector<Cliente> vc = new Vector();
        Cliente cr;
        
        Conexao conn = new Conexao();
        conn.conecteAoBanco("mysql", "localhost", "3306", "exemplo_teste_aula_oo_simples", "root", "123123");
        String comando = "select id_cliente, nome, idade from cliente where nome like '"+c.getNome()+"';";
        
        ResultSet rs = conn.consulta(comando);
        while(rs.next()){
            cr = new Cliente();
            cr.setId(rs.getInt(1));
            cr.setNome(""+rs.getString(2));
            cr.setIdade(rs.getInt(3));
            vc.add(cr);
        }
        
        return vc;
    }
    
}
