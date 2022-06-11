package Queue;

public class queueStructure {

	int[] queueArray = new int[5];
	int head = 0;
	int tail = 0;
	
	public int getCount(){
		return (tail-head);
	}
	
	public boolean isEmpty() {
		if(head==tail) {
			return true;
		}else {
			return false;
		}
	}
	
	public void printQueue() {
		if(!isEmpty()) {
			for(int i=0;i<tail;i++) {
				System.out.println(queueArray[i]);
			}
		}else {
			System.out.println("Is empty");
		}
	}
	
	public boolean isFull() {
		if(tail==queueArray.length) {
			return true;
		}else {
			return false;
		}
	}
	
	public int Head() {
		if(!isEmpty()) {
			return queueArray[head];
		}else {
			System.out.println("Is empty");
			return -1;
		}
	}
	
	public void qOut() {
		if(!isEmpty()) {
			for(int i =head;i<tail-2;i++) {
				queueArray[i]=queueArray[i+1];			
			}
			tail--;
		}else {
			System.out.println("Is empty");
		}	
	}
	
	public void qIn(int item) {
		if(!isFull()) {
			queueArray[tail]=item;
			tail++;
		
		}else {
			System.out.println("Is full");
		}			
	}
	
	public void multipleIn(int[] items) {
		if(!isFull()) {

			if(!((tail-1+items.length)>queueArray.length)) {
				for(int i=0;i<items.length;i++) {
					queueArray[tail] = items[i];
					tail++;
				}
			}else {
				System.out.println("space not sufficient");
			}
				
		}else {
			System.out.println("Is full");
		}			
	}		

	
	public static void main(String[] args) {
		queueStructure newQueue = new queueStructure();
		System.out.println(newQueue.getCount());
		newQueue.printQueue();
		System.out.println(newQueue.Head());
		newQueue.qIn(1);
		newQueue.printQueue();
		int[] multiple = {2,3};
		newQueue.multipleIn(multiple);
		newQueue.printQueue();
	}
}
