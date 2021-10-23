import java.util.*;
class TreeSetExample5{
	public static void main(String[] args){
		TreeSet<String> set=new TreeSet<String>();
			set.add("mi10");
			set.add("sony");
			set.add("vivo");
			set.add("realme");
			set.add("motorola");

			System.out.println("Initial set:- "+set);

			System.out.println("Reverse set:- "+set.descendingSet());

			System.out.println("Head set:- "+set.headSet("sony",false));

			System.out.println("Sub set:- "+set.subSet("mi10",false,"realme",true));

			System.out.println("Tail set:- "+set.tailSet("realme",true));
	}
}