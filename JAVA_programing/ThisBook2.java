//calling constructor with one parameter  using this keyword
class Book{
	String title;
	int price;
	String company;
	Book(String company){
		this.company=company;
		this.price=price;
		this.title=title;
	}
	Book(String title,int price,String company){
		this(company);
		System.out.println("constructor with 2 parameters invoked");
		this.title=title;
		this.price=price;
	}
	void display(){
		System.out.println("title = "+title);
		System.out.println("price = "+price);
		System.out.println("company = "+company);
	}
}
class ThisBook2{
	public static void main(String[] args){
		Book b=new Book("java",1052,"javaplt");
		b.display();
	}
}