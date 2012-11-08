/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.exemplo.conexao.diego;

import br.org.senai.exemplo.conexao.banco.diego.Conexao;
import br.org.senai.exemplo.conexao.banco.diego.FaltaParametroDeConexaoException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diego Passos Costa
 */
public class ConexaoTest {
    
    public ConexaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of conecteAoBanco method, of class Conexao.
     */
    @Test(expected=FaltaParametroDeConexaoException.class)
    public void testConecteAoBanco_0args() throws Exception {
        System.out.println("conecteAoBanco");
        Conexao instance = new Conexao();
        instance.conecteAoBanco();  
    }

    /**
     * Test of conecteAoBanco method, of class Conexao.
     */
    @Test
    public void testConecteAoBanco_6args() throws Exception {
        System.out.println("conecteAoBanco");
        String banco = "derby";
        String host = "localhost";
        String porta = "1527";
        String esquema = "conexaocalculo";
        String usuario = "adm";
        String senha = "123123";
        Conexao instance = new Conexao();
        boolean resultado = instance.conecteAoBanco(banco, host, porta, esquema, usuario, senha);
        
        assertTrue(resultado);
    }

    

    /**
     * Test of getEnderecoDeConexao method, of class Conexao.
     */
    @Test
    public void testGetEnderecoDeConexao() throws FaltaParametroDeConexaoException {
        System.out.println("getEnderecoDeConexao");
        String banco = "derby";
        String host = "localhost";
        String porta = "1527";
        String esquema = "conexaocalculo";
        String usuario = "adm";
        String senha = "123123";
        Conexao instance = new Conexao(banco, host, porta, esquema, usuario, senha);
        
       
        String expResult = "jdbc:" + instance.getBanco() + "://" + instance.getHost() + ":" + instance.getPorta() + "/" + instance.getInstancia();;
        String result = instance.getEnderecoDeConexao();   
        assertEquals("banco derby ok", "derby", instance.getBanco());
        assertEquals(expResult, result);
        
    }
}
