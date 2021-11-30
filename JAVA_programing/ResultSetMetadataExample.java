import java.sql.*;
public class ResultSetMetadataExample {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov_db","root","");

        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from users");

        ResultSetMetaData rsMetaData=rs.getMetaData();
        System.out.println("Numbers Of Columns: "+rsMetaData.getColumnCount());

        System.out.println("Column Label:"+rsMetaData.getColumnLabel(3));

        System.out.println("Column Name:"+rsMetaData.getColumnName(2));

        System.out.println("Tabel Name:"+rsMetaData.getTableName(1));
    }
}
