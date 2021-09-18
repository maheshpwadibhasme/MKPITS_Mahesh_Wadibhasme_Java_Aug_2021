//example 2 of this keyword in class book
class Book{
	String title;
	int price;
	Book(String title,int price){
		this.title=title;
		this.price=price;
	}
	void display(){
		System.out.println("Title = "+title);
		System.out.println("Price ="+price);
	}
}
class ThisBook{
	public static void main(String[] args){
		Book b1=new Book("JAVA",520);
		Book b2=new Book("Oracal",480);
		b1.display();
		b2.display();
	}
}