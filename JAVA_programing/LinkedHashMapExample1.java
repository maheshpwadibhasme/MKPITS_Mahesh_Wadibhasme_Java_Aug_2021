//Java LinkedHashMap Example
import java.util.*;
class LinkedHashMapExample1{
	public static void main(String[] args){
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
			hm.put(100,"mahesh");
			hm.put(101,"avinash");
			hm.put(102,"rahul");

			for(Map.Entry m:hm.entrySet()){
				System.out.println(m.getKey()+" "+m.getValue());
			}
	}
}