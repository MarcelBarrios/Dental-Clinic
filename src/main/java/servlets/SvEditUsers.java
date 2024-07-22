
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logic.Controller;
import logic.User;

@WebServlet(name = "SvEditUsers", urlPatterns = {"/SvEditUsers"})
public class SvEditUsers extends HttpServlet {
    
    Controller control = new Controller();


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        
        User use = control.getUser(id);
        
        HttpSession mySession = request.getSession();
        mySession.setAttribute("useEdit", use);
        
        System.out.println("The user is: " + use.getUser_name());
        
        response.sendRedirect("editUsers.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String role = request.getParameter("role");        
        
        User use = (User) request.getSession().getAttribute("useEdit");
        use.setUser_name(userName);
        use.setPassword(password);
        use.setRole(role);
        
        control.editUser(use);
        
        response.sendRedirect("SvUsers");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
