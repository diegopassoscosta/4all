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
public class Cliente extends Pessoa {
   private String nome;
   private String sobreNome;
   private String endereco;
   private String dataNascimento;
   private int idade;
   private String sexo;
   private String cpf;
   private String rg;
   private int codigo;
   private String telefone;
   private String cel;
   private int status;
   
   

  public  List licodigo1 = new ArrayList();
  public  List listanome = new ArrayList();
  public  List listaendereco = new ArrayList();
  public  List lidatanascimento = new ArrayList();
  public  List liidade1 = new ArrayList();
  public  List  lisexo1 = new ArrayList();
  public  List  licpf1 = new ArrayList();
  public  List lirg1 = new ArrayList();
  public List listartelefone = new ArrayList();
  public List listarcel = new ArrayList();
  public List lisobrenome = new ArrayList();


   public Cliente(){
   }


    public boolean Cadastro() throws SQLException{
        Connection con = (Connection) Conexao.getConexao();
        con.setAutoCommit(true);
        
        boolean result = false;
        
        StringBuffer sql = new StringBuffer();
        try{
            sql.append("insert into cliente(nome,sobrenome,endereco,datanascimento,idade,sexo,cpf,rg,telefone,cel)values('");
            PreparedStatement pt = (PreparedStatement) con.prepareStatement(sql.toString());
            if(con != null){
                sql.append(getNome());
                sql.append("','");
                sql.append(getSobreNome());
                sql.append("','");
                sql.append(getEndereco());
                sql.append("','");
                sql.append(getDataNascimento());
                sql.append("',");
                sql.append(getIdade());
                sql.append(",'");
                sql.append(getSexo());
                sql.append("','");
                sql.append(getCpf());
                sql.append("','");
                sql.append(getRg());
                sql.append("','");
                sql.append(getTelefone());
                sql.append("','");
                sql.append(getCel());
                sql.append("')");
                                
                pt.executeUpdate(sql.toString());
                result = true;
            }
           
        }catch(SQLException ex){
            ex.getMessage();
            result = false;
        }
        return result;
    }

    public void ValidarCliente(int senha) throws SQLException{
      Connection con = (Connection) Conexao.getConexao();
      con.setAutoCommit(true);

      try {

            String sql = "Select * from cliente where codigo= ";
            sql = sql + senha;

            System.out.println(sql);
            PreparedStatement tt = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = tt.executeQuery(sql);

            while(rs.next()){                                                
                licodigo1.add(rs.getInt("codigo"));
                listanome.add(rs.getString("nome"));
                licpf1.add(rs.getString("cpf"));
             }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(testeConsulta.class.getName()).log(Level.SEVERE, null, ex);

        }finally{
            con.close();
        }
  }


    public void ordenarCrescente() throws SQLException{
        Connection con = (Connection) Conexao.getConexao();
        con.setAutoCommit(true);

        try{
            String sql = "select * from cliente order by nome desc";
            //System.out.println(sql);
            PreparedStatement tt = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = tt.executeQuery(sql);

            while(rs.next()){
                licodigo1.add(rs.getInt("codigo"));
                listanome.add(rs.getString("nome"));
                listaendereco.add(rs.getString("endereco"));
                lidatanascimento.add(rs.getString("data_nascimento"));
                liidade1.add(rs.getInt("idade"));
                lisexo1.add(rs.getString("sexo"));
                licpf1.add(rs.getString("cpf"));
                lirg1.add(rs.getString("rg"));

                System.out.println(listanome);

            }

        }catch(Exception ex){
            ex.getMessage();
        }

    }

    public void deletar(String codigo) throws SQLException{
       Connection con = (Connection) Conexao.getConexao();
       con.setAutoCommit(true);

       StringBuffer sql = new StringBuffer();
       sql.append( "delete from cliente where  codigo=");
       sql.append(codigo);
       

       PreparedStatement tt = (PreparedStatement) con.prepareStatement(sql.toString());
       tt.execute(sql.toString());
       System.out.println(sql.toString());
    }

    public void Alterar(String codigo) throws SQLException{
       Connection con = (Connection) Conexao.getConexao();
       con.setAutoCommit(true);

         PreparedStatement tt = (PreparedStatement) con.prepareStatement("update cliente set nome = ?, endereco = ?, idade = ? where codigo = ?");
         tt.setString(1, getNome());
         tt.setString(2, getEndereco());
         tt.setInt(3, getIdade());
         tt.setString(4, codigo);
         tt.executeUpdate();
         
    }
    
    public void AlterarStatus(String codigo,String status) throws SQLException{
       Connection con = (Connection) Conexao.getConexao();
       con.setAutoCommit(true);

         PreparedStatement tt = (PreparedStatement) con.prepareStatement("update cliente set status = ? where codigo = ?");
         tt.setString(1, status);                  
         tt.setString(2, codigo);
         tt.executeUpdate();
         
    }
    
    public void Consultar() throws SQLException{
        Connection con = (Connection) Conexao.getConexao();
        con.setAutoCommit(true);

        try{

             String sql = "select * from cliente";
             PreparedStatement tt = (PreparedStatement) con.prepareStatement(sql);
             ResultSet rs = tt.executeQuery(sql);

            while(rs.next()){
                licodigo1.add(rs.getInt("codigo"));
                listanome.add(rs.getString("nome"));
                lisobrenome.add(rs.getString("sobreNome"));
                listaendereco.add(rs.getString("endereco"));
                lidatanascimento.add(rs.getString("dataNascimento"));
                liidade1.add(rs.getInt("idade"));
                lisexo1.add(rs.getString("sexo"));
                licpf1.add(rs.getString("cpf"));
                lirg1.add(rs.getString("rg"));
                listartelefone.add(rs.getString("telefone"));
                listarcel.add(rs.getString("cel"));
            }

        }catch(Exception ex){
            ex.getMessage();
        }

    }

   public void VerificarReservaInativa() throws SQLException{
        Connection con = (Connection) Conexao.getConexao();
        con.setAutoCommit(true);

        try{

             String sql = "select * from cliente";
             sql = sql + " where status is null";
             sql = sql + " and codigo not in(select id_cliente from servico)";                          
             
             PreparedStatement tt = (PreparedStatement) con.prepareStatement(sql);
             ResultSet rs = tt.executeQuery(sql);

            while(rs.next()){
                licodigo1.add(rs.getInt("codigo"));
                listanome.add(rs.getString("nome"));
                lisobrenome.add(rs.getString("sobreNome"));
                listaendereco.add(rs.getString("endereco"));
                lidatanascimento.add(rs.getString("dataNascimento"));
                liidade1.add(rs.getInt("idade"));
                lisexo1.add(rs.getString("sexo"));
                licpf1.add(rs.getString("cpf"));
                lirg1.add(rs.getString("rg"));
                listartelefone.add(rs.getString("telefone"));
                listarcel.add(rs.getString("cel"));
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
     * @return the sobreNome
     */
    public String getSobreNome() {
        return sobreNome;
    }

    /**
     * @param sobreNome the sobreNome to set
     */
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the dataNascimento
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the cpd
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpd the cpd to set
     */
    public void setCpf(String cpd) {
        this.cpf = cpd;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
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
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the cel
     */
    public String getCel() {
        return cel;
    }

    /**
     * @param cel the cel to set
     */
    public void setCel(String cel) {
        this.cel = cel;
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

}
