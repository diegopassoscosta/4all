/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import Model.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SIMATTOS
 */
public class NewPre_reservas extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Cliente cliente = new Cliente();
        
        try {            
            
             cliente.setNome(request.getParameter("nome"));             
             cliente.setSobreNome(request.getParameter("sobrenome"));
             cliente.setEndereco(request.getParameter("endereco"));
             cliente.setDataNascimento(request.getParameter("data"));
             cliente.setIdade(Integer.parseInt(request.getParameter("idade")));
             cliente.setSexo(request.getParameter("sexo"));
             cliente.setCpf(request.getParameter("cpf"));
             cliente.setRg(request.getParameter("rg"));
             cliente.setTelefone(request.getParameter("telefone"));
             cliente.setCel(request.getParameter("cel"));
             
             
             if(cliente.Cadastro()){
                 out.println("<script>");
                    out.println("alert('Cadastrado com Sucesso, Em breve entraremos em contato.');window.opener.location.reload();window.close();");
                 out.println("</script>");                                  
             }else{
                 out.println("<script>");
                    out.println("alert('Erro ao Cadastrar!');window.opener.location.reload();window.close();");
                 out.println("</script>");
                 
             }
                                                
            
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(NewPre_reservas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(NewPre_reservas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
