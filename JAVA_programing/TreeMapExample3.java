//Java TreeMap Example: NavigableMap

import java.util.*;
class TreeMapExample3{
	public static void main(String[] args){
		NavigableMap<Integer,String> map=new TreeMap<Integer,String>();
			map.put(100,"Alekh");
			map.put(101,"Gaurav");
			map.put(102,"Mahesh");
			map.put(103,"Yash");

			//Maintains descending order
			System.out.println("Map Descending:- "+map.descendingMap());

			//Returns key-value pairs whose keys are less than or equal to the specified key.
			System.out.println("Head map:- "+map.headMap(102,true));

			//Returns key-value pairs whose keys are greater than or equal to the specified key.
			System.out.println("Tail map:- "+map.tailMap(102,true));

			//Returns key-value pairs exists in between the specified key.
			System.out.println("Sub map:- "+map.subMap(101,true,103,false));


	}
}