import java.sql.*;

public class GFG {
    public static void main(String[] args) throws Exception {

        // Register Driver Class (Derby Embedded or Client)
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish Connection (update URL, user, password as per your DB setup)
        String url = "jdbc:mysql://localhost:3306/baran";
        String username = "root";
        String password = "zenithpoo12$";
        Connection con = DriverManager.getConnection(url, username, password);

        // SQL Query with parameters
        String query = "SELECT * FROM students WHERE age = ? AND name = ?";

        // Create PreparedStatement
        PreparedStatement myStmt = con.prepareStatement(query);

        // Set parameters
        myStmt.setInt(1, 20);
        myStmt.setString(2, "Prateek");

        // Execute query
        ResultSet myRs = myStmt.executeQuery();

        // Display results
        System.out.println("Name\tAge");
        while (myRs.next()) {
            String name = myRs.getString("name");
            int age = myRs.getInt("age");
            System.out.println(name + "\t" + age);
        }

        // Close resources
        myRs.close();
        myStmt.close();
        con.close();
    }
}