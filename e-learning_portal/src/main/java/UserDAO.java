import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

/**
 * Servlet implementation class UserDAO
 */
public class UserDAO extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public User checkLogin(String email, String password) throws SQLException,
    ClassNotFoundException {
String jdbcURL = "jdbc:mysql://localhost:4306/admin";
String dbUser = "root";
String dbPassword = "";

Class.forName("com.mysql.jdbc.Driver");
Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
String sql = "SELECT * FROM users WHERE email = ? and password = ?";
PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
statement.setString(1, email);
statement.setString(2, password);

ResultSet result = (ResultSet) statement.executeQuery();

User user = null;

if (result.next()) {
    user = new User();
    user.setFullname(result.getString("fullname"));
    user.setEmail(email);
}

connection.close();

return user;
}

}
