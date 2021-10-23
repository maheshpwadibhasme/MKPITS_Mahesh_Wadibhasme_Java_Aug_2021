//Java HashSet Example
//Let's see a simple example of HashSet. Notice, the elements iterate in an unordered collection.
import java.util.*;
class HashSetExample1{
	public static void main(String[] args){
		HashSet<String> set=new HashSet<String>();
			set.add("One");
			set.add("Two");
			set.add("Three");
			set.add("Four");
			set.add("Five");

			Iterator itr=set.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
	}
}