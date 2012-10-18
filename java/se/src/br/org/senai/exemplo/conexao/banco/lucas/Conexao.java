package br.org.senai.exemplo.conexao.banco.lucas;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Administrador
 */
public class Conexao {
    private Connection con;
    private PreparedStatement prepStm;
    public Conexao() throws ClassNotFoundException, SQLException{
        //CONECTA COM O BANCO DE DADOS
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        this.con = DriverManager.getConnection("jdbc:derby://localhost:1527/webApplication1", "root", "root");
    }
    public int setIdade(String nome, Integer idade) throws SQLException{
        //TENTA INSERIR NOME E IDADE NO BANCO E true OU false
        prepStm = this.con.prepareStatement("INSERT INTO idade(nome, idade) VALUES(?, ?)");
        prepStm.setString(1, nome);
        prepStm.setInt(2, idade);
        return prepStm.executeUpdate();
    }
    public ResultSet getImage() throws SQLException{
        //RETORNA O ResultSet DE IMAGENS DO BANCO
        return prepStm.executeQuery("SELECT * FROM image");
    }
    public ResultSet getImage(String id) throws SQLException{
        //RETORNA O ResultSet DE IMAGENS DO BANCO
        prepStm = con.prepareStatement("SELECT * FROM image WHERE id=?");
        prepStm.setString(1, id);
        prepStm.execute();
        return prepStm.getResultSet();
    }
    public void close() throws SQLException{
        prepStm.close();
        con.close();
    }
}
