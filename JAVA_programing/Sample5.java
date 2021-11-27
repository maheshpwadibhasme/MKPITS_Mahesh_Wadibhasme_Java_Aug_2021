//program to select record from student table
import java.sql.*;
public class Sample5 {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/15_11_db","root","");
            System.out.println("Successfully Connected");

            Statement stmt=con.createStatement();
            String qr="select * from studentss";
            ResultSet rs=stmt.executeQuery(qr);
            while(rs.next()){
                System.out.println("stud_id:- "+rs.getInt(1)+"  stud_name:- "+rs.getString(2)+"  course_name:- "+rs.getString(2));
            }
        }
        catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
