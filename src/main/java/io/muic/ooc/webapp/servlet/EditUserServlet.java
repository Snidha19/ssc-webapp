package io.muic.ooc.webapp.servlet;

import io.muic.ooc.webapp.Routable;
import io.muic.ooc.webapp.service.DBService;
import io.muic.ooc.webapp.service.SecurityService;
import io.muic.ooc.webapp.service.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditUserServlet extends HttpServlet implements Routable {
    protected SecurityService securityService = new SecurityService();
    protected DBService database = new DBService();

    @Override
    public String getMapping() {
        return "/editUser";
    }

    @Override
    public void setSecurityService(SecurityService securityService) {
        this.securityService = securityService;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String editUser = request.getParameter("username");
        System.out.println("editUser :" + editUser);
        User user = database.getUser(editUser);
        System.out.println(" user username :" + user.getUsername());
        System.out.println("user firstname:" + user.getFirstname());
        System.out.println("user lastname:" + user.getLastname());
        request.setAttribute("user", user);
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/editUser.jsp");
        rd.include(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (securityService.isAuthorized(request)) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            database.updateUser(username,password,firstname,lastname);
            response.sendRedirect("/");
            //}
//            else{
//                String error = "same username exists";
//                request.setAttribute("error", error);
//                RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/editUser.jsp");
//                rd.include(request, response);
//            }
        }
    }

}
