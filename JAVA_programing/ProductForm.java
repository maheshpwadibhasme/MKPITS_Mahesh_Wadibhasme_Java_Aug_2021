//create a product table (prodid, prodname, price , quantity)
//create a form to insert , update , delete and search from product table
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
public class ProductForm extends JFrame {
    JLabel l,l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3,b4;
    ProductForm(){
        l=new JLabel("Product Form");
        l.setBounds(90,40,200,20);
        l.setFont(new Font("Verdana",Font.PLAIN,22));
        add(l);

        l1=new JLabel("Product Id:-");
        l1.setBounds(40,90,150,20);
        add(l1);
        t1=new JTextField();
        t1.setBounds(150,90,150,20);
        add(t1);

        l2=new JLabel("Product Name:-");
        l2.setBounds(40,130,150,20);
        add(l2);
        t2=new JTextField();
        t2.setBounds(150,130,150,20);
        add(t2);

        l3=new JLabel("Product Price:-");
        l3.setBounds(40,170,150,20);
        add(l3);
        t3=new JTextField();
        t3.setBounds(150,170,150,20);
        add(t3);

        l4=new JLabel("Product Quantity:-");
        l4.setBounds(40,210,150,20);
        add(l4);
        t4=new JTextField();
        t4.setBounds(150,210,150,20);
        add(t4);

        b1=new JButton ("Save");
        b1.setBounds(20,250,100,25);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov_db","root","");

                    Statement stmt=con.createStatement();
                    String qr="insert into product(prod_id,prod_name,prod_price,quantity) values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"')";
                    stmt.executeUpdate(qr);
                    l5.setText("Record saved");
                    con.close();
                }
                catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b1);

        b2=new JButton("update");
        b2.setBounds(130,250,100,25);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov_db","root","");

                    Statement stmt=con.createStatement();
                    String qr="update product set prod_price='"+t3.getText()+"' where prod_name='"+t2.getText()+"'";
                    stmt.executeUpdate(qr);
                    l5.setText("Record Updated");
                    con.close();
                }
                catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b2);

        b3=new JButton("Delete");
        b3.setBounds(240,250,100,25);
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov_db","root","");

                    Statement stmt=con.createStatement();
                    String qr="delete from product where prod_name='"+t2.getText()+"'";
                    stmt.executeUpdate(qr);
                    l5.setText("Record deleted");
                    con.close();
                }
                catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b3);

        b4=new JButton("Search");
        b4.setBounds(350,250,100,25);
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov_db","root","");

                    Statement stmt=con.createStatement();
                    String qr="select * from product where prod_name='"+t2.getText()+"'";
                    ResultSet rs=stmt.executeQuery(qr);
                    int flag=0;
                    while(rs.next()){
                        flag=1;
                        l5.setText("Record search");
                        t1.setText(rs.getString(1));
                        t3.setText(rs.getString(3));
                        t4.setText(rs.getString(4));
                    }
                    if(flag==0){
                       l5.setText("Record not search");
                        t1.setText("");
                        t3.setText("");
                        t4.setText("");
                    }
                }
                catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b4);


        l5=new JLabel("Status");
        l5.setBounds(40,320,150,20);
        add(l5);

        setSize(500,600);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        ProductForm pf=new ProductForm();
    }
}
