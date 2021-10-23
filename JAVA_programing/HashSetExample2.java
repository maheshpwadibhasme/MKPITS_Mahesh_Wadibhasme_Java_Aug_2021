//Java HashSet example ignoring duplicate elements
//In this example, we see that HashSet doesn't allow duplicate elements.
import java.util.*;
class HashSetExample2{
	public static void main(String[] args){
		HashSet<String> set=new HashSet<String>();
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