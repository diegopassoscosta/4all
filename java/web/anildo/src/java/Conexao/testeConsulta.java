/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

/**
 *
 * @author SIMATTOS
 */

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author simattosjava
 */
public class testeConsulta {
   public static void main(String args[]) throws SQLException{
       Connection con = (Connection) Conexao.getConexao();
       con.setAutoCommit(false);
       
       try {
            String sql = "Select * from funcionario";
            PreparedStatement tt = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = tt.executeQuery(sql);
            while(rs.next()){
                int codigo = rs.getInt("codigo");
                String tipo = rs.getString("nome");
                String valor = rs.getString("senha");                                
                System.out.println("Resultado "+" "+codigo+" "+tipo+" "+valor);
            }
            rs.close();
            con.commit();            
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(testeConsulta.class.getName()).log(Level.SEVERE, null, ex);
            con.rollback();
        }finally{
            con.close();
        }
   }
}

