

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
 * Servlet implementation class tregister
 */
@WebServlet("/tregister")
public class tregister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tregister() {
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
		          
		String n=request.getParameter("Name");  
		String c=request.getParameter("Mobile");
		String e=request.getParameter("Email");
		String p=request.getParameter("Pass"); 
		String l=request.getParameter("Qualification");
		
		          
		try{  
			String jdbcURL = "jdbc:mysql://localhost:4306/teacher";
			String dbUser = "root";
			String dbPassword = "";

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
		  
		PreparedStatement ps=(PreparedStatement) con.prepareStatement(  
		"insert into regteacher values(?,?,?,?,?)");  
		  
		ps.setString(1,n);  
		ps.setString(2,c);  
		ps.setString(3,e);  
		ps.setString(4,p); 
		ps.setString(5,l); 
		          
		int i=ps.executeUpdate();  
		if(i>0)  
		out.print("You are successfully registered...");  
		      
		          
		}catch (Exception e2) {System.out.println(e2);}  
		          
		out.close();  
		}  

}
