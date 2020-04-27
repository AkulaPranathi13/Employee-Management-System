

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletRegister
 */
@WebServlet("/ServletRegister")
public class ServletRegister extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String firstName=request.getParameter("firstName");
	String lastName=request.getParameter("lastName");
	String uname=request.getParameter("uname");
	String pass=request.getParameter("pass");
	String address=request.getParameter("address");
	String contact=request.getParameter("contact");
	Employee emp=new Employee(firstName,lastName,uname,pass,address,contact);
	EmployeeDao dao=new EmployeeDao();
	 try {
		dao.registerEmployee(emp);
	} catch (Exception e) {
		e.printStackTrace();
	}
	 
	 
	    HttpSession session=request.getSession();
		session.setAttribute("username", uname);
		session.setAttribute("password", pass);
		response.sendRedirect("Welcome.jsp");

	
	
	
	
	
	}

}
