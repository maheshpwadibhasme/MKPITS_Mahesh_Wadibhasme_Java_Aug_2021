import javax.swing.*;
import java.awt.event.*;
class swingex1 extends JFrame
{
	JTextField t1;
	JButton b1,b2,b3,b4,b5,b6;
	int num1, pnum=0;
	int res=0;
	String op=null;
	swingex1() {
		t1= new JTextField();
		t1.setBounds(10,10,265,20);
		add(t1);

		b1=new JButton("1");
				b1.setBounds(10,50,80,50);
				b1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						if(t1.getText().equals("+")  || t1.getText().equals("-") )
						{
							t1.setText("1");
						}
						else
						{
						t1.setText(t1.getText() + "1");
					}
					}
				});
		add(b1);

		b2=new JButton("2");
						b2.setBounds(100,50,80,50);
						b2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								if(t1.getText().equals("+") || t1.getText().equals("-"))
														{
															t1.setText("2");
														}
						else
						{
								t1.setText(t1.getText() + "2");
							}
						}
						});
		add(b2);

		b3=new JButton("3");
								b3.setBounds(190,50,80,50);
								b3.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent ae) {

										if(t1.getText().equals("+") || t1.getText().equals("-"))
									{
												t1.setText("3");
																								}
																else
																{
																		t1.setText(t1.getText() + "3");
																	}
						}
								});
		add(b3);


		b4=new JButton("+");
						b4.setBounds(10,120,80,50);
						b4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								pnum=Integer.parseInt(t1.getText());
								t1.setText("+");
								op="+";
							}
						});
				add(b4);

				b5=new JButton("-");
								b5.setBounds(100,120,80,50);
								b5.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent ae) {
									pnum=Integer.parseInt(t1.getText());
								t1.setText("-");
								op="-";
									}
								});
				add(b5);

				b6=new JButton("=");
										b6.setBounds(190,120,80,50);
										b6.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent ae) {
											num1=Integer.parseInt(t1.getText());
											if(op.equals("+")) {
											res=pnum+num1;
										}
										else if(op.equals("-")) {
											res=pnum-num1;
										}
											t1.setText(String.valueOf(res));
											}
										});
				add(b6);





				setLayout(null);
				setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] arg) {
		swingex1 sw= new swingex1();
	}
}
