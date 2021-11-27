//program to update record in students table
import java.sql.*;
public class Sample3 {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/15_11_db","root","");
            System.out.println("Successfully  Connected");

            Statement stmt=con.createStatement();
            String qr="update studentss set course_name='mava' where stud_id=1";
            stmt.executeUpdate(qr);
            System.out.println("record updated successfully");
        }
        catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
