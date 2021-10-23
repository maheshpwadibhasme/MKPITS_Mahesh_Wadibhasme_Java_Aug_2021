//Let's see an example of traversing elements in descending order.

import java.util.*;
class TreeSetExample2{
	public static void main(String[] args){
		TreeSet<String> s=new TreeSet<String>();
			s.add("Ravi");
			s.add("Vijay");
			s.add("Ajay");

			System.out.println("Traversing element through Iterator in descending order");
			Iterator itr=s.descendingIterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}

	}
}