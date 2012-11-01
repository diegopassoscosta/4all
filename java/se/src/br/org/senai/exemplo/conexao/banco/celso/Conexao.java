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
    private String tipoDeBanco = ".";
    private String nomeDoHost;
    private String portaDoHost;
    private String usuario;
    private String senha;
    private String banco;
    
    private final String driverDerby = "org.apache.derby.jdbc.EmbeddedDriver";
    private final String driverMysql = "com.mysql.jdbc.Driver";
    private final String driverPostgres = "org.postgresql.Driver";  
    private final String DERBYPORT = "3306";
    private final String MSQLPORT = "3306";
  
    /**
     * Escolhe um banco de dados
     * @param bancoEscolhido
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public boolean conectaBanco() throws ClassNotFoundException, SQLException {
        carregaDriver();
        return true;
    }
    
    private void carregaDriver() throws ClassNotFoundException, SQLException {
        if (this.tipoDeBanco.equalsIgnoreCase("MySQL")) {
            Class.forName(this.driverMysql);
            con = DriverManager.getConnection("jdbc:mysql://"+this.nomeDoHost+":"+this.portaDoHost+"/"+this.banco+","+this.usuario+","+this.senha+"");
            
        }

        if (this.tipoDeBanco.equalsIgnoreCase("derby")) {
            Class.forName(this.driverDerby);
            con = DriverManager.getConnection("jdbc:derby://"+this.nomeDoHost+":"+this.portaDoHost+"/"+this.banco+"",""+this.usuario+"",""+this.senha+"");      
        }

        if (this.tipoDeBanco.equalsIgnoreCase("Postgres")) {
           Class.forName(this.driverPostgres);
           con = DriverManager.getConnection("jdbc:postgres://"+this.nomeDoHost+":"+this.portaDoHost+"/"+this.banco+","+this.usuario+","+this.senha+"");
 
       }
        stm = con.createStatement();
    }

    /**
     * @param consulta
     * @return uma consulta
     */
    public ResultSet consulta(String consulta) throws SQLException{
        return  stm.executeQuery(consulta);  
    }
    
    /**
     * @param update
     * @return o resultaod da inserção
     */
    public int inseri(String inseri) throws SQLException{
        return  stm.executeUpdate(inseri);  
    }
    
    /**
     * @param delete
     * @return o resultaod da inserção
     */
    public int delete(String delete) throws SQLException{
        return  stm.executeUpdate(delete);  
    }
    
    /**
     * @param atualiza
     * @return o resultaod da inserção
     */
    public int atualize(String atualiza) throws SQLException{
        return  stm.executeUpdate(atualiza);  
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
    public String getPortaDoHost() {
        return portaDoHost;
    }

    /**
     * @param portaDoHost ajusta a porta do host
     */
    public void setPortaDoHost(String portaDoHost) {
        this.portaDoHost = portaDoHost;
    }

    /**
     * @return o nome do usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario ajusta o nome do usuario
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

    /**
     * @return o banco
     */
    public String getBanco() {
        return banco;
    }

    /**
     * @param banco a ser ajustado
     */
    public void setBanco(String banco) {
        this.banco = banco;
    }

    /**
     * @return the tipoDeBanco
     */
    public String getTipoDeBanco() {
        return tipoDeBanco;
    }

    /**
     * @param tipoDeBanco the tipoDeBanco to set
     */
    public void setTipoDeBanco(String tipoDeBanco) {
        this.tipoDeBanco = tipoDeBanco;
    }
}