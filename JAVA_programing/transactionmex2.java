//Example of transaction management in jdbc using PreparedStatement
//Let's see the simple example of transaction management using PreparedStatement.
import java.sql.*;
import java.io.*;
import java.util.*;
public class transactionmex2 {
    public static void main(String[] args){
        PreparedStatement ps;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov_db","root","");

            con.setAutoCommit(false);
            ps=con.prepareStatement("insert into users values(?,?,?)");

            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            while(true){
                System.out.println("Enter id:- ");
                String s1=br.readLine();
                int id=Integer.parseInt(s1);

                System.out.println("Enter name:- ");
                String name=br.readLine();

                System.out.println("Enter Password:- ");
                String s3=br.readLine();

                ps.setInt(1,id);
                ps.setString(2,name);
                ps.setString(3,s3);
                ps.executeUpdate();

                System.out.println("Commit/Rollback");
                String answer=br.readLine();
                if(answer.equals("Commit")){
                    con.commit();
                }
                if(answer.equals("Rollback")){
                    con.rollback();
                }
                System.out.println("Want to add More Record y/n");
                String ans=br.readLine();
                if(ans.equals("n")){
                    break;
                }
            }
            con.commit();
            System.out.println("Record saved Successfuly...");
            con.close();
        }
        catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
