

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String uname=request.getParameter("uname");
    String pass=request.getParameter("pass");
    EmployeeDao dao=new EmployeeDao();
    try {
		if(dao.checkEmployee(uname, pass))
		{
			HttpSession session=request.getSession();
			session.setAttribute("username", uname);
			session.setAttribute("password", pass);
			response.sendRedirect("Welcome.jsp");
		}
		else
		{
			response.sendRedirect("Login.jsp");
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

	

}
