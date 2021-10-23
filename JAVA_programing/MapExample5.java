//Java Map Example: comparingByValue()

import java.util.*;
class MapExample5{
	public static void main(String[] args){
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		          map.put(100,"Amit");
		          map.put(101,"Vijay");
		          map.put(102,"Rahul");

		          map.entrySet()

		          .stream()

		          .sorted(Map.Entry.comparingByValue())

		          .forEach(System.out::println);

	}
}