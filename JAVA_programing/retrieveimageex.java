//program to retrieve image and save it into file folder
//create a folder named images1 in e: drive
import java.io.*;
import java.sql.*;
public class retrieveimageex {
    public static void main(String[] args)throws Exception{
        PreparedStatement ps;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/29_nov_db","root","");
            System.out.println("Connection Established....");

            File file=new  File("E:\\cat5.jpg");
            FileOutputStream fos=new FileOutputStream(file);
            byte b[];
            Blob blob;
            ps=con.prepareStatement("select * from mytable1");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                blob=rs.getBlob("image");
                b=blob.getBytes(1,(int)blob.length());
                fos.write(b);
            }
            ps.close();
            fos.close();
            con.close();
            System.out.println("Image retrieved successfully");

        }
        catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
