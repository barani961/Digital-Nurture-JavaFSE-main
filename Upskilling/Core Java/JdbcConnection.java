import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnection {

    public static void main(String[] args) {

        // Database URL
        String url = "jdbc:mysql://localhost:3306/studentdb";

        // MySQL username and password
        String username = "root";
        String password = "zenithpoo12$";

        try {

            // 1. Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Database Connected!");

            // 3. Create Statement
            Statement stmt = con.createStatement();

            // 4. Execute SELECT Query
            String query = "SELECT * FROM students";

            ResultSet rs = stmt.executeQuery(query);

            // 5. Print Results
            System.out.println("Student Records:");

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + " " +name+ " " + age);
            }

            // 6. Close Connection
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}