//Java TreeMap Example: remove()

import java.util.*;
class TreeMapExample2{
	public static void main(String[] args){
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
			map.put(100,"Mahesh");
			map.put(101,"Alekh");
			map.put(102,"Gaurav");
			map.put(103,"Yash");

			System.out.println("Before invoking remove() method :-");
			for(Map.Entry m:map.entrySet()){
				System.out.println(m.getKey()+" "+m.getValue());
			}

			System.out.println("After invoking remove() method :-");
			map.remove(101);
			for(Map.Entry m:map.entrySet()){
				System.out.println(m.getKey()+" "+m.getValue());
			}
	}
}