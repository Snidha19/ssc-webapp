/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.2
 * Generated at: 2021-07-07 02:01:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import io.muic.ooc.webapp.service.User;
import java.util.List;
import io.muic.ooc.webapp.service.DBService;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("io.muic.ooc.webapp.service.User");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("io.muic.ooc.webapp.service.DBService");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<style>\n");
      out.write("    body {\n");
      out.write("        font-family: Arial, Helvetica, sans-serif;\n");
      out.write("        background: linear-gradient(to bottom, mistyrose, lightsalmon);\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("    }\n");
      out.write("    .user-profile {\n");
      out.write("        padding: 16px;\n");
      out.write("        background-color: lavenderblush;\n");
      out.write("        width: 400px;\n");
      out.write("        height: 100px;\n");
      out.write("        border-radius:20px;\n");
      out.write("        margin: 0 auto 0 auto;\n");
      out.write("        padding:20px 0px 70px 0px;\n");
      out.write("        border-color: snow;\n");
      out.write("        margin-top: 50px;\n");
      out.write("        justify-content: space-evenly;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .label1{\n");
      out.write("        align-self: center;\n");
      out.write("        margin-left: 140px;\n");
      out.write("        font-size: 25px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .table1 {\n");
      out.write("        border-collapse: collapse;\n");
      out.write("        width: 80%;\n");
      out.write("        margin-left: 40px;\n");
      out.write("        margin-top: 30px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    thead {\n");
      out.write("        text-align: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .td1 {\n");
      out.write("        padding: 0.25rem;\n");
      out.write("        border: 1px;\n");
      out.write("        text-align: left ;\n");
      out.write("        border-bottom: 1px solid #ccc;\n");
      out.write("        font-size: 16px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .td2 {\n");
      out.write("        padding: 0.25rem;\n");
      out.write("        border: 1px;\n");
      out.write("        text-align: right ;\n");
      out.write("        border-bottom: 1px solid #ccc;\n");
      out.write("        font-size: 16px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .user-table {\n");
      out.write("        background-color: lavenderblush;\n");
      out.write("        width: 70%;\n");
      out.write("        height: 500px;\n");
      out.write("        border-radius:20px;\n");
      out.write("        margin: 0 auto 0 auto;\n");
      out.write("        border-color: snow;\n");
      out.write("        margin-top: 30px;\n");
      out.write("        justify-content: space-evenly;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .label2{\n");
      out.write("        margin-left: 850px;\n");
      out.write("        align-self: center;\n");
      out.write("        font-size: 25px;\n");
      out.write("        padding-top: 30px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .button1 {\n");
      out.write("        background-color: lavenderblush;\n");
      out.write("        color: black;\n");
      out.write("        padding: 10px 10px;\n");
      out.write("        margin: 8px 0;\n");
      out.write("        margin-left: 400px;\n");
      out.write("        margin-top: 20px;\n");
      out.write("        border: none;\n");
      out.write("        cursor: pointer;\n");
      out.write("        width: 200px;\n");
      out.write("        border-radius:15px;\n");
      out.write("        font-size: 16px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .button2 {\n");
      out.write("        background-color: lavenderblush;\n");
      out.write("        color: black;\n");
      out.write("        padding: 10px 10px;\n");
      out.write("        margin: 8px 0;\n");
      out.write("        margin-left: 600px;\n");
      out.write("        margin-top: 20px;\n");
      out.write("        border: none;\n");
      out.write("        cursor: pointer;\n");
      out.write("        width: 200px;\n");
      out.write("        border-radius:15px;\n");
      out.write("        font-size: 16px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    button:hover {\n");
      out.write("        opacity: 0.8;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("    th {\n");
      out.write("        text-align: center;\n");
      out.write("        padding-top: 30px;\n");
      out.write("        padding-bottom: 30px;\n");
      out.write("        border-bottom: 1px solid #ccc;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .tr {\n");
      out.write("        padding: 0.25rem;\n");
      out.write("        text-align: center ;\n");
      out.write("        font-size: 16px;\n");
      out.write("        border-bottom: 1px solid #ccc;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .button3 {\n");
      out.write("        background-color: lightsalmon;\n");
      out.write("        color: black;\n");
      out.write("        padding: 10px 10px;\n");
      out.write("        margin: 8px 0;\n");
      out.write("        margin-left: 60px;\n");
      out.write("        margin-top: 30px;\n");
      out.write("        border: none;\n");
      out.write("        cursor: pointer;\n");
      out.write("        border-radius:15px;\n");
      out.write("        font-size: 16px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    p{\n");
      out.write("        margin-left: 730px;\n");
      out.write("        align-self: center;\n");
      out.write("        font-size: 18px;\n");
      out.write("        padding-top: 20px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    form{\n");
      out.write("        float:left;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("<body>\n");
      out.write("<head>\n");
      out.write("</head>\n");
      out.write("<div class =\"user-profile\">\n");
      out.write("    <label class=\"label1\"> User Profile </label>\n");
      out.write("<table class=\"table1\" >\n");
      out.write("    <tbody>\n");
      out.write("    <tr>\n");
      out.write("        <td class=\"td1\"> Username </td>\n");
      out.write("        <td class=\"td2\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentUser.getUsername()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" </td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td class=\"td1\"> Firstname </td>\n");
      out.write("        <td class=\"td2\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentUser.getFirstname()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" </td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td class=\"td1\"> Lastname </td>\n");
      out.write("        <td class=\"td2\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentUser.getLastname()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" </td>\n");
      out.write("    </tr>\n");
      out.write("    </tbody>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("<div class=\"label2\">\n");
      out.write("    <label > User List </label>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<table class=\"user-table\">\n");
      out.write("    <tr>\n");
      out.write("        <th>Username</th>\n");
      out.write("        <th>Firstname</th>\n");
      out.write("        <th>LastName</th>\n");
      out.write("        <th>&nbsp;</th>\n");
      out.write("        <th>&nbsp;</th>\n");
      out.write("    </tr>\n");
      out.write("    ");

        DBService database=new DBService();
        List<User> userList =  database.getUserList();
        for (User u: userList){
            String username = u.getUsername();
            String firstname = u.getFirstname();
            String lastname = u.getLastname();

    
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td class=\"tr\">");
      out.print(username);
      out.write("</td>\n");
      out.write("            <td class=\"tr\">");
      out.print(firstname);
      out.write("</td>\n");
      out.write("            <td class=\"tr\">");
      out.print(lastname);
      out.write("</td>\n");
      out.write("            <td class=\"tr\">\n");
      out.write("                <form method=\"get\" action=\"/delUser\">\n");
      out.write("                    <button class=\"button3\" type=\"submit\" onclick=\"return confirm('Are you sure you want to delete this user?');\" name=\"username\" value=\"");
      out.print(username);
      out.write("\">delete</button>\n");
      out.write("                </form>\n");
      out.write("            </td>\n");
      out.write("            <td class=\"tr\">\n");
      out.write("                <form method=\"get\" action=\"/editUser\">\n");
      out.write("                    <button class=\"button3\" type=\"submit\" name=\"username\" value=\"");
      out.print(username);
      out.write("\">edit</button>\n");
      out.write("                </form>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    ");

    }
        
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${delError}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("<form action=\"/addUser\" method=\"get\" >\n");
      out.write("    <button type=\"submit\" class=\"button1\">Add User</button>\n");
      out.write("</form>\n");
      out.write("<form action=\"/logOut\" method=\"get\">\n");
      out.write("<button type=\"submit\" class=\"button2\" action=\"/logOut\">Logout</button>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
