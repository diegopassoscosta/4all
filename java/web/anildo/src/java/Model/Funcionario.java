/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Conexao.Conexao;
import Conexao.testeConsulta;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author simattosjava
 */
public class Funcionario extends Pessoa{
  private String codigo;
  private String nome;
  private int senha;

  public  List codigo1 = new ArrayList();
  public  List listanome = new ArrayList();
  public List listasenha = new ArrayList();


  public Funcionario(){
  }
  
  public boolean Consultar(String login, int senha) throws SQLException{
      Connection con = (Connection) Conexao.getConexao();
      con.setAutoCommit(true);
      
      boolean result = false;

      try {

            String sql = "Select * from funcionario where nome= '";            
            sql = sql + login;
            sql = sql + "'";
            sql = sql + " and senha =";
            sql = sql + senha;            
            
            System.out.println(sql);
            PreparedStatement tt = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = tt.executeQuery(sql);
            
            while(rs.next()){
                setNome(rs.getString("nome"));
                setSenha(rs.getInt("codigo"));                
                result = true;
             }

            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(testeConsulta.class.getName()).log(Level.SEVERE, null, ex);            
            result = false;
        }finally{
            con.close();
        }
      return result;
  }
  
  
  
  public void ValidarAlterar(int senha) throws SQLException{
      Connection con = (Connection) Conexao.getConexao();
      con.setAutoCommit(true);

      try {

            String sql = "Select * from funcionario where codigo= ";
            sql = sql + senha;
            
            System.out.println(sql);
            PreparedStatement tt = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = tt.executeQuery(sql);

            while(rs.next()){
                setNome(rs.getString("nome"));
                setSenha(rs.getInt("codigo"));
                System.out.println("Resultado "+nome+" "+senha);
             }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(testeConsulta.class.getName()).log(Level.SEVERE, null, ex);

        }finally{
            con.close();
        }
  }

  public void Carregar() throws SQLException{
      
      Connection con = (Connection) Conexao.getConexao();
      con.setAutoCommit(true);

      try {
            String sql = "Select * from funcionario";
            

            PreparedStatement tt = (PreparedStatement) con.prepareStatement(sql.toString());
            ResultSet rs = tt.executeQuery(sql.toString());

            while(rs.next()){
                codigo1.add(rs.getInt("codigo"));
                listanome.add(rs.getString("nome"));
                listasenha.add(rs.getString("senha"));                
             }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(testeConsulta.class.getName()).log(Level.SEVERE, null, ex);

        }finally{
            con.close();
        }
  }

  public void PegarFuncionario(int  codigo) throws SQLException{
      
      Connection con = (Connection) Conexao.getConexao();
      con.setAutoCommit(true);

      try {
            String sql = "Select * from funcionario where codigo= "+codigo+" ";
            

            PreparedStatement tt = (PreparedStatement) con.prepareStatement(sql.toString());
            ResultSet rs = tt.executeQuery(sql.toString());

            while(rs.next()){
                codigo1.add(rs.getInt("codigo"));
                listanome.add(rs.getString("nome"));
                listasenha.add(rs.getString("senha"));
             }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(testeConsulta.class.getName()).log(Level.SEVERE, null, ex);

        }finally{
            con.close();
        }
  }
  
  public void Deletar(String codigo) throws SQLException{
      Connection con = (Connection) Conexao.getConexao();
       con.setAutoCommit(true);

       StringBuffer sql = new StringBuffer();
       sql.append( "delete from funcionario where  codigo=");
       sql.append(codigo);              


       PreparedStatement tt = (PreparedStatement) con.prepareStatement(sql.toString());
       tt.execute(sql.toString());
       System.out.println(sql.toString());
  }

  public Boolean Alterar(int codigo) throws SQLException{
    Connection con = (Connection) Conexao.getConexao();
    con.setAutoCommit(true);
         boolean ret = false;
         PreparedStatement tt = (PreparedStatement) con.prepareStatement("update funcionario set nome = ?, senha = ? where codigo = ?");
         tt.setString(1, getNome());
         tt.setInt(2, getSenha());    
         tt.setInt(3, codigo);
         try{
             tt.executeUpdate();
             ret = true;
         }catch(Exception ex){
             ret = false;
         }
         return  ret;
  }

  public void CadastrarFunc() throws SQLException{
    Connection con = (Connection) Conexao.getConexao();
    con.setAutoCommit(true);
    StringBuffer sql = new StringBuffer();
    try{
        sql.append("insert into funcionario(nome,senha)values('");
        PreparedStatement pt = (PreparedStatement) con.prepareStatement(sql.toString());
        if(con != null){
            sql.append(getNome());
            sql.append("',");            
            sql.append(getSenha());
            sql.append(")");
            System.out.println(sql.toString());
            pt.executeUpdate(sql.toString());
        }


    }catch(Exception ex){
        ex.getMessage();
    }
  }
  
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the senha
     */
    public int getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(int senha) {
        this.senha = senha;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
