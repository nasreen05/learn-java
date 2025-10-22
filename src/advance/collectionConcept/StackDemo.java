package advance.collectionConcept;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer>  s=new Stack<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.push(40);
		
		System.out.println(s.peek());
		System.out.println(s);
		
		/*while(s.size()!=0) {
			System.out.println(s.pop());*/
		
		}
		
	}

