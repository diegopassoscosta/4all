/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.exemplo.conexao.banco.celso;

import br.org.codeforlife.exemplo.conexao.banco.celso.Conexao;
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
    
    protected Conexao instance = new Conexao();
    
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
        instance.setNomeDoHost("localhost");
        instance.setTipoDeBanco("derby");
        instance.setBanco("conexaocalculo");
        instance.setPortaDoHost("1527");
        instance.setUsuario("adm");
        instance.setSenha("123123");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of retornaConsulta method, of class Conexao.
     */
    @Test
    public void testConsultaBanco() throws Exception {
        System.out.println("Consulta Dados no Banco");
        String consulta = "select * from resultado";
        instance.conectaBanco();
        ResultSet result = instance.consulta(consulta);
        assertNotNull(result);    
    }
    
    /**
     * Test of retornaConsulta method, of class Conexao.
     */
    @Test
    public void testConectaAoBanco() throws Exception {
        System.out.println("Conecta ao Banco");
        boolean result = instance.conectaBanco();
        assertTrue(result);     
    }
    
    /**
     * Test of retornaConsulta method, of class Conexao.
     */
    @Test
    public void insereDadosNoBanco() throws Exception {
        System.out.println("Insere dados no banco");
        String consulta = "insert into adm.resultado (id) values (12)";
        instance.conectaBanco();
        int resultado = instance.inseri(consulta);
        assertEquals(1, resultado);    
    }
    
    /**
     * Test of retornaConsulta method, of class Conexao.
     */
    @Test
    public void atualizaDadosNoBanco() throws Exception {
        System.out.println("Atualiza dados no banco");
        String consulta = "update adm.resultado set id=13 where id=12";
        instance.conectaBanco();
        int resultado = instance.atualize(consulta);
        assertEquals(1, resultado);    
    }
    
    /**
     * Test of retornaConsulta method, of class Conexao.
     */
    @Test
    public void deletaDadosNoBanco() throws Exception {
        System.out.println("Deleta dados no banco");
        String consulta = "delete from resultado";
        instance.conectaBanco();
        int resultado = instance.delete(consulta);
        assertEquals(1, resultado);    
    } 
}
