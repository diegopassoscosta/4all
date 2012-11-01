/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.exemplo.conexao.banco.gelton;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gelton Cruz
 */
public class Connection {
    
    //Atributos do DB
    private String host;
    private String port;
    private String schema;
    private String user;
    private String pass;
    private String type;
    private String query;
    private java.sql.Connection con;
    private Statement stm;
    
    //Drive de Connetion
     private final String derby = "org.apache.derby.jdbc.EmbeddedDriver";
     private final String mysql = "com.mysql.jdbc.Driver";
     private final String oracle = "oracle.jdbc.driver.OracleDriver";
     private final String postgre = "org.postgresql.Driver";

    public void selecionarDb(String db) throws ClassNotFoundException{
        if(db.equals("derby")){
            this.setType(derby);
            this.selecionarDrive();
        }
        if(db.equals("mysql")){
            this.setType(mysql);
            this.selecionarDrive();
        }
        if(db.equals("oracle")){
            this.setType(oracle);
            this.selecionarDrive();
        }
        if(db.equals("postgre")){
            this.setType(postgre);
            this.selecionarDrive();
        }
    }
    
    private void selecionarDrive() throws ClassNotFoundException{
        Class.forName(this.getType());
    }
    
    public java.sql.Connection abrirConexao() throws SQLException{
        con = DriverManager.getConnection(getHost(), getUser(), getPass());
        return con;
    }
    
    public int inserirDb(String query) throws SQLException{
        stm = con.createStatement();
        return stm.executeUpdate(query);
        
    }
    
    public ResultSet retornaResultado(String consulta) throws SQLException{
        stm = con.createStatement();
        return stm.executeQuery(consulta);
        
    }

    /**
     * @return the host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host the host to set
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * @return the port
     */
    public String getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * @return the schema
     */
    public String getSchema() {
        return schema;
    }

    /**
     * @param schema the schema to set
     */
    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the query
     */
    public String getQuery() {
        return query;
    }

    /**
     * @param query the query to set
     */
    public void setQuery(String query) {
        this.query = query;
    }
}
