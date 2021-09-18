class Book1{
	String title;
	int price;

	void insert(String title,int price){
		this.title=title;
		this.price=price;
	}
	void display(){
		System.out.println("Title = "+title);
		System.out.println("Price = "+price);
	}
}
class ThisBook1{
	public static void main(String[] args){
		Book1 b=new Book1();
		b.insert("java",540);
		b.display();
	}
}



