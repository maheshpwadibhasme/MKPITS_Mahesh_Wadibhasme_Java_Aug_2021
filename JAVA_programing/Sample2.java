//program to insert record into students tables
import java.sql.*;
public class Sample2 {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/15_11_db","root","");
                System.out.println("Successfully connected");

                Statement stmt=con.createStatement();

                String qr="insert into studentss (stud_id,stud_name,course_name) values(1,'raju','mava')";

                stmt.executeUpdate(qr);
                System.out.println("record saved successfully");

        }
        catch(Exception ee) {
            System.out.println(ee.toString());
        }
    }
}
