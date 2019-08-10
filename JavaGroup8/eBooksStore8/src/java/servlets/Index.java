/*
 * Login servlet
 */
package servlets;

import java.io.IOException;
import static java.lang.System.err;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gheor
 */
public class Index extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            /*
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Login page</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Index at " + request.getContextPath() + "</h1>");
            */
            // retrieve username and password introduced by user
        String username = request.getParameter("authenticationpage_username");
        String userpassword = request.getParameter("authenticationpage_password");
        String user = "test";
        String password = "test";
        String url = "jdbc:derby://localhost:1527/ebooksstore8;create=true";
        String driver = "org.apache.derby.jdbc.ClientDataSource40";
        
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try
        {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            String query = "SELECT SSN, USERNAME, PASSWORD, ROLE FROM TEST.USERS WHERE USERNAME= '" + username + "' AND PASSWORD= '" + userpassword +"'";
            resultSet = statement.executeQuery(query);
            if (resultSet.next())
            {
                //out.println("User exists in DB!");
                //go to Home page of site
                String role = resultSet.getString(4);
                if("admin".equals(role)){
                  request.getSession().setAttribute("actualUserRole", "admin");  
                }
                else if("user".equals(role)){
                    request.getSession().setAttribute("actualUserRole", "user"); 
                }
                response.sendRedirect("/eBooksStore8/eBooksStoreMainPage.jsp");
                request.getSession().setAttribute("validUser", true);
            }   
            else
            {
                //stay in Index.jsp page
                response.sendRedirect("/eBooksStore8/index.jsp");
            }
        }                
        catch (ClassNotFoundException | SQLException ex)
        {
            ex.printStackTrace(err);
        }
        finally
        {
            if (resultSet != null)
            {
                try
                {
                    resultSet.close();
                }
                catch (SQLException ex){}
            }
            if (statement != null)
            {
                try
                {
                    statement.close();
                }
                catch (SQLException ex){}
            }	
            if (connection != null)
            {
                try
                {
                    connection.close();
                }
                catch (SQLException ex){}
            }
        }
            // Show a message in this response page
            //out.println("</body>");
            //out.println("</html>");
        }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
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
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Login servlet";
    }// </editor-fold>

}
