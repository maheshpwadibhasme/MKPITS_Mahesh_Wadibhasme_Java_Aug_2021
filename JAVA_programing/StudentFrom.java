//create a student table ( rno,name,address,email,mobno)
//create a form to insert , update ,delete and search records from student table.
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
public class StudentFrom extends JFrame {
    JLabel l,l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3,b4;
    StudentFrom(){
        l=new JLabel("Student Registration Form");
        l.setBounds(60,30,250,30);
        l.setFont(new Font("Verdana", Font.PLAIN, 18));
        add(l);

        l1=new JLabel("Roll No:-");
        l1.setBounds(50,90,150,20);
        add(l1);

        t1=new JTextField();
        t1.setBounds(170,90,150,20);
        add(t1);

        l2=new JLabel("Student Name:-");
        l2.setBounds(50,120,150,20);
        add(l2);

        t2=new JTextField();
        t2.setBounds(170,120,150,20);
        add(t2);

        l3=new JLabel("Student Address:-");
        l3.setBounds(50,150,150,20);
        add(l3);

        t3=new JTextField();
        t3.setBounds(170,150,150,20);
        add(t3);

        l4=new JLabel("Student Email:-");
        l4.setBounds(50,180,150,20);
        add(l4);

        t4=new JTextField();
        t4.setBounds(170,180,150,20);
        add(t4);

        l5=new JLabel("Mobile No:-");
        l5.setBounds(50,210,150,20);
        add(l5);

        t5=new JTextField();
        t5.setBounds(170,210,150,20);
        add(t5);

        b1=new JButton("save");
        b1.setBounds(20,260,100,25);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov_db","root","");

                    Statement stmt=con.createStatement();
                    String qr="insert into student(rno,name,address,email,mobno) values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"')";
                    stmt.executeUpdate(qr);
                    l6.setText("Record  saved");
                }
                catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b1);

        b2=new JButton("Update");
        b2.setBounds(130,260,100,25);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov_db","root","");

                    Statement stmt=con.createStatement();
                    String qr="update student set address='"+t3.getText()+"'where name='"+t2.getText()+"'";
                    stmt.executeUpdate(qr);
                    l6.setText("Record Updated");
                }
                catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b2);

        b3=new JButton("Delete");
        b3.setBounds(240,260,100,25);
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov_db","root","");

                    Statement stmt=con.createStatement();
                    String qr="delete from student where name='"+t2.getText()+"'";
                    stmt.executeUpdate(qr);
                    l6.setText("Record Deleted");
                }
                catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b3);

        b4=new JButton("search");
        b4.setBounds(350,260,100,25);
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov_db","root","");

                    Statement stmt=con.createStatement();
                    String qr="select * from student where name='"+t2.getText()+"'";
                    ResultSet rs=stmt.executeQuery(qr);
                    int flag=0;
                    while(rs.next()){
                        flag=1;
                        t1.setText(rs.getString(1));
                        t3.setText(rs.getString(3));
                        t4.setText(rs.getString(4));
                        t5.setText(rs.getString(5));
                    }
                    if(flag==0){
                        l6.setText("No Record Is Found");
                        t1.setText("");
                        t3.setText("");
                        t4.setText("");
                        t5.setText("");

                    }
                    con.close();
                }
                catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b4);

        l6=new JLabel("Status");
        l6.setBounds(80,400,150,20);
        add(l6);

        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        StudentFrom sf=new StudentFrom();
    }
}
