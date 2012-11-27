/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.Cliente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author SIMATTOS
 */
public class NewCadastrarClientes extends HttpServlet {

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
                    out.println("alert('Cadastrado com Sucesso!')");
                 out.println("</script>");
                 
                 String irParaJsp = "/listar_cliente.jsp";
                 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(irParaJsp);
                 dispatcher.include(request,response);
             }else{
                 out.println("<script>");
                    out.println("alert('Erro ao Cadastrar!')");
                 out.println("</script>");
                 String irParaJsp = "/cliente.jsp";
                 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(irParaJsp);
                 dispatcher.include(request,response);
             }
                                                
            
        } catch (SQLException ex) {
            Logger.getLogger(NewCadastrarQuartos.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(NewCadastrarClientes.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(NewCadastrarClientes.class.getName()).log(Level.SEVERE, null, ex);
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
