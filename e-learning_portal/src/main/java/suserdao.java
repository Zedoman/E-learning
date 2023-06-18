import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class suserdao extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public suser checkLogin(String Username, String Password) throws SQLException,
    ClassNotFoundException {
String jdbcURL = "jdbc:mysql://localhost:4306/admin";
String dbUser = "root";
String dbPassword = "";

Class.forName("com.mysql.jdbc.Driver");
Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
String sql = "SELECT * FROM regstudent WHERE Username = ? and Password = ?";
PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
statement.setString(1, Username);
statement.setString(2, Password);

ResultSet result = (ResultSet) statement.executeQuery();

suser  user = null;

if (result.next()) {
    user = new suser();
    user.setName(result.getString("Name"));
    user.setUsername(Username);
}

connection.close();

return user;
}

}
