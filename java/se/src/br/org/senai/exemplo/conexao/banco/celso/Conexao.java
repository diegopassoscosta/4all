/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.exemplo.conexao.banco.celso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Celso Barreto da Silva / profCelsoBarreto@hotmail.com
 */
public class Conexao {

    private Connection con;
    private Statement stm;
    private String nomeDoHost;
    private int portaDoHost;
    private String usuario;
    private String senha;
    
    private final String driverDerby = "org.apache.derby.jdbc.EmbeddedDriver";
    private final String driverMysql = "com.mysql.jdbc.Driver";
    private final String driverPostgree = "org.postgresql.Driver";
    //private String urlDerby ="jdbc:derby://localhost:1527/Cadastro"+usuario+senha;  
    private String urlMySql = "jdbc:mysql://localhost:3306/Cadastro";
    private String urlDerby = "jdbc:derby://localhost:1527/Cadastro";
    private String urlPostGree="jdbc:Postgree://localhost:1527/Cadastro";
    //con = DriverManager.getConnection("jdbc:derby://localhost:1527/Cadastro","adm","123123");

    /**
     * Escolhe um banco de dados
     * @param bancoEscolhido
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public void escolhaBanco(String bancoEscolhido) throws ClassNotFoundException, SQLException {
        if (bancoEscolhido.equalsIgnoreCase("derby")) {
            carregaDriver(bancoEscolhido);
        }
    }

    /**
     * @param consulta
     * @return uma consulta
     */
    public ResultSet retornaConsulta(String consulta) throws SQLException{
       
        return  stm.executeQuery(consulta);
        
    }
    
    /**
     * 
     * @return o nome do host
     */
    public String getNomeDoHost() {
        return nomeDoHost;
    }

    /**
     * @param nomeDoHost ajusta o nome do host
     */
    public void setNomeDoHost(String nomeDoHost) {
        this.nomeDoHost = nomeDoHost;
    }

    /**
     * @return a porta do host
     */
    public int getPortaDoHost() {
        return portaDoHost;
    }

    /**
     * @param portaDoHost ajusta a porta do host
     */
    public void setPortaDoHost(int portaDoHost) {
        this.portaDoHost = portaDoHost;
    }

    /**
     * @return o nome do usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param unsuario ajusta o nome do usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return a senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha ajusta a senha
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    private void carregaDriver(String banco) throws ClassNotFoundException, SQLException {
        if (banco.equalsIgnoreCase("mySQL")) {
            Class.forName(this.driverMysql);
            con = DriverManager.getConnection(this.urlMySql);

            stm = con.createStatement();
        }

        if (banco.equalsIgnoreCase("Derby")) {
            Class.forName(this.driverDerby);
            //this.urlDerby = this.urlDerby+ "," + "\"" +this.usuario + "\"" +"," + "\"" +this.senha+ "\"";
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Cadastro",""+this.usuario+"",""+this.senha+"");

            //significado disso abaixo
            stm = con.createStatement();
        }

        if (banco.equalsIgnoreCase("PostGree")) {
            Class.forName(this.driverPostgree);
            con = DriverManager.getConnection(this.urlPostGree);

            //significado disso abaixo
            stm = con.createStatement();
        }
    }
}
