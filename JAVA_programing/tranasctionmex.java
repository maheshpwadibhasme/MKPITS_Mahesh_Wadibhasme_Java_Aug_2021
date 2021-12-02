//Let's see the simple example of transaction management using Statement.
import java.sql.*;
public class tranasctionmex {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov_db","root","");

            con.setAutoCommit(false);
            Statement stmt=con.createStatement();

            String qr="insert into users values(125,'veer','erx')";
            String qr2="insert into users values(112,'sam',34)";

            stmt.executeUpdate(qr);
            stmt.executeUpdate(qr2);

            System.out.println("Data Saved Successfully..");

            con.commit();
            con.close();
        }
        catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
