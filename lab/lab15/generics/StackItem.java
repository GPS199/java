package generics;

public class StackItem<T> {
	
		T obj ;
		
		StackItem<T> next;
		
		public StackItem(T obj) {
			this.obj = obj;
		}

		public Object getObj() {
			return obj;
		}

		public void setObj(T obj) {
			this.obj = obj;
		}

		public StackItem<T> getNext() {
			return next;
		}

		public void setNext(StackItem next) {
			this.next = next;
		}

}
