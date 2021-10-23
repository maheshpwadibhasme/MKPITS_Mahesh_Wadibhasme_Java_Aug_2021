//Java ArrayDeque Example: offerFirst() and pollLast()

import java.util.*;
class ArrayDequeExample2{
	public static void main(String[] args){
		ArrayDeque<String> deque=new ArrayDeque<String>();
			deque.offer("Mahesh");
			deque.offer("Gaurav");
			deque.add("Alekh");
			deque.add("Yash");
			deque.offerFirst("Shubham");

			for(String str:deque){
				System.out.println(str);
			}
				deque.pollLast();
				System.out.println("After pollLast() traversal..");

				for(String s:deque){
					System.out.println(s);
				}

	}
}