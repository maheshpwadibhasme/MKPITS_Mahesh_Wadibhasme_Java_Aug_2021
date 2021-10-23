//Java TreeSet Example 4:
//In this example, we perform various SortedSetSet operations.
import java.util.*;
class TreeSetExample6{
	public static void main(String[] ags){
		TreeSet<String> set=new TreeSet<String>();
			set.add("A");
			set.add("B");
			set.add("C");
			set.add("D");
			set.add("E");

			System.out.println("Initial set:- "+set);

			System.out.println("Reverse set:- "+set.descendingSet());

			System.out.println("Head set:- "+set.headSet("C"));

			System.out.println("Sub set:- "+set.subSet("B","D"));

			System.out.println("Tail set:- "+set.tailSet("C"));
	}
}