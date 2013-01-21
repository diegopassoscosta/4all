/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.orientado.over.lista01.classe.questao3;

import br.org.codeforlife.orientado.over.lista01.classe.questao2.Data;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab01
 */
public class VooTest {
    
    public VooTest() {
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
     * Test of proximoLivre method, of class Voo.
     */
    @Test
    public void testProximoLivre() {
        System.out.println("proximoLivre");
        Voo instance = new Voo(123,new Data(11,11,1111));
        int expResult = 2;
        instance.ocupa(1);
        assertEquals(expResult, instance.proximoLivre());
    }

    /**
     * Test of ocupa method, of class Voo.
     */
    @Test
    public void testOcupa() {
        System.out.println("ocupa");
        int primeiraCadeira = 1;
        //int segundaCadeira = 2;
        
        Voo instance = new Voo(123,new Data(11,11,1111));
        
        boolean expPrimeiroResultado = true;
        //boolean expSegundoResultado = false;
        //boolean expTerceiroResultado = true;
        
        boolean resultado1 = instance.ocupa(primeiraCadeira);
        //boolean resultado2 = instance.ocupa(primeiraCadeira);
        //boolean resultado3 = instance.ocupa(segundaCadeira);
        
        assertEquals(expPrimeiroResultado, resultado1);
       //assertEquals(expSegundoResultado, resultado2);
        //assertEquals(expTerceiroResultado, resultado3);
       
    }

    /**
     * Test of clone method, of class Voo.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Voo instance = new Voo(123, new Data(11,11,2011));
        instance.ocupa(1);
        Voo result = instance.clone();
        result.ocupa(2);
        assertNotSame(instance, result);
        assertEquals(instance.cadeirasLivres, 99);
        assertEquals(result.cadeirasLivres, 98);
        assertNotSame(instance.cadeirasLivres, result.cadeirasLivres);
        
    }
}
