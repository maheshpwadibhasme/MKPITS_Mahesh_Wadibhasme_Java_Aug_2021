//Java Map Example: Generic (New Style)

import java.util.*;
class MapExample2{
	public static void main(String[] args){
		HashMap<Integer,String> map=new HashMap<Integer,String>();
			map.put(4,"mahesh");
			map.put(2,"yash");
			map.put(6,"gaurav");
			map.put(3,"alekh");

		//Elements can traverse in any order
			for(Map.Entry m:map.entrySet()){
				System.out.println(m.getKey()+" "+m.getValue());
			}
	}
}