/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.exemplo.calculadora.celso;

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
public class CalculadoraSomaTest {
    
    public CalculadoraSomaTest() {
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
     * Test of soma method, of class CalculadoraSoma.
     */
    @Test
    public void testSoma() {
        System.out.println("soma");
        int a = 0;
        int b = 0;
        CalculadoraSoma instance = new CalculadoraSoma();
        int expResultado = 0;
        int resultado = instance.soma(a, b);
        assertEquals(expResultado, resultado);
    }
}
