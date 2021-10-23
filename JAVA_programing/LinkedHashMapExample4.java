//Java LinkedHashMap Example: Book

import java.util.*;
class Book{
	int id;
	String name;
	int price;

	Book(int id, String name, int price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
class LinkedHashMapExample4{
	public static void main(String[] args){
		LinkedHashMap<Integer,Book> hm=new LinkedHashMap<Integer,Book>();

			Book b1=new Book(3,"java",100);
			Book b2=new Book(2,"python",150);
			Book b3=new Book(1,"c++",200);

			hm.put(3,b1);
			hm.put(2,b2);
			hm.put(1,b3);

			for(Map.Entry<Integer,Book> entry:hm.entrySet()){
				int key=entry.getKey();
				Book b=entry.getValue();

				System.out.println(key+"Details");
				System.out.println(b.id+" "+b.name+" "+b.price);
				System.out.println("-------------------------");
			}

	}
}