

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class servlet3
 */
@WebServlet("/servlet3")
public class servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public servlet3() {
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
		int price1=0;
		int price2=0;
		int price3=0;
		int price4=0;
		int totalprice=0;

		String username="";

		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession(true);
		username=(String)session.getAttribute("user");

		String counter=(String)session.getAttribute("counter");
		int count = Integer.parseInt(counter);

		for(int i=1; i<count ;i++) {
			String sitem [] = new String[count-1];
			sitem[i-1] = (String)session.getAttribute("c" + i);

			if((sitem[i-1]).equals("c1")) {
				price1 = 50;
			}
			if((sitem[i-1]).equals("c2")) {
				price2 = 50;
			}
			if((sitem[i-1]).equals("c3")) {
				price3 = 50;
			}
			if((sitem[i-1]).equals("c4")) {
				price4 = 50;
			}
		}
		
		totalprice=price1+price2+price3+price4;

		out.println(username + "Your bill is " + totalprice);
	}

}
