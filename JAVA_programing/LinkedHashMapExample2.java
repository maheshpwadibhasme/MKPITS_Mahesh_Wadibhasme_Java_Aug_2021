//Java LinkedHashMap Example: Key-Value pair
import java.util.*;
class LinkedHashMapExample2{
	public static void main(String[] args){
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
			hm.put(100,"mahesh");
			hm.put(101,"avinash");
			hm.put(102,"rahul");

			//Fetching Key
			System.out.println("Keys:-"+hm.keySet());

			//Fatching values
			System.out.println("Values:- "+hm.values());

			//Fetching key-value pair
			System.out.println("Key-Value pairs:- "+hm.entrySet());

	}
}