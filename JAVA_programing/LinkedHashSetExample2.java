//Java LinkedHashSet example ignoring duplicate Elements

import java.util.*;
class LinkedHashSetExample2{
	public static void main(String[] args){
		LinkedHashSet<String> set= new LinkedHashSet<String>();
			set.add("Mahesh");
			set.add("Yash");
			set.add("Mahesh");
			set.add("Gaurav");

			Iterator itr=set.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
	}
}