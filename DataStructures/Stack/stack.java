package stack;

public class stack {
	
	int top = -1;
	int[] stackArray=new int[5];
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(top==stackArray.length-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public int getCount() {
		return(top+1);
	}
	
	public void printStack() {
		if(!isEmpty()) {
			for(int i=0; i<=top;i++)
				System.out.println(stackArray[i]);
		}
	}
	
	public void push(int item) {
		if(!isFull()) {
			top++;
			stackArray[top]=item;
		}else {
			System.out.println("Is empty");
		}
	}
	
	public void multiplePush(int[] items) {
		if(!isFull()) {
			for(int i = 0; i<items.length;i++) {
				top++;
				stackArray[top]=items[i];				
			}
		}else {
			System.out.println("Is empty");
		}
	}
	
	public void pop() {
		if(!isEmpty()) {
			top--;
		}else {
			System.out.println("Is empty");
		}
	}
	
	public int top() {
		if(!isEmpty()) {
			return stackArray[top];
		}else {
			System.out.println("Is empty");
			return -1;
		}
	}
	
	public static void main(String[] args) {
		
		int[] items = {2,3,4};
		
		stack newStack = new stack();
		
		System.out.println(newStack.top());
		System.out.println(newStack.isEmpty());
		System.out.println(newStack.isFull());
		System.out.println(newStack.getCount());
		newStack.printStack();
		newStack.push(1);
		System.out.println(newStack.isEmpty());
		System.out.println(newStack.isFull());
		System.out.println(newStack.getCount());
		newStack.printStack();
		newStack.multiplePush(items);
		System.out.println(newStack.isEmpty());
		System.out.println(newStack.isFull());
		System.out.println(newStack.getCount());
		newStack.printStack();
		newStack.pop();
		System.out.println(newStack.isEmpty());
		System.out.println(newStack.isFull());
		System.out.println(newStack.getCount());
		newStack.printStack();	
		System.out.println(newStack.top());
	}
}
