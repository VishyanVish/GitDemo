package DataStructure;

import java.util.Stack;

public class one {
public static void main(String[] args) {
	Stack<Integer> s=new Stack<>();
	s.push(45);
	s.push(12);
	s.add(45);
	s.add(54);
	s.add(45);
	s.add(4);
	System.out.println(s);
	System.out.println(s.capacity());
	System.out.println(s.peek());
	System.out.println(s.remove(5));
	System.out.println(s.push(2));
	System.out.println(s);
}
}
