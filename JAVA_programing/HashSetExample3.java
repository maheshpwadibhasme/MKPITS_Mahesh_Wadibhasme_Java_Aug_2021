//Java HashSet example to remove elements
//Here, we see different ways to remove an element.
import java.util.*;
class HashSetExample3{
	public static void main(String[] args){
		HashSet<String> set=new HashSet<String>();
			set.add("Mahesh");
			set.add("Yash");
			set.add("Gaurav");
			set.add("Alekh");
			System.out.println("An initial list of an elements:- "+set);

			//Removing specific element from hash set
			set.remove("Yash");
			System.out.println("After invoking remove(object) method:- "+set);

		HashSet<String> set2=new HashSet<String>();
			set2.add("Shubham");
			set2.add("Hashiket");
			set.addAll(set2);
			System.out.println("Updated list:- "+set);

            //Removing all the new elements from HashSet

            set.removeAll(set2);
            System.out.println("After invoking removeAll() method:- "+set);

            //Removing elements on the basis of specified condition
            set.removeIf(str->str.contains("Mahesh"));
            System.out.println("After invoking removeIf() method : "+set);

            //Removing all the elements available in the set
            set.clear();
            System.out.println("After invoking clear() method list is clear: "+set);
	}
}