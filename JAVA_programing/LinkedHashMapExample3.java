//Java LinkedHashMap Example:remove()

import java.util.*;
class LinkedHashMapExample3{
	public static void main(String[] args){
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
			hm.put(100,"Mahesh");
			hm.put(101,"Avinash");
			hm.put(102,"Rahul");
			
			System.out.println("Before invoking remove()method:- "+hm);
			hm.remove(101);
			System.out.println("After invoking remove()method:- "+hm);
	}
}