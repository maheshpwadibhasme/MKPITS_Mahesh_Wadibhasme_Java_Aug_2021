//Example of batch processing using PreparedStatement
import java.sql.*;
import java.io.*;
import java.util.*;
public class batchps2 {
    public static void main(String[] args){
        PreparedStatement ps;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov_db","root","");

            ps=con.prepareStatement("insert into users values(?,?,?)");

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            while(true){
                System.out.println("Enter id:- ");
                String s1=br.readLine();
                int id=Integer.parseInt(s1);

                System.out.println("enter name:- ");
                String name=br.readLine();

                System.out.println("enter password");
                String s2=br.readLine();

                ps.setInt(1,id);
                ps.setString(2,name);
                ps.setString(3,s2);

                ps.addBatch();
                System.out.println("Want to add more record y/n");
                String ans=br.readLine();

                if(ans.equals("n")){
                    break;
                }
            }
            ps.executeBatch();
            System.out.println("record saved...");
        }
        catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
