package jdbcMySql.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementExample {

	public static void display(ResultSet results) throws SQLException {
		while (results.next()) {
			System.out.println(results.getString("first_name") + ", " + results.getString("last_name") + ", "
					+ results.getString("email") + ", " + results.getString("department") + ", "
					+ results.getString("salary"));
		}
	}

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		PreparedStatement preparedStatement = null;
		ResultSet results = null;

		String dbUrl = "jdbc:mysql://localhost:3306/demo";
		String username = "student";
		String pass = "student";

		conn = DriverManager.getConnection(dbUrl, username, pass);
		preparedStatement = conn.prepareStatement("SELECT * FROM employees WHERE salary > ? and department=?");
		preparedStatement.setDouble(1, 80000);
		preparedStatement.setString(2, "Legal");

		results = preparedStatement.executeQuery();
		display(results);
	}
}
