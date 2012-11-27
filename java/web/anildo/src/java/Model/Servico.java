/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Conexao.Conexao;
import Conexao.testeConsulta;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Date;
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
public class Servico {
  
    private int codigo;
    private float valor_calculado;
    private String data_entrada;
    private String data_saida;
    private int id_cli;
    private int id_quarto;
    private int dias;
    private int status;

  
  

    
    
    
    public  List licodigo1 = new ArrayList();
    public  List livalor_calculado = new ArrayList();
    public  List lidata_entrada = new ArrayList();
    public  List lidata_saida = new ArrayList();
    public  List licli = new ArrayList();
    public  List liquarto = new ArrayList();
    public  List lidias = new ArrayList();
    public  List listatus = new ArrayList();
  
  
  
  public Servico(){
  }

  public void Consultar() throws SQLException{
      Connection con = (Connection) Conexao.getConexao();
      con.setAutoCommit(true);

        try{
            String sql = "select * from servico";
            //System.out.println(sql);
            PreparedStatement tt = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = tt.executeQuery(sql);

            while(rs.next()){
                licodigo1.add(rs.getInt("codigo"));
                lidata_entrada.add(rs.getDate("data_entrada"));
                lidata_saida.add(rs.getDate("data_saida"));
                lidias.add(rs.getInt("dias"));
                liquarto.add(rs.getInt("id_quarto"));
                listatus.add(rs.getInt("id_status"));
                livalor_calculado.add(rs.getFloat("valor_acumulado"));
                licli.add(rs.getInt("id_cli"));
            }

        }catch(Exception ex){
            ex.getMessage();
        }

    }

   public void RelatorioMensal(String mes,String ano) throws SQLException{
      Connection con = (Connection) Conexao.getConexao();
      con.setAutoCommit(true);

        try{
            String sql = "select Month(s.data_saida) as mes, Year(s.data_saida) as ano, s.valor_calculado, c.nome, q.tipo ";      
            sql = sql + " from servico s";
            sql = sql + " inner join cliente c on c.codigo = s.id_cliente";
            sql = sql + " inner join quarto q on s.id_quarto = q.codigo";
            sql = sql + " where  Month(s.data_saida) = "+mes+" and Year(s.data_saida) = "+ano+"";
            
            
            PreparedStatement tt = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = tt.executeQuery(sql);

            while(rs.next()){                
                lidata_entrada.add(rs.getString("mes"));
                lidata_saida.add(rs.getString("ano"));                
                liquarto.add(rs.getString("nome"));
                listatus.add(rs.getString("tipo"));
                livalor_calculado.add(rs.getFloat("valor_calculado"));                     
                setValor_calculado(rs.getFloat("valor_calculado"));
            }

        }catch(Exception ex){
            ex.getMessage();
        }

    }

  
  public void ValidarServico(int senha) throws SQLException{
      Connection con = (Connection) Conexao.getConexao();
      con.setAutoCommit(true);

      try {

            String sql = "Select * from servico where codigo= ";
            sql = sql + senha;

            System.out.println(sql);
            PreparedStatement tt = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = tt.executeQuery(sql);

            while(rs.next()){
                setStatus(Integer.parseInt(rs.getString("nome")));
                setCodigo(rs.getInt("codigo"));                                                
             }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(testeConsulta.class.getName()).log(Level.SEVERE, null, ex);

        }finally{
            con.close();
        }
  }

    public void deletar(String codigo) throws SQLException{
       Connection con = (Connection) Conexao.getConexao();
       con.setAutoCommit(true);

       StringBuffer sql = new StringBuffer();
       sql.append( "delete from servico where  codigo=");
       sql.append(codigo);


       PreparedStatement tt = (PreparedStatement) con.prepareStatement(sql.toString());
       tt.execute(sql.toString());
       System.out.println(sql.toString());
    }

