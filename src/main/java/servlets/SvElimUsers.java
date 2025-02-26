
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.Controller;

@WebServlet(name = "SvElimUsers", urlPatterns = {"/SvElimUsers"})
public class SvElimUsers extends HttpServlet {
    
    Controller control = new Controller();


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        
        control.eliminateUser(id);
        
        response.sendRedirect("SvUsers");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
