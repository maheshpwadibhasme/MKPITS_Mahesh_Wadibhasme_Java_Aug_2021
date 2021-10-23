//Java TreeMap Example
import java.util.*;
class TreeMapExample1{
	public static void main(String[] args){
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
			map.put(103,"Mahesh");
			map.put(100,"Yash");
			map.put(102,"Alekh");

			for(Map.Entry m:map.entrySet()){
				System.out.println(m.getKey()+" "+m.getValue());
			}
	}
}