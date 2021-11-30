//create a program to insert cat1.jpg image into mytable1
import java.io.*;
import java.sql.*;
public class insertimageex {
    public static void main(String[] args)throws Exception{
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/29_nov_db","root","");
            System.out.println("Connection Established");
            File file=new File("E:\\cat1.jpg");
            FileInputStream fis=new FileInputStream(file);

            PreparedStatement ps=con.prepareStatement("insert into mytable1(name,image)values(?,?)");
            ps.setString(1,"cat1");
            ps.setBinaryStream(2,fis,(int)file.length());
            ps.executeUpdate();
            System.out.println("image saved in database successfully");

        }
        catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
