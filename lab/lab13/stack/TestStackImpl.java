package stack;

public class TestStackImpl {
	
	public static void main(String[] args) {
		
		//List lst = new LinkedList();
		Stack stack = new StackArrayImpl();
		
		stack.push("A");
		stack.push("B");	
		stack.push("C");
		stack.push("D");
		
		while (!stack.empty()) {
		System.out.println(stack.pop());
	}
	}
	
}
