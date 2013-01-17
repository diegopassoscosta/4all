/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.exemplo.conexao.banco.gelton;


import br.org.codeforlife.exemplo.conexao.banco.gelton.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabriel
 */
public class ConnectionTest {
    
    protected Connection instance = new Connection();
    
    public ConnectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        instance.setHost("localhost");
        instance.setType("derby");
        instance.setSchema("conexaocalculo");
        instance.setUser("adm");
        instance.setPass("123123");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of selecionarDb method, of class Connection.
     */
    @Test
    public void testSelecionarDb() throws ClassNotFoundException {
        System.out.println("selecionarDb");
        String db = "derby";
        instance.selecionarDb(db);
        
    }

    /**
     * Test of abrirConexao method, of class Connection.
     */
    @Test
    public void testAbrirConexao() throws SQLException, ClassNotFoundException {
        System.out.println("abrirConexao");
        String db = "derby";
        instance.selecionarDb(db);
        instance.abrirConexao();
    }

    /**
     * Test of inserirDb method, of class Connection.
     */
    @Test
    public void testInserirDb() throws Exception {
        System.out.println("inserirDb");
        String query = "";
        int expResult = 1;
        int result = instance.inserirDb(query);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornaResultado method, of class Connection.
     */
    @Test
    public void testRetornaResultado() throws Exception {
        System.out.println("retornaResultado");
        String consulta = "";
        ResultSet expResult = null;
        ResultSet result = instance.retornaResultado(consulta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
