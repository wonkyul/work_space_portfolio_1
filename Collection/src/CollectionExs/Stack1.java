package CollectionExs;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		String[] groupA = {"홍길동","김길동","이길동","독고길동"};
		
		Stack<String> stack = new Stack<String>();
		for(String n : groupA)
			stack.push(n);
		while(!stack.isEmpty())
			System.out.println(stack.pop());
			}

}
