//Java HashSet Example: Book
//Let's see a HashSet example where we are adding books to set and printing all the books.

import java.util.*;
class Book{
	int id;
	String name,author;
	int price;

	Book(int id, String name, String author, int price){
		this.id=id;
		this.name=name;
		this.author=author;
		this.price=price;
	}
}
class HashSetExample5{
	public static void main(String[] args){
		HashSet<Book> set=new HashSet<Book>();
			Book b1=new Book(1,"java","mahesh",100);
			Book b2=new Book(2,"python","Yash",90);
			Book b3=new Book(3,"c++","Gaurav",80);

			set.add(b1);
			set.add(b2);
			set.add(b3);

			for(Book b:set){
				System.out.println(b.id+" "+b.name+" "+b.author+" "+b.price);
			}
	}
}