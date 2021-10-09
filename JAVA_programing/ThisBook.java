class Book{
	String title;
	int price;
	void insert(String title,int price){
		this.title=title;
		this.price=price;
		this.display();
	}
	void display(){
		System.out.println("Title = "+title);
		System.out.println("Price = "+price);
	}
}
class Thisbook{
	public static void main(String[] args){
	Book b=new Book();
	b.insert("java",100);
}
}