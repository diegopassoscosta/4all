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
public class Quarto{
 
  private String tipo;
  private float valor;
  private int status;
  private int codigo;

  public List licodigo = new ArrayList();
  public List litipo = new ArrayList();
  public List livalor = new ArrayList();
  public List listatus = new ArrayList();
      
    //Valores que vem do banco
    public List linomeCliente = new ArrayList();
    public List lisobreNomeCliente = new ArrayList();
    public List livalorCalculado = new ArrayList();
    public List lidataEntrada = new ArrayList();
    public List lidataSaida = new ArrayList();
    public List lidias = new ArrayList();
    public List idCliente = new ArrayList();
    public List idQuarto = new ArrayList();
    


  public Quarto(){
  }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void Consultar() throws SQLException{
        Connection con = (Connection) Conexao.getConexao();
        con.setAutoCommit(true);

        try{
            String sql = "select q.codigo,q.tipo, q.valor,s.status from quarto q inner join status s on q.status = s.codigo";
            //System.out.println(sql);
            PreparedStatement tt = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = tt.executeQuery(sql);

            while(rs.next()){
                licodigo.add(rs.getInt("codigo"));
                litipo.add(rs.getString("tipo"));
                livalor.add(rs.getString("valor"));
                listatus.add(rs.getString("status"));

                System.out.println(licodigo);
                System.out.println(litipo);
                System.out.println(livalor);
                System.out.println(listatus);


            }

        }catch(Exception ex){
            ex.getMessage();
        }

    }
    public void ConsultarOcupado() throws SQLException{
        Connection con = (Connection) Conexao.getConexao();
        con.setAutoCommit(true);

        try{
            String sql = "select q.codigo,q.tipo, q.valor,s.status from quarto q inner join status s on q.status = s.codigo where s.codigo=1 ";
            //System.out.println(sql);
            PreparedStatement tt = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = tt.executeQuery(sql);

            while(rs.next()){
                licodigo.add(rs.getInt("codigo"));
                litipo.add(rs.getString("tipo"));
                livalor.add(rs.getString("valor"));
                listatus.add(rs.getString("status"));

                System.out.println(licodigo);
                System.out.println(litipo);
                System.out.println(livalor);
                System.out.println(listatus);

            }

        }catch(Exception ex){
            ex.getMessage();
        }

    }
    
     public void ConsultarLivre() throws SQLException{
        Connection con = (Connection) Conexao.getConexao();
        con.setAutoCommit(true);

        try{
            String sql = "select q.codigo,q.tipo, q.valor,s.status from quarto q inner join status s on q.status = s.codigo where s.codigo=1 ";
            //System.out.println(sql);
            PreparedStatement tt = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = tt.executeQuery(sql);

            while(rs.next()){
                licodigo.add(rs.getInt("codigo"));
                litipo.add(rs.getString("tipo"));
                livalor.add(rs.getString("valor"));
                listatus.add(rs.getString("status"));

                System.out.println(licodigo);
                System.out.println(litipo);
                System.out.println(livalor);
                System.out.println(listatus);

            }

        }catch(Exception ex){
            ex.getMessage();
        }

    }
    
    public void LiberarQuarto() throws SQLException{
        Connection con = (Connection) Conexao.getConexao();
        con.setAutoCommit(true);

        try{
            String sql = "select c.nome, c.sobreNome, s.valor_calculado, s.data_entrada, s.data_saida,s.dias, st.status, q.tipo,s.id_cliente,s.id_quarto,s.codigo ";
            sql = sql +" from servico s inner join cliente c on s.id_cliente = c.codigo ";
            sql = sql +" inner join quarto q on s.id_quarto = q.codigo";
            sql = sql +" inner join status st on st.codigo = s.status";            
            sql = sql +" where s.status = 1"; 

            //System.out.println(sql);
            PreparedStatement tt = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = tt.executeQuery(sql);

            while(rs.next()){                                                                
                linomeCliente.add(rs.getString("nome"));
                lisobreNomeCliente.add(rs.getString("sobreNome"));
                livalorCalculado.add(rs.getString("valor_calculado"));
                lidataEntrada.add(rs.getString("data_entrada"));
                lidataSaida.add(rs.getString("data_saida"));
                lidias.add(rs.getString("dias"));
                listatus.add(rs.getString("status"));
                litipo.add(rs.getString("tipo"));
                idCliente.add(rs.getInt("id_cliente"));
                idQuarto.add(rs.getInt("id_quarto"));
                licodigo.add(rs.getInt("codigo"));
            }

        }catch(Exception ex){
            ex.getMessage();
        }

    }
    
