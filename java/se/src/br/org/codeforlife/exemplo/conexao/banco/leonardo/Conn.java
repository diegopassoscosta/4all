/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.exemplo.conexao.banco.leonardo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Leonardo Lucena
 */
public class Conn {

    //variaveis de conexao
    private String type;
    private String host;
    private String name;
    private String user;
    private String password;
    private String query;
    private ResultSet rs;
    private int port;
    private int retorno;
    //variaveis de manipulação de dados do banco
    private Connection con;
    private Statement stm;
    //strings que guardam os drives de conexao
    private String nomeDb = "";
    private final String mysql = "com.mysql.jdbc.Driver";
    private final String postgresql = "org.postgresql.Driver";
    private final String oracle = "oracle.jdbc.driver.OracleDriver";
    private final String derby = "org.apache.derby.jdbc.EmbeddedDriver";

    /**
     * Método que seleciona o banco de dados desejado Ex-1: "mysql",
     * "postgress", "oracle", "derby"
     *
     * @param type
     * @return
     */
    public String selectDB(String type) throws NaoEncontradoTipoDeBanco {

        if ("derby".equalsIgnoreCase(type)) {
            this.setNomeDb(type);
            this.setType(this.derby);
        }else if ("mysql".equalsIgnoreCase(type)) {
            this.setNomeDb(type);
            this.setType(this.mysql);
        }else if ("postgresql".equalsIgnoreCase(type)) {
            this.setNomeDb(type);
            this.setType(this.postgresql);
        }else if ("oracle".equalsIgnoreCase(type)) {
            this.setNomeDb(type);
            this.setType(this.oracle);
        }else{
            throw new NaoEncontradoTipoDeBanco();   
        }

        return this.getType();
    }

    /**
     * Abre a conexão com o banco
     *
     * @return Connection
     */
    public Connection Open() throws ClassNotFoundException, SQLException, NaoEncontradoTipoDeBanco {

        if (this.con == null) {

            Class.forName(this.getType());
            String url = "jdbc:"+this.getNomeDb()+"://" + this.getHost() + ":" + this.getPort() + "/" + this.getName();
            this.con = DriverManager.getConnection(url, this.getUser(), this.getPassword());
        }
        return this.con;
    }

    public void commit() throws SQLException{
        this.con.commit();
    }
    /**
     * Atualiza a query que foi informada no setQuery()
     */
    public int Update() {
        try {
            this.con = this.Open();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            retorno = 0;
            this.stm = this.con.createStatement();
            retorno = stm.executeUpdate(this.getQuery());
            this.close();
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
        }

        return retorno;
    }

    private void close() {
        try {
            this.con.close();
        } catch (SQLException e) {
            System.err.print(e.getMessage());
        }
    }

    public int Insert() {
        
        try {
            this.con = this.Open();
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }

        try {
            retorno = 0;
            this.stm = this.con.createStatement();
            retorno = stm.executeUpdate(this.getQuery());
            this.close();
        } catch (SQLException e) {
            System.err.println("Erro: " + e.getMessage());
        }
        return retorno;
    }

    public int Delete() {

        try {
            this.con = this.Open();
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }

        try {
            retorno = 0;
            this.stm = this.con.createStatement();
            retorno = stm.executeUpdate(this.getQuery());
            this.close();
        } catch (SQLException e) {
            System.err.println("Erro: " + e.getMessage());
        }
        return retorno;
    }

    public ResultSet Select() {

        try {
            this.con = this.Open();
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }

        try {
            this.stm = this.con.createStatement();
            this.rs = stm.executeQuery(this.getQuery());

        } catch (SQLException e) {
            System.err.println("Erro: " + e.getMessage());
        } finally {
            // this.close();
        }
        return this.rs;
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
    private void setType(String type) {
        this.type = type;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the query
     */
    public String getQuery() {
        return query;
    }

    /**
     * @param query the query to set
     * @throws NaoFoiInformandaNenhumaQueryException
     */
    public void setQuery(String query) throws NaoFoiInformandaNenhumaQueryException {
        this.query = query;
        if (this.query == null) {

            throw new NaoFoiInformandaNenhumaQueryException();

        }
    }

    /**
     * @return the port
     */
    public int getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(int port) {
        this.port = port;
    }

    /**
     * @return the nomeDb
     */
    public String getNomeDb() {
        return nomeDb;
    }

    /**
     * @param nomeDb the nomeDb to set
     */
    public void setNomeDb(String nomeDb) {
        this.nomeDb = nomeDb;
    }
}
