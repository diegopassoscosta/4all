/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

/**
 *
 * @author SIMATTOS
 */

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author simattosjava
 */
public class Conexao {
   private static Connection con;
   Statement st = null;
   ResultSet rs = null;
       
   public static Connection getConexao() throws SQLException{
       String driver = "com.mysql.jdbc.Driver";
       String url = "jdbc:mysql://localhost:3306/projeto_senai";
       String login = "root";
       String senha = "anildo";
              
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, login, senha);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return con;     
   }
   
   public void close(){
       Connection conn;
        try {
            conn = Conexao.getConexao();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
   }
  
}

