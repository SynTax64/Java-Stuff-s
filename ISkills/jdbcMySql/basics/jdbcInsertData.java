package jdbcMySql.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcInsertData {
	public static void main(String[] args) {

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		try {
			String dbUrl = "jdbc:mysql://localhost:3306/demo";
			String username = "student";
			String pass = "student";
			// 1. Get a connection to database
			myConn = DriverManager.getConnection(dbUrl, username, pass);

			System.out.println("Database connection successfull!\n");

			// 2. Create statement
			myStmt = myConn.createStatement();

			// 3. Insert data into database
			int rowsAffected = myStmt
					.executeUpdate("INSERT INTO employees " + "(last_name, first_name, email, department, salary)"
							+ "values " + "('Wright','Eric','eric.wright@foo.com','HR',33000.00)");

			myRs = myStmt.executeQuery("SELECT * FROM employees");
			while (myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}
}
