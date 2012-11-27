/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
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
public class NewConfirmarReserva extends HttpServlet {

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
            throws ServletException, IOException, SQLException, ParseException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            Model.Servico servico = new Model.Servico(); 
            
            Model.Quarto quarto = new Model.Quarto();
            
            servico.setDias(Integer.parseInt(request.getParameter("dias")));
            servico.setId_cli(Integer.parseInt(request.getParameter("id_cliente")));
            servico.setId_quarto(Integer.parseInt(request.getParameter("id_quarto1")));                        
            servico.setValor_calculado(Float.parseFloat(request.getParameter("valor_acumulado")));
            servico.setStatus(Integer.parseInt(request.getParameter("id_status")));
                        
            String data_entrada = servico.TratamentoData(request.getParameter("data_entrada"));
            
            String data_saida = servico.TratamentoData(request.getParameter("data_saida"));
                                    
            servico.setData_entrada(data_entrada);
            servico.setData_saida(data_saida);
                        
            if(servico.InserirServico()){                                                
                quarto.AlterarStatus(Integer.parseInt(request.getParameter("id_quarto1")),"1");                
                out.println("<script>");
                    out.println("alert('Reserva confirmada com sucesso!');window.opener.location.reload();window.close();");
                out.println("</script>");                                
            }else{
                out.println("<script>");
                    out.println("alert('Erro: reserva não confirma!');window.opener.location.reload();window.close();");
                out.println("</script>");                
            }
            
        }catch(SQLException ex){
            Logger.getLogger(NewConfirmarReserva.class.getName()).log(Level.SEVERE, null, ex);
        }finally {            
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
            Logger.getLogger(NewConfirmarReserva.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(NewConfirmarReserva.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(NewConfirmarReserva.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(NewConfirmarReserva.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(NewConfirmarReserva.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(NewConfirmarReserva.class.getName()).log(Level.SEVERE, null, ex);
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
