import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class LoginForm extends JFrame {
    JLabel l,l1,l2,l3,l4;
    JTextField t1;
    JPasswordField p1;
    JButton b1;
    LoginForm(){
        l=new JLabel("Login Form");
        l.setFont(new Font("Verdana",Font.PLAIN,22));
        l.setBounds(100,30,200,30);
        add(l);

        l1=new JLabel("UserName:- ");
        l1.setBounds(50,90,100,20);
        add(l1);

        t1=new JTextField();
        t1.setBounds(160,90,150,20);
        add(t1);

        l2=new JLabel("Password:- ");
        l2.setBounds(50,130,100,20);
        add(l2);

        p1=new JPasswordField();
        p1.setBounds(160,130,150,20);
        add(p1);

        b1=new JButton("login");
        b1.setBounds(180,170,100,25);
        b1.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov_db","root","");

                   Statement stmt=con.createStatement();
                   String qr="select * from users where user_name='"+t1.getText()+"' and password='"+p1.getText()+"'";
                   ResultSet rs=stmt.executeQuery(qr);
                     int flag=0;
                     while(rs.next()){
                         flag=1;
                     }
                     if(flag==0){
                         l3.setText("Invalid Credentials");
                     }
                     else{
                         l3.setText("Login Successfully");
                     }
                     con.close();
               }
               catch(Exception ee){
                   System.out.println(ee.toString());
               }
           }
        });
        add(b1);

        l3=new JLabel("Status");
        l3.setBounds(50,260,150,20);
        add(l3);

        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        LoginForm lf=new LoginForm();
    }
}
