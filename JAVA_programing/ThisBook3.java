class Book{
	String title;
	int price;
	String author;

	Book(){
		this("java",1052,"mahesh");
	}
	Book(String title,int price,String author){
		System.out.println(title);
		System.out.println(price);
		System.out.println(author);
	}

}
class ThisBook3{
	public static void main(String[] args){
		Book b=new Book();
	}
}