import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDao {
	public void registerEmployee(Employee employee) throws Exception
	{
      String query="insert into employee(id,first_name,last_name,uname,pass,address,contact) values(default,?,?,?,?,?,?)";
      Class.forName("com.mysql.cj.jdbc.Driver");
  	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","2017028");
  	PreparedStatement st=con.prepareStatement(query);
    st.setString(1, employee.getFirstName());
    st.setString(2, employee.getLastname());
    st.setString(3, employee.getUserName());
    st.setString(4, employee.getPassword());
    st.setString(5, employee.getAddress());
    st.setString(6, employee.getContact());
    st.executeUpdate();
	}
public boolean checkEmployee(String uname,String pass) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","2017028");
	String query="select * from employee where uname=? and pass=?";
	PreparedStatement s=con.prepareStatement(query);
	s.setString(1, uname);
	s.setString(2, pass);

	ResultSet rs=s.executeQuery();
	if(rs.next())
		return true;

	
	return false;
}
}
