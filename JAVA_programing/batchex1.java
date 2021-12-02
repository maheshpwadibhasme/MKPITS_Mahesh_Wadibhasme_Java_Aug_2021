//Let's see the simple example of batch processing in jdbc. It follows following steps:
import java.sql.*;
import java.io.*;
import java.util.*;
public class batchex1 {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov_db","root","");

            con.setAutoCommit(false);
            Statement stmt=con.createStatement();

            stmt.addBatch("insert into users values(101,'mohan','asd')");
            stmt.addBatch("insert into users values(102,'soma','dsp')");
            stmt.executeBatch();

            con.commit();
            con.close();
            System.out.println("Record Saved");
        }
        catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
