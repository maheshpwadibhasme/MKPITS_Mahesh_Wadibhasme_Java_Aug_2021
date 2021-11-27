//java awt list example 1
//Java AWT List Example with ActionListener
import java.awt.*;
import java.awt.event.*;
class ListExample2{
	ListExample2(){
		Frame f=new Frame();
		Label label=new Label();
		label.setAlignment(label.CENTER);
		label.setSize(500,100);
		f.add(label);

		Button b=new Button("Show");
		b.setBounds(200,150,80,30);
		f.add(b);

		List l1=new List(4,false);
		l1.setBounds(100,100,70,70);
		l1.add("C");
		l1.add("C++");
		l1.add("JAVA");
		l1.add("PHP");
		f.add(l1);

		List l2=new List(4,true);
		l2.setBounds(100,200,70,70);
		l2.add("Turbo C++");
        l2.add("Spring");
        l2.add("Hibernate");
        l2.add("CodeIgniter");
        f.add(l2);

		f.setSize(450,450);
		f.setLayout(null);
		f.setVisible(true);

		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String data="Programming language Selected :"+l1.getItem(l1.getSelectedIndex());
				data +=",Framework Selected: ";

				for(String frame:l2.getSelectedItems()){
					data +=frame+"";
				}
				label.setText(data);
			}
		});
	}
	public static void main(String[] args){
		ListExample2 le2=new ListExample2();
	}
}