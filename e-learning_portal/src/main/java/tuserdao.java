import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class tuserdao extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public tuser checkLogin(String Name, String Pass) throws SQLException,
    ClassNotFoundException {
String jdbcURL = "jdbc:mysql://localhost:4306/teacher";
String dbUser = "root";
String dbPassword = "";

Class.forName("com.mysql.jdbc.Driver");
Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
String sql = "SELECT * FROM regteacher WHERE Name = ? and Pass = ?";
PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
statement.setString(1, Name);
statement.setString(2, Pass);

ResultSet result = (ResultSet) statement.executeQuery();

tuser  tuser = null;

if (result.next()) {
    tuser = new tuser();
    tuser.setEmail(result.getString("Email"));
    tuser.setName(Name);
}

connection.close();

return tuser;
}

}
