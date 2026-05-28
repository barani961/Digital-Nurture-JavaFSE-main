import java.sql.*;

class BankDAO {
    Connection con;

    BankDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankdb",
                    "root",
                    "zenithpoo12$");
            System.out.println("Database Connected");
        }
        
        catch(Exception e) {
            System.out.println(e);
        }
    }

    // Transfer Method
    void transferMoney(int fromAcc,int toAcc,double amount) {
        try {
            // Start Transaction
            con.setAutoCommit(false);

            // Debit Query
            String debitQuery="UPDATE accounts SET balance=balance-? WHERE acc_no=?";

            PreparedStatement debitPst=con.prepareStatement(debitQuery);

            debitPst.setDouble(1,amount);
            debitPst.setInt(2,fromAcc);
            int debit=debitPst.executeUpdate();

            // Credit Query
            String creditQuery="UPDATE accounts SET balance=balance+? WHERE acc_no=?";
            PreparedStatement creditPst=con.prepareStatement(creditQuery);

            creditPst.setDouble(1,amount);
            creditPst.setInt(2,toAcc);

            int credit=creditPst.executeUpdate();

            // Commit Transaction
            if(debit>0 && credit>0) {
                con.commit();
                System.out.println("Money Transferred Successfully");

            } 
            
            else 
                {
                con.rollback();
                System.out.println("Transaction Failed");
            }
        }

        catch(Exception e) 
        {
            try {
                con.rollback();
            } 

            catch(Exception ex) {
                System.out.println(ex);
            }
            System.out.println(e);
        }
    }
}

public class TransactionHandlingDemo {
    public static void main(String[] args) {
        BankDAO dao=new BankDAO();
        dao.transferMoney(101,102,5000);
    }
}