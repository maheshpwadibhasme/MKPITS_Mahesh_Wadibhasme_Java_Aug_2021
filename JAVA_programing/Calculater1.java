//calcutater
import javax.swing.*;
import java.awt.event.*;
class Calculater1 extends JFrame{
	JTextField t1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
	int num1,pnum=0;
	int  res=0;
	String op=null;
	Calculater1(){

		t1=new JTextField();
		t1.setBounds(40,30,310,40);
		add(t1);

		b1=new JButton("1");
		b1.setBounds(40,110,50,50);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(t1.getText().equals("+")  || t1.getText().equals("-") ||t1.getText().equals("*")||t1.getText().equals("/") ){
					t1.setText("1");
				}
				else{
					t1.setText(t1.getText() + "1");
				}

			}
		});
		add(b1);

		b2=new JButton("2");
		b2.setBounds(120,110,50,50);
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(t1.getText().equals("+")  || t1.getText().equals("-")||t1.getText().equals("*")||t1.getText().equals("/")  ){
					t1.setText("2");
				}
				else{
					t1.setText(t1.getText() + "2");
				}

			}
		});
		add(b2);

		b3=new JButton("3");
		b3.setBounds(200,110,50,50);
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(t1.getText().equals("+")  || t1.getText().equals("-") ||t1.getText().equals("*")||t1.getText().equals("/")  ){
					t1.setText("3");
				}
				else{
					t1.setText(t1.getText() + "3");
				}

			}
		});
		add(b3);

		b4=new JButton("+");
		b4.setBounds(280,110,60,50);
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				pnum=Integer.parseInt(t1.getText());
				t1.setText("+");
				op="+";
			}
		});
		add(b4);

		b5=new JButton("4");
		b5.setBounds(40,190,50,50);
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(t1.getText().equals("+")  || t1.getText().equals("-") ||t1.getText().equals("*")||t1.getText().equals("/")  ){
					t1.setText("4");
				}
				else{
					t1.setText(t1.getText() + "4");
				}

			}
		});
		add(b5);

		b6=new JButton("5");
		b6.setBounds(120,190,50,50);
		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(t1.getText().equals("+")  || t1.getText().equals("-") ||t1.getText().equals("*")||t1.getText().equals("/") ){
					t1.setText("5");
				}
				else{
					t1.setText(t1.getText() + "5");
				}

			}
		});
		add(b6);

		b7=new JButton("6");
		b7.setBounds(200,190,50,50);
		b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(t1.getText().equals("+")  || t1.getText().equals("-") || t1.getText().equals("*") || t1.getText().equals("/")  ){
					t1.setText("6");
				}
				else{
					t1.setText(t1.getText() + "6");
				}

			}
		});
		add(b7);

		b8=new JButton("-");
		b8.setBounds(280,190,60,50);
		b8.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent ae){
				pnum=Integer.parseInt(t1.getText());
				t1.setText("-");
				op="-";
			}
		});
		add(b8);

		b9=new JButton("7");
		b9.setBounds(40,270,50,50);
		b9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(t1.getText().equals("+")  || t1.getText().equals("-") ||t1.getText().equals("*")||t1.getText().equals("/")  ){
					t1.setText("7");
				}
				else{
					t1.setText(t1.getText() + "7");
				}

			}
		});
		add(b9);

		b10=new JButton("8");
		b10.setBounds(120,270,50,50);
		b10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(t1.getText().equals("+")  || t1.getText().equals("-") ||t1.getText().equals("*")||t1.getText().equals("/") ){
					t1.setText("8");
				}
				else{
					t1.setText(t1.getText() + "8");
				}

			}
		});
		add(b10);

		b11=new JButton("9");
		b11.setBounds(200,270,50,50);
		b11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(t1.getText().equals("+")  || t1.getText().equals("-")||t1.getText().equals("*")||t1.getText().equals("/")  ){
					t1.setText("9");
				}
				else{
					t1.setText(t1.getText() + "9");
				}

			}
		});
		add(b11);

		b12=new JButton("*");
		b12.setBounds(280,270,60,50);
		b12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				num1=Integer.parseInt(t1.getText());
				t1.setText("*");
				op="*";
			}
		});
		add(b12);

		b13=new JButton("clr");
		b13.setBounds(40,350,50,50);
		b13.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				t1.setText("");
			}
		});
		add(b13);

		b14=new JButton("0");
		b14.setBounds(120,350,50,50);
		b14.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(t1.getText().equals("+")  || t1.getText().equals("-") ||t1.getText().equals("*")||t1.getText().equals("/") ){
					t1.setText("0");
				}
				else{
					t1.setText(t1.getText() + "0");
				}

			}
		});
		add(b14);

		b15=new JButton("=");
		b15.setBounds(200,350,50,50);
		b15.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				num1=Integer.parseInt(t1.getText());
				if(op.equals("+")){
					res=pnum+num1;
				}
				else if(op.equals("-")){
					res=pnum-num1;
				}
				else if(op.equals("*")){
					res=pnum*num1;
				}
				else if(op.equals("/")){
					res=pnum/num1;
				}
				t1.setText(String.valueOf(res));
			}
		});
		add(b15);

		b16=new JButton("/");
		b16.setBounds(280,350,60,50);
		b16.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				pnum=Integer.parseInt(t1.getText());
				t1.setText("/");
				op="/";
			}
		});
		add(b16);


		setSize(400,500);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args){
		Calculater1 c=new Calculater1();
	}
}