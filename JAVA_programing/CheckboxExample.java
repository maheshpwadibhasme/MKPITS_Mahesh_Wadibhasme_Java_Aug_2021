//Java JCheckBox Example with ItemListener
import javax.swing.*;
import java.awt.event.*;
class CheckBoxExample{
	CheckBoxExample(){
		JFrame f=new JFrame("CheckBoxExample");
		JLabel l1=new JLabel();
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setSize(400,100);
		f.add(l1);

		JLabel l2=new JLabel();
		l2.setHorizontalAlignment(JLabel.CENTER);
		l2.setSize(400,150);
		f.add(l2);

		JCheckBox cb1=new JCheckBox("C++");
		cb1.setBounds(150,100,50,50);
		f.add(cb1);

		JCheckBox cb2=new JCheckBox("java");
		cb2.setBounds(150,150,50,50);
		f.add(cb2);

		cb1.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				l1.setText("C++Checkbox :"+(e.getStateChange()==1?"Checked":"Unchecked"));
			}
		});

		cb2.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				l2.setText("java CheckBox :"+(e.getStateChange()==1?"Checked":"Unchecked"));
			}
		});

		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		CheckBoxExample cb=new CheckBoxExample();
	}
}
