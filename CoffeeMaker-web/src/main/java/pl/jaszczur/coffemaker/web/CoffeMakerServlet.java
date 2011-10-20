/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.jaszczur.coffemaker.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pl.jaszczur.coffemaker.domain.CappuccinoCoffee;
import pl.jaszczur.coffemaker.domain.Coffee;
import pl.jaszczur.coffemaker.domain.LatteCoffee;
import pl.jaszczur.coffemaker.ejb.CoffeeMakerFacadeLocal;

/**
 *
 * @author jaszczur
 */
public class CoffeMakerServlet extends HttpServlet {
    @EJB
    private CoffeeMakerFacadeLocal coffeeMakerFacade;

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //if (request.getContextPath().contains("make")) {
            String type = request.getParameter("type");
            Coffee c = createCoffee(type);
            coffeeMakerFacade.makeCoffee(c);
            
            request.setAttribute("coffee", c);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/coffee_display.jsp");
            dispatcher.forward(request, response);
            
        //}
    }
    
    

    private Coffee createCoffee(String type) {
        if ("cappuccino".equals(type)) {
            return new CappuccinoCoffee();
        } else {
            return new LatteCoffee();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
