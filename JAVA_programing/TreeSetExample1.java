//Let's see a simple example of Java TreeSet.

import java.util.*;
class TreeSetExample1{
	public static void main(String[] args){
		TreeSet<String> set=new TreeSet<String>();
			set.add("Ravi");
			set.add("Vijay");
			set.add("Ravi");
			set.add("Ajay");

			Iterator itr=set.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());

			}

	}
}