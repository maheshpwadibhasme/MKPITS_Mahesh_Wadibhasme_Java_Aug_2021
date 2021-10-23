//Java ArrayDeque Example
import java.util.*;
class ArrayDequeExample1{
	public static void main(String[] args){
		ArrayDeque<String> deque=new ArrayDeque<String>();
			deque.add("Mahesh");
			deque.add("Gaurav");
			deque.add("Alekh");
			deque.add("Yash");
			deque.add("Shubham");
			
			for(String str:deque){
				System.out.println(str);
			}
	}
}