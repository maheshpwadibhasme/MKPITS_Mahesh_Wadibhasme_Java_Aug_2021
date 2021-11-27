//Java AWT MenuItem and Menu Example
import java.awt.*;
class MenuExample2{
	MenuExample2(){
		Frame f=new Frame("TextPad");
		MenuBar mb=new MenuBar();

		Menu menu=new Menu("File");
			MenuItem i1=new MenuItem("New");
			MenuItem i2=new MenuItem("Open");
			MenuItem i3=new MenuItem("Close");
			MenuItem i4=new MenuItem("Close All");
			MenuItem i5=new MenuItem("Save");
			MenuItem i6=new MenuItem("Save As..");
			MenuItem i7=new MenuItem("Save All");

			menu.add(i1);
			menu.add(i2);
			menu.add(i3);
			menu.add(i4);
			menu.add(i5);
			menu.add(i6);
			menu.add(i7);

		Menu menu2=new Menu("Edit");
			MenuItem i11=new MenuItem("Undo");
			MenuItem i12=new MenuItem("Redo");
			MenuItem i13=new MenuItem("Repeat typing");
			MenuItem i14=new MenuItem("Cut");
			MenuItem i15=new MenuItem("Copy");
			MenuItem i16=new MenuItem("Past");
			MenuItem i17=new MenuItem("Delete");

			menu2.add(i11);
			menu2.add(i12);
			menu2.add(i13);
			menu2.add(i14);
			menu2.add(i15);
			menu2.add(i16);
			menu2.add(i17);

		Menu menu3=new Menu("Search");
		Menu menu4=new Menu("View");
		Menu menu5=new Menu("Tools");
		Menu menu6=new Menu("Macros");
		Menu menu7=new Menu("Configure");
		Menu menu8=new Menu("Window");
		Menu menu9=new Menu("Help");

		mb.add(menu);
		mb.add(menu2);
		mb.add(menu3);
		mb.add(menu4);
		mb.add(menu5);
		mb.add(menu6);
		mb.add(menu7);
		mb.add(menu8);
		mb.add(menu9);
		f.setMenuBar(mb);
		f.setSize(600,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		MenuExample2 me2=new MenuExample2();
	}
}