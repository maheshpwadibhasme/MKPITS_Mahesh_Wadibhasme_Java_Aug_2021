//Java JComboBox
import javax.swing.*;
import java.awt.event.*;
class JComboBoxExample {
	JFrame f;
	JComboBoxExample(){
		f=new JFrame("ComboBox Example");

		JLabel l1=new JLabel();
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setSize(400,100);
		f.add(l1);

		JButton b=new JButton("show");
		b.setBounds(200,100,75,20);
		f.add(b);

		String languages[]={"C","C++","JAVA","PYTHON","HTML","CSS","DOTNET"};
		JComboBox cb=new JComboBox(languages);
		cb.setBounds(50,100,90,20);
		f.add(cb);

		f.setSize(4,00,300);
		f.setLayout(null);
		f.setVisible(true);

		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String data="Programing language selected:"+cb.getItemAt(cb.getSelectedIndex());
				l1.setText(data);
			}
		});
	}
	public static void main(String[] args){
		JComboBoxExample c=new JComboBoxExample();
	}
}