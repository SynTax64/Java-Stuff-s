package S19_Databases;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\databases\\testjava.db");
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts" +
                    "(name TEXT, phone INTEGER, email TEXT)");

           /* statement.execute("INSERT INTO contacts (name,phone,email) " +
                    "VALUES ('Niko1', 6565654,'domen1234@gmail.com')");

            statement.execute("INSERT INTO contacts (name,phone,email) " +
                    "VALUES ('Niko2', 6565623454,'nikon1234@gmail.com')");

            statement.execute("INSERT INTO contacts (name,phone,email) " +
                    "VALUES ('Niko3', 6564325654,'niko1234@gmail.com')");*/

//            statement.execute("UPDATE contacts SET phone=6546519684351 WHERE name='Niko1' ");
//            statement.execute("DELETE FROM contacts WHERE name='Niko1'");

            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while (results.next()) {
                System.out.println(results.getString("name") + " " +
                        results.getString("phone") + " " +
                        results.getString("email"));
            }

            results.close();
            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
