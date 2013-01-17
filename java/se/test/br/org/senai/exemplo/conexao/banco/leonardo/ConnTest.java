/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.exemplo.conexao.banco.leonardo;

//import br.org.senai.exemplo.conexao.banco.leonardo.n;
import br.org.codeforlife.exemplo.conexao.banco.leonardo.Conn;
import br.org.codeforlife.exemplo.conexao.banco.leonardo.NaoFoiInformandaNenhumaQueryException;
import br.org.codeforlife.exemplo.conexao.banco.leonardo.NaoEncontradoTipoDeBanco;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Diego Passos Costa
 */
public class ConnTest {

    protected String banco = "derby";
    protected String host = "localhost";
    protected String porta = "1527";
    protected String esquema = "conexaocalculo";
    protected String usuario = "adm";
    protected String senha = "123123";
    protected Conn instance = new Conn();
        

    public ConnTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws NaoEncontradoTipoDeBanco {   
        instance.setUser(usuario);
        instance.setPassword(senha);
        instance.setPort(Integer.parseInt(porta));
        instance.setHost(host);
        instance.setName(esquema);
        instance.selectDB(banco);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of Open method, of class Conn.
     */
    @Test
    public void testSelectDB() throws ClassNotFoundException, SQLException, NaoEncontradoTipoDeBanco {
        System.out.println("Open");
        String result = instance.selectDB(banco);
        assertNotNull(result);
    }

    /**
     * Test of Open method, of class Conn.
     */
    @Test
    public void testOpen() throws ClassNotFoundException, SQLException, NaoEncontradoTipoDeBanco {
        System.out.println("Open");
        String url = "jdbc:" + instance.getNomeDb() + "://" + instance.getHost() + ":" + instance.getPort() + "/" + instance.getName();
        assertEquals("jdbc:derby://localhost:1527/conexaocalculo", url);
        Connection result = instance.Open();
        assertNotNull(result);
    }

    /**
     * Test of Open method, of class Conn.
     */
    @Test(expected = NaoEncontradoTipoDeBanco.class)
    public void testOpenFail() throws ClassNotFoundException, SQLException, NaoEncontradoTipoDeBanco {
        System.out.println("Open");
        instance.selectDB("derbyasdasqef2f2");
        instance.Open();
    }

    /**
     * Test of Insert method, of class Conn.
     */
    @Test
    public void testInsert() throws NaoEncontradoTipoDeBanco, NaoFoiInformandaNenhumaQueryException {
        System.out.println("Insert");
        int retornoExperado = 1;
        instance.setQuery("insert into adm.resultado (id) values (12)");
        int resultado = instance.Insert();
        assertEquals(retornoExperado, resultado);
    }

    /**
     * Test of Update method, of class Conn.
     */
    @Test
    public void testUpdate() throws NaoEncontradoTipoDeBanco, NaoFoiInformandaNenhumaQueryException, SQLException {
        System.out.println("Update"); 
        int retornoExperado = 1;
        int resultado = 0;
        instance.setQuery("update adm.resultado set id=13 where id=12");
        resultado = instance.Update();
        assertEquals(retornoExperado, resultado);

    }

    /**
     * Test of Delete method, of class Conn.
     */
    @Test
    public void testDelete() throws NaoEncontradoTipoDeBanco, NaoFoiInformandaNenhumaQueryException {
        System.out.println("Delete");
        int retornoExperado = 1;
        int resultado = 0;      
        instance.setQuery("delete from resultado");
        resultado = instance.Delete();
        assertEquals(retornoExperado, resultado);

    }

    /**
     * Test of Select method, of class Conn.
     */
    @Test
    public void testSelect() throws NaoEncontradoTipoDeBanco, NaoFoiInformandaNenhumaQueryException {
        System.out.println("Select");      
        ResultSet resultado = null;
        instance.setQuery("select * from resultado");
        resultado = instance.Select();
        assertNotNull(resultado);
    }
}
