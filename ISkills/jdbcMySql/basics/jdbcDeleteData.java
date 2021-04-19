package jdbcMySql.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDeleteData {

	public static void displayEmployee(Connection myConn, String firstName, String lastName) throws SQLException {
		Statement myStmt = myConn.createStatement();
		ResultSet myRs = null;

		myRs = myStmt.executeQuery(
				"SELECT * FROM employees where first_name='" + firstName + "' and last_name='" + lastName + "'");
		while (myRs.next()) {
			System.out.println(
					myRs.getString("first_name") + ", " + myRs.getString("last_name") + ", " + myRs.getString("email"));
		}
	}

	public static void main(String[] args) {
		Connection conn = null;
		Statement statement = null;

		String dbUrl = "jdbc:mysql://localhost:3306/demo";
		String username = "student";
		String pass = "student";

		try {

			conn = DriverManager.getConnection(dbUrl, username, pass);
			System.out.println("Database connection successfull!\n");

			statement = conn.createStatement();

			System.out.println("BEFORE THE DELETING...");
			String firstName = "John";
			String lastName = "Doe";
			displayEmployee(conn, firstName, lastName);

			System.out.println("\nEXECUTING THE DELETE FOR: " + firstName + " " + lastName);
			int rowsEffected = statement.executeUpdate(
					"DELETE FROM employees " + "where last_name='" + lastName + "' and first_name='" + firstName + "'");
			System.out.println("AFTER THE DELETING...");
			displayEmployee(conn, firstName, lastName);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
