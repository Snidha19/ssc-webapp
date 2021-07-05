package io.muic.ooc.webapp.servlet;

import io.muic.ooc.webapp.Routable;
import io.muic.ooc.webapp.service.DBService;
import io.muic.ooc.webapp.service.SecurityService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DelUserServlet extends HttpServlet implements Routable {
    protected SecurityService securityService = new SecurityService();
    protected DBService database = new DBService();

    @Override
    public String getMapping() {
        return "/delUser";
    }

    @Override
    public void setSecurityService(SecurityService securityService) {
        this.securityService = securityService;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (securityService.isAuthorized(request)) {
            String currUser = (String) request.getSession().getAttribute("username");
            request.setAttribute("currentUsername", currUser);
            String toDel = request.getParameter("username");
            System.out.println("to delete user : " + toDel);
            if (toDel.equals(currUser)) {
                String delError = "Cannot remove your own account";
                request.setAttribute("delError", delError);
                RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/home.jsp");
                rd.include(request, response);
                return;
            }
            database.delUser(toDel);
            response.sendRedirect("/");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
