

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class slogin
 */
@WebServlet("/tlogin")
public class tlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tlogin() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Name = request.getParameter("Name");
        String Pass = request.getParameter("Pass");
         
        tuserdao userDao = new tuserdao();
         
        try {
            tuser tuser = userDao.checkLogin(Name, Pass);
            String destPage = "tlogin.jsp";
             
            if (tuser != null) {
                HttpSession session = request.getSession();
                session.setAttribute("tuser", tuser);
                destPage = "index3.jsp";
            } else {
                String message = "Invalid Username/Password";
                request.setAttribute("message", message);
            }
             
            RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
            dispatcher.forward(request, response);
             
        } catch (SQLException | ClassNotFoundException ex) {
            throw new ServletException(ex);
        }
	}

}
