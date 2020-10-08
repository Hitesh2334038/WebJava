package com.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import org.apache.catalina.UserDatabase;

import com.dao.Userdatabase;
import com.model.User;

/**
 * Servlet implementation class Loginservlet
 */
@WebServlet("/Login")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Loginservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =response.getWriter();
		String logemail = request.getParameter("email");
		String logpass = request.getParameter("password");

		Userdatabase db =  new Userdatabase();
		User us =new User();
		us.setEmail(logemail);
		us.setPassword(logpass);
		String userValidate=db.login(us); 
		if(userValidate.equals("User_Role")){
			System.out.println("User Login");
			
			HttpSession session= request.getSession();
			session.setAttribute("User",logemail );
			request.setAttribute("userEmail", logemail);
			
			request.getRequestDispatcher("User.jsp").forward(request, response);
		}
		else if(userValidate.equals("Admin_Role")){
			System.out.println("Admin Login");
			
			HttpSession session= request.getSession();
			session.setAttribute("User",logemail );
			request.setAttribute("userEmail", logemail);
			
			request.getRequestDispatcher("Admin.jsp").forward(request, response);
		}
		else {
			System.out.println("Error message = "+userValidate);
            request.setAttribute("errMessage", userValidate);
			request.getRequestDispatcher("index.jsp").forward(request, response);
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
