//program to delete record in students table
import java.sql.*;
public class Sample4 {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/15_11_db","root","");
            System.out.println("Successfully Connected");

            Statement stmt=con.createStatement();
            String qr="delete from studentss where stud_id=1";
            stmt.executeUpdate(qr);
            System.out.println("Deleted Successfully");
        }
        catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
