package stack;

public class StackImpl implements Stack {
	
	private StackItem top;
	

	@Override
	public void push(Object obj) {
		StackItem item = new StackItem(obj);
		item.setNext(top);
		top = item;

	}

	@Override
	public Object pop() {
	    StackItem item = top;
	    top = top.getNext();
	    
		return item.getObj();
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return top == null;
	}

}
