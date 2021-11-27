import java.sql.*;
public class Sample {
    public static void main(String[] arg){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/14_nov_db","root","");
            System.out.println("successfully connected");
        }catch(Exception ee){
            System.out.println(ee.toString());
        }

    }

}
