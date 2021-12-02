//program to save the above file in mytable1 table
import java.io.*;
import java.sql.*;
public class inserttxtfileex {
    public static void main(String[] args){
        PreparedStatement ps;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/29_nov_db","root","");
            System.out.println("Connection established...");

            File file=new File("E:\\images\\abc.txt");
            FileInputStream fis;

            con.setAutoCommit(false);
            fis=new FileInputStream(file);

            ps=con.prepareStatement("insert into mytable1(name,image)values(?,?)");
            ps.setString(1,"hello mahesh");
            ps.setAsciiStream(2,fis,(int)file.length());

            ps.executeUpdate();
            con.commit();

            ps.close();
            fis.close();
            con.close();
            System.out.println("Filed Saved Successfully In Table..");
        }
        catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
