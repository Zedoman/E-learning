import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class sregister
 */
@WebServlet("/sregister")
public class sregister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sregister() {
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
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter(); 
		
		
		String k=request.getParameter("Sno");          
		String n=request.getParameter("Name");  
		String p=request.getParameter("Interested_in");  
		String e=request.getParameter("Ph_Num");  
		String c=request.getParameter("Email"); 
		String l=request.getParameter("Password");
		String o=request.getParameter("Recent_Degree"); 
		String d=request.getParameter("Username"); 
		          
		try{  
			String jdbcURL = "jdbc:mysql://localhost:4306/admin";
			String dbUser = "root";
			String dbPassword = "";

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
		  
		PreparedStatement ps=(PreparedStatement) con.prepareStatement(  
		"insert into regstudent values(?,?,?,?,?,?,?,?)");  
		 
		ps.setString(1,k);
		ps.setString(2,n);  
		ps.setString(3,p);  
		ps.setString(4,e);  
		ps.setString(5,c); 
		ps.setString(6,l); 
		ps.setString(7,o);
		ps.setString(8,d);
		          
		int i=ps.executeUpdate();  
		if(i>0)  
		out.print("You are successfully registered...");  
		      
		          
		}catch (Exception e2) {System.out.println(e2);}  
		          
		out.close();  
		}  

}