    public void Alterar(String codigo) throws SQLException{
        Connection con = (Connection) Conexao.getConexao();
       con.setAutoCommit(true);

         PreparedStatement tt = (PreparedStatement) con.prepareStatement("update servico set status = ?, dias = ?, id_quarto = ?, id_cliente = ?, "
         + "data_saida = ?,data_entrada = ?, valor_calculado = ? where codigo = ?");
         
         tt.setInt(1, getStatus());
         tt.setInt(2, getDias());
         tt.setInt(3, getId_quarto());
         tt.setInt(4, getId_cli());
         tt.setString(5, getData_saida());
         tt.setString(6, getData_entrada());
         tt.setFloat(7, getValor_calculado());
         tt.setString(8, codigo);
         
         tt.executeUpdate();
    }

    
    public void AlterarStatus(String codigo, String status) throws SQLException{
        Connection con = (Connection) Conexao.getConexao();
       con.setAutoCommit(true);

         PreparedStatement tt = (PreparedStatement) con.prepareStatement("update servico set status = ? where codigo = ?");
         
         tt.setString(1, status);  
         tt.setString(2, codigo);
         
         tt.executeUpdate();
    }
    
  public boolean InserirServico() throws SQLException{
      Connection con = (Connection) Conexao.getConexao();
      con.setAutoCommit(true);

      StringBuffer sql = new StringBuffer();
      
      boolean ret = false;

      try{
         sql.append("insert into servico(valor_calculado,data_entrada,data_saida,id_cliente,id_quarto, dias, status)values('");
         PreparedStatement s = (PreparedStatement) con.prepareStatement(sql.toString());
         if(con != null){             
             sql.append(getValor_calculado());
             sql.append("','");
             sql.append(getData_entrada());
             sql.append("','");
             sql.append(getData_saida());
             sql.append("',");
             sql.append(getId_cli());
             sql.append(",");
             sql.append(getId_quarto());
             sql.append(",");
             sql.append(getDias());
             sql.append(",");
             sql.append(getStatus());             
             sql.append(")");
             
             System.out.println(sql.toString());
                          
             s.executeUpdate(sql.toString());
             ret = true;
         }
         
      }catch(SQLException ex){
          Logger.getLogger(testeConsulta.class.getName()).log(Level.SEVERE, null, ex);
          ret = false;
      }
      return ret;
  }
  
  public static String TratamentoData(String datas)throws Exception{   
        StringBuilder data = new StringBuilder();   
        if((datas != null) && (!"".equals(datas))){   
            if(datas.length() <10 ){   
                throw new Exception("Inválido o tamanho da data!");   
            }             
            data.append(datas.substring(6,datas.length()));   
            data.append("/");   
            data.append(datas.substring(3,5));   
            data.append("/");   
            data.append(datas.substring(0,2));   
        }   
        else{   
            throw new Exception("Data vazio!");   
        }   
        return data.toString();   
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

    /**
     * @return the valor_calculado
     */
    public float getValor_calculado() {
        return valor_calculado;
    }

    /**
     * @param valor_calculado the valor_calculado to set
     */
    public void setValor_calculado(float valor_calculado) {
        this.valor_calculado = valor_calculado;
    }

    /**
     * @return the data_entrada
     */
    public String getData_entrada() {
        return data_entrada;
    }

    /**
     * @param data_entrada the data_entrada to set
     */
    public void setData_entrada(String data_entrada) {
        this.data_entrada = data_entrada;
    }

    /**
     * @return the data_saida
     */
    public String getData_saida() {
        return data_saida;
    }

    /**
     * @param data_saida the data_saida to set
     */
    public void setData_saida(String data_saida) {
        this.data_saida = data_saida;
    }

    /**
     * @return the id_cli
     */
    public int getId_cli() {
        return id_cli;
    }

    /**
     * @param id_cli the id_cli to set
     */
    public void setId_cli(int id_cli) {
        this.id_cli = id_cli;
    }

    /**
     * @return the id_quarto
     */
    public int getId_quarto() {
        return id_quarto;
    }

    /**
     * @param id_quarto the id_quarto to set
     */
    public void setId_quarto(int id_quarto) {
        this.id_quarto = id_quarto;
    }

    /**
     * @return the dias
     */
    public int getDias() {
        return dias;
    }

    /**
     * @param dias the dias to set
     */
    public void setDias(int dias) {
        this.dias = dias;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the licodigo1
     */
    public List getLicodigo1() {
        return licodigo1;
    }

    /**
     * @param licodigo1 the licodigo1 to set
     */
    public void setLicodigo1(List licodigo1) {
        this.licodigo1 = licodigo1;
    }

    /**
     * @return the linome
     */
    

}