package jdbcMySql.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcUpdateData {

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

		Connection myConn = null;
		Statement myStmt = null;

		try {
			String dbUrl = "jdbc:mysql://localhost:3306/demo";
			String username = "student";
			String pass = "student";

			// 1. Get a connection to database
			myConn = DriverManager.getConnection(dbUrl, username, pass);

			System.out.println("Database connection successfull!\n");

			// 2. Create statement
			myStmt = myConn.createStatement();

			System.out.println("BEFORE THE UPDATE...");
			String firstName = "John";
			String lastName = "Doe";

			displayEmployee(myConn, firstName, lastName);

			// Update data in database
			System.out.println("\nEXECUTING THE UPDATE FOR: " + firstName + " " + lastName);
			int rowsAffected = myStmt.executeUpdate("update employees " + "set email='john.doe@luv2code.com' "
					+ "where last_name='Doe' and first_name='John'");

			System.out.println("AFTER THE UPDATE...");
			displayEmployee(myConn, firstName, lastName);

		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}
}
