

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class servlet1
 */
@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		int counter=0;
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		if(username.equals("Hitesh") && password.equals("123"))
		{
			out.println(username + "! Welcome to shop");
			counter=0;
			HttpSession session=request.getSession(true);
			session.setAttribute("user", username);
			

		}else {
			counter=1;
			out.println("sorry invalid");
		}
		
		if(counter == 0)
		{
			out.println("<html>");
			out.println("<body>");
			out.println("<form action=servlet2 method=POST>");
			out.println("<table width=500>");
			out.println("<tr> <td>itemNum</td> <td>name</td> <td>buy</td></tr>");
			out.println("<tr> <td>1</td> <td>Toy</td> <td><input type=checkbox value=toy name=c1></td></tr>");
			out.println("<tr> <td>2</td> <td>Fan</td> <td><input type=checkbox value=fan name=c2></td></tr>");
			out.println("<tr> <td>3</td> <td>Tv</td> <td><input type=checkbox value=tv name=c3></td></tr>");
			out.println("<tr> <td>4</td> <td>bike</td> <td><input type=checkbox value=bike name=c4></td></tr>");
			
			
			out.println("</table>");
			out.println("<input type=submit value=submit >");
			out.println("</form>");
			out.println("</body>");
			out.println("</html>");
		}
	}

}
