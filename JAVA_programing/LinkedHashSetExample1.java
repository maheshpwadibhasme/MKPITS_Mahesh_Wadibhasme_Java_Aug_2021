//Java LinkedHashSet Example
//Let's see a simple example of Java LinkedHashSet class. Here you can notice that the elements iterate
//in insertion order.
import java.util.*;
class LinkedHashSetExample1{
	public static void main(String[] args){
		LinkedHashSet<String> set=new LinkedHashSet<String>();
			set.add("One");
			set.add("Two");
			set.add("Three");
			set.add("Four");
			set.add("Five");

			Iterator<String> itr=set.iterator();
				while(itr.hasNext()){
					System.out.println(itr.next());
				}
	}
}