package com.formHandling;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dataModels.User;

import com.petDatabaseHandling.LoginJDBC;
import com.petDatabaseHandling.RegistrationJDBC;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		// Retrieve parameters
        String email = request.getParameter("Email");
        String password = request.getParameter("Password");
        
        // Initialize database connection and user checking
        RegistrationJDBC robj = new RegistrationJDBC();
        Connection c = null;
        try {
            c = robj.connectTopetDB();
            User isUser = robj.isUserPresent(c, email, password);

            // Validate user credentials
            if (isUser == null || isUser.getEmail() == null) {
                request.setAttribute("emailError", "User not found");
                request.setAttribute("passwordError", "");
                RequestDispatcher rd = request.getRequestDispatcher("/jsp/login.jsp");
                rd.forward(request, response);
            } else if (!isUser.getPassword().equals(password)) {
                request.setAttribute("emailError", "");
                request.setAttribute("passwordError", "Password is incorrect");
                RequestDispatcher rd = request.getRequestDispatcher("/jsp/login.jsp");
                rd.forward(request, response);
            } else {
                LoginJDBC l = new LoginJDBC();
                try {
                    l.postLoginDetails(c, isUser);
                    HttpSession httpSession=request.getSession();
                    httpSession.setAttribute("userName", isUser.getFullname());
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                //request.setAttribute("userName",isUser.getFullname());
                //System.out.println(isUser.getFullname());
                response.sendRedirect(request.getContextPath() + "/jsp/homePage.jsp");
            }
        } finally {
            // Ensure the connection is closed
            if (c != null) {
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
