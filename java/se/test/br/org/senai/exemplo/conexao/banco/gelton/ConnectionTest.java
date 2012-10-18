/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.exemplo.conexao.banco.gelton;


import java.sql.ResultSet;
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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of selecionarDb method, of class Connection.
     */
    @Test
    public void testSelecionarDb() throws Exception {
        System.out.println("selecionarDb");
        String db = "";
        Connection instance = new Connection();
        instance.selecionarDb(db);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of abrirConexao method, of class Connection.
     */
    @Test
    public void testAbrirConexao() throws Exception {
        System.out.println("abrirConexao");
        Connection instance = new Connection();
        instance.abrirConexao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirDb method, of class Connection.
     */
    @Test
    public void testInserirDb() throws Exception {
        System.out.println("inserirDb");
        String query = "";
        Connection instance = new Connection();
        boolean expResult = false;
        boolean result = instance.inserirDb(query);
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
        Connection instance = new Connection();
        ResultSet expResult = null;
        ResultSet result = instance.retornaResultado(consulta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
