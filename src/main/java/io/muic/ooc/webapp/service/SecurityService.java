/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muic.ooc.webapp.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.commons.lang.StringUtils;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author gigadot
 */
public class SecurityService {

    DBService database = new DBService();
    
    public boolean isAuthorized(HttpServletRequest request){
        String username = (String) request.getSession().getAttribute("username");
       return (username != null && database.checkUser(username));
    }
    
    public boolean authenticate(String username, String password, HttpServletRequest request) {
        if (database.checkUser(username)){
            String passwordInDB = database.getPassword(username);
            boolean isMatched = BCrypt.checkpw(password, passwordInDB);
            if (isMatched) {
                request.getSession().setAttribute("username", username);
                return true;
         }
        }
        return false;
    }
    
    public void logout(HttpServletRequest request) {
        request.getSession().removeAttribute("username");
        request.getSession().invalidate();
    }
    
}
