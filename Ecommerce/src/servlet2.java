

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class servlet2
 */
@WebServlet("/servlet2")
public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = null;
		String item= null;
		int i=1;
		
		Enumeration e=null;
		
		
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession(true);
		user=(String)session.getAttribute("user");
		e = request.getParameterNames();
		
		while(e.hasMoreElements()) {
			String items = (String)e.nextElement();
			session.setAttribute("c" +i, items);
			i++;
		}
		session.setAttribute("counter", i+ "");
		
		
		RequestDispatcher dis = request.getRequestDispatcher("servlet3");
		dis.forward(request, response);
	}

}
