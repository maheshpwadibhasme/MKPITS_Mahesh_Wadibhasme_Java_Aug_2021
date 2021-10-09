class Book1{
	String title;
	int price;

	Book1(){
		System.out.println("constructor with no parameters");
		title="core java";
		price=500;
		this.display();
	}
	Book1(String title ,int price){
		this();
		System.out.println("constructor with 2 parameters");
		this.title=title;
		this.price=price;
	}
	void display(){
		System.out.println("Title of book = "+title);
		System.out.println("Price of book ="+price);
	}
}
class ThisBook1{
	public static void main(String[] args){
		Book1 b=new Book1("oracle",1052);
		b.display();
		Book1 b1=new Book1("Python",795);
		b1.display();
	}
}