    public void ValidarQuarto(int senha) throws SQLException{
      Connection con = (Connection) Conexao.getConexao();
      con.setAutoCommit(true);

      try {

            String sql = "Select * from quarto where codigo= ";
            sql = sql + senha;

            System.out.println(sql);
            PreparedStatement tt = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = tt.executeQuery(sql);

            while(rs.next()){
                
                setCodigo(rs.getInt("codigo"));
                System.out.println("Resultado "+senha);
             }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(testeConsulta.class.getName()).log(Level.SEVERE, null, ex);

        }finally{
            con.close();
        }
  }

    public void PegarQuarto(int senha) throws SQLException{
      Connection con = (Connection) Conexao.getConexao();
      con.setAutoCommit(true);

      try {

            String sql = "Select * from quarto where codigo= ";
            sql = sql + senha;

            System.out.println(sql);
            PreparedStatement tt = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = tt.executeQuery(sql);

            while(rs.next()){                
                licodigo.add(rs.getInt("codigo"));
                litipo.add(rs.getString("tipo"));
                livalor.add(rs.getString("valor"));
                listatus.add(rs.getString("status"));
             }
            
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(testeConsulta.class.getName()).log(Level.SEVERE, null, ex);

        }finally{
            con.close();
        }
  }

    public boolean Alterar(int codigo) throws SQLException{
       Connection con = (Connection) Conexao.getConexao();
       con.setAutoCommit(true);
         
         boolean ret = false;
         PreparedStatement tt = (PreparedStatement) con.prepareStatement("update quarto set tipo = ?, valor = ?, status = ? where codigo = ?");
         tt.setString(1, getTipo());
         tt.setFloat(2, getValor());
         tt.setInt(3, getStatus());
         tt.setInt(4, codigo);
         try{
             tt.executeUpdate();
             ret = true;
         }catch(SQLException ex){
             Logger.getLogger(testeConsulta.class.getName()).log(Level.SEVERE, null, ex);
             ret = false;
         }         
        return ret;
    }
    
    public void AlterarStatus(int codigo, String status) throws SQLException{
       Connection con = (Connection) Conexao.getConexao();
       con.setAutoCommit(true);
                  
         PreparedStatement tt = (PreparedStatement) con.prepareStatement("update quarto set status = ? where codigo = ?");
         tt.setString(1, status);
         tt.setInt(2, codigo);
         try{
             tt.executeUpdate();
             
         }catch(SQLException ex){
             Logger.getLogger(testeConsulta.class.getName()).log(Level.SEVERE, null, ex);
             
         }         
        
    }

    public void deletar(String codigo) throws SQLException{
       Connection con = (Connection) Conexao.getConexao();
       con.setAutoCommit(true);

       StringBuffer sql = new StringBuffer();
       sql.append("delete from quarto where  codigo=");
       sql.append(codigo);

       PreparedStatement tt = (PreparedStatement) con.prepareStatement(sql.toString());
       tt.execute(sql.toString());
       System.out.println(sql.toString());
    }
    
    public Boolean InserirQuarto() throws SQLException{
       Connection con = (Connection) Conexao.getConexao();
       con.setAutoCommit(true);
       
        boolean result = false;
        StringBuffer sql = new StringBuffer();
          
         try{
            sql.append("insert into quarto(tipo,valor,status) values('");
            PreparedStatement s = (PreparedStatement) con.prepareStatement(sql.toString());
            if(con!=null){
             
                sql.append(getTipo());
                sql.append("',");
                sql.append(getValor());
                sql.append(",");
                sql.append(getStatus());
                sql.append(")");
                System.out.println(sql.toString());
                s.executeUpdate(sql.toString());                    
                result = true;
                con.close();
          }
        } catch (SQLException ex) {
            Logger.getLogger(testeConsulta.class.getName()).log(Level.SEVERE, null, ex);
            result = false;
        }finally{
            con.close();
        }
         return result;
   }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
