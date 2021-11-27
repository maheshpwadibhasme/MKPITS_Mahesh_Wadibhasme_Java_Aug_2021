//create a table users (userid,username,password)
////create a form to insert , update ,delete and search records from student table.
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class UsersFrom extends JFrame{
    JLabel l1,l2,l3,l4,l5;
    JTextField t1;
    JPasswordField p1;
    JButton b1,b2,b3,b4;

        UsersFrom(){
            l1=new JLabel("UserName:-");
            l1.setBounds(20,50,100,20);
            add(l1);

            t1=new JTextField();
            t1.setBounds(130,50,100,20);
            add(t1);

            l2=new JLabel("Password:-");
            l2.setBounds(20,100,100,20);
            add(l2);

            p1=new JPasswordField();
            p1.setBounds(130,100,100,20);
            add(p1);

            b1=new JButton("save");
            b1.setBounds(20,150,100,25);
            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov_db","root","");

                        Statement stmt=con.createStatement();
                        String qr="insert into users(user_name,password) values('"+t1.getText()+"','"+p1.getText()+"')";
                        stmt.executeUpdate(qr);
                        con.close();
                        l3.setText("Record Saved");
                    }
                    catch(Exception ee){
                        System.out.println(ee.toString());
                    }
                }
            });
            add(b1);

            b2=new JButton("update");
            b2.setBounds(130,150,100,25);
            b2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov_db","root","");

                        Statement stmt=con.createStatement();
                        String qr="update users set password='"+p1.getText()+"' where user_name='"+t1.getText()+"'";
                        stmt.executeUpdate(qr);
                        con.close();
                        l3.setText("Record Update");
                    }
                    catch(Exception ee){
                        System.out.println(ee.toString());
                    }
                }
            });
            add(b2);

            b3=new JButton("Delete");
            b3.setBounds(240,150,100,25);
            b3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov_db","root","");

                        Statement stmt=con.createStatement();
                        String qr="delete from users where user_name ='"+t1.getText()+"'";
                        stmt.executeUpdate(qr);
                        con.close();
                        l3.setText("Record Deleted");
                    }
                    catch(Exception ee){
                        System.out.println(ee.toString());
                    }
                }
            });
            add(b3);

            b4=new JButton("search");
            b4.setBounds(350,150,100,25);
            b4.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e){
                   try{
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov_db","root","");

                       Statement stmt=con.createStatement();
                       String qr="select * from users where user_name = '"+t1.getText()+"'";
                       ResultSet rs=stmt.executeQuery(qr);
                       int flag=0;
                       while(rs.next()){
                           flag=1;
                           p1.setText(rs.getString(3));
                       }
                       if(flag==0){
                           l3.setText("No Record Found");
                       }
                       else{
                           l3.setText("Record is Found");
                       }
                       con.close();
                   }
                   catch(Exception ee){
                       System.out.println(ee.toString());
                   }
               }
            });
            add(b4);

            l3=new JLabel("Status");
            l3.setBounds(20,190,100,20);
            add(l3);

            setSize(500,400);
            setLayout(null);
            setVisible(true);
        }
        public static void main(String[] args){
            UsersFrom uf=new UsersFrom();
        }
}
