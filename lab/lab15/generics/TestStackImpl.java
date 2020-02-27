package generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestStackImpl {

	public static void main (String[]args) {
		//Stack stack =new StackArrayImpl();
		 List<Integer> lst=new LinkedList();
		 
		 lst.add(5);
		 lst.add(6);
		 
		 List<String> lstStr=new LinkedList<>();
		 
		 lstStr.add("A");
		 lstStr.add("B");
		 
		 
		 List<Object>lstObj = new ArrayList<>();
		 
		 lstObj.addAll(lstStr);
		 lstObj.addAll(lst);
		
		
		
	   Stack <Object> stackObj = new StackArrayImpl<>();
		
	   Stack <String> stack = new StackArrayImpl<>();
		
		stack.push("A");
		stack.push("B");
	    stack.push("C");
	    stack.push("D");
	    //stack.push(5);
	    
	    
		stackObj.addAll(stack);
		System.out.println("Stack Obj:"+stackObj.toList());
		
       Stack <String> stack2 = new StackArrayImpl<>();
			
			stack.push("X");
			stack.push("Y");
			stack.addAll(stack2);
		System.out.println(stack.toList());
		
		
		
		while (!stack.empty()){
			String str=stack.pop();
			//System.out.println(stack.pop());
			}
		 Stack <Integer> stackInt = new StackArrayImpl<>();
		 stackInt.push(5);
		 int a = stackInt.pop();
		 Integer b;
		 int c;
		 c=8;
		 b=c;
	}
}

