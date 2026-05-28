import java.sql.*;

class StudentDAO {
    
    Connection con;
    StudentDAO() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "zenithpoo12$");
            System.out.println("Database Connected");
        } 

        catch(Exception e) {
            System.out.println(e);
        }
    }

    // Insert Method
    void insertStudent(int id,String name,int age,String course) {

        try {
            String query="INSERT INTO students VALUES(?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setInt(1,id);
            pst.setString(2,name);
            pst.setInt(3,age);
            pst.setString(4,course);
            pst.executeUpdate();
            System.out.println("Record Inserted");
        }
     
         catch(Exception e) {
            System.out.println(e);
        }
    }

    // Update Method
    void updateStudent(int id,String course) {
        try {
            String query="UPDATE students SET course=?WHERE id=?";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,course);
            pst.setInt(2,id);
            pst.executeUpdate();
            System.out.println("Record Updated");
        } 
        
        catch(Exception e) {
            System.out.println(e);
        }
        
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentDAO dao=new StudentDAO();
        dao.insertStudent(101,"Raghu",39,"CSE");
        dao.updateStudent(101,"ECE");
    }
}