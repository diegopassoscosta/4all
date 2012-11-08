/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.exemplo.conexao.banco.lucas;

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
     * Test of getImage method, of class Conexao.
     */
    @Test
    public void testGetImage_0args() throws Exception {
        System.out.println("getImage");
        Conexao instance = new Conexao();
        ResultSet expResult = null;
        ResultSet result = instance.getImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage method, of class Conexao.
     */
    @Test
    public void testGetImage_String() throws Exception {
        System.out.println("getImage");
        String id = "";
        Conexao instance = new Conexao();
        ResultSet expResult = null;
        ResultSet result = instance.getImage(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class Conexao.
     */
    @Test
    public void testClose() throws Exception {
        System.out.println("close");
        Conexao instance = new Conexao();
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
