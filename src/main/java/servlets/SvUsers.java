
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logic.Controller;
import logic.User;

@WebServlet(name = "SvUsers", urlPatterns = {"/SvUsers"})
public class SvUsers extends HttpServlet {
    
    Controller control = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        List<User> usersList = new ArrayList<User>();

        usersList = control.getUsers();
        
        HttpSession mySession = request.getSession();
        mySession.setAttribute("usersList", usersList);
        
        System.out.println("User: " + usersList.get(0));
        
        response.sendRedirect("seeUsers.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        String userName = request.getParameter("userName");
        String pass = request.getParameter("password");
        String role = request.getParameter("role");
        
        control.createUser(userName, pass, role);
        
        response.sendRedirect("index.jsp");
    
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
