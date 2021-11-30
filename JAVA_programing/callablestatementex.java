import javax.management.Query;
import java.sql.*;
public class callablestatementex {
    static final String QUERY="{call getEmpName(?,?)}";
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/14_nov_db","root","");

            CallableStatement stmt=con.prepareCall(QUERY);
            stmt.setInt(1,2);
            stmt.registerOutParameter(2,Types.VARCHAR);
            stmt.execute();
            String ename=stmt.getString(2);
            System.out.println
                    ("empname name for empno 2 is " + ename);
        }
        catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
