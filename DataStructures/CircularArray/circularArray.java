package circularArray;

public class circularArray {
	
	int[] circularArray = new int[5];
	int head = 0;
	int tail = 0;
	
	public boolean isEmpty() {
		if(head==tail) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(head == ((tail+1)%circularArray.length)) {
			return true;
		}else {
			return false;
		}
	}
	
	public int Head() {
		if(!isEmpty()) {
			return circularArray[head];
		}else {
			System.out.println("Is empty");
			return -1;
		}
	}
	
	public int getCount() {
		if(tail>=head) {
			return (tail-head);
		}else {
			return (circularArray.length-head+tail);
		}
	}
	
	public void print() {
		if(!isEmpty()) {
			int count = getCount();
			for(int i=0; i<count; i++) {
				System.out.println("\n"+circularArray[(i+head)%circularArray.length]);
			}
		}else {
			System.out.println("Is empty");
		}	
	}
	
	public void qin(int item) {
		if(!isFull()) {
			circularArray[tail]=item;
			tail++;
			tail=tail%circularArray.length;
		}else {
			System.out.println("is Full");
		}
	}
	
	public void qOut() {
		if(!isEmpty()) {
			head++;
			head=head%circularArray.length;
		}else {
			System.out.println("isEmpty");
		}
	}
	
	public void multipleIn(int[] items) {
		if(!isFull()){
			int count = getCount();
			if(!(count+items.length>circularArray.length)) {
				for(int i=0;i<items.length;i++) {
					circularArray[tail]=items[i];
					tail++;
					tail=tail%circularArray.length;
				}
			}else {
				System.out.println("not sufficient memory");
			}
			
		}else {
			System.out.println("is full");
		}
	}
	
	public static void main(String[] args) {
		
		circularArray CArray= new circularArray();
		System.out.println(CArray.isEmpty());
		System.out.println(CArray.isFull());
		System.out.println(CArray.Head());
		System.out.println(CArray.getCount());
		CArray.print();
		CArray.qin(1);
		System.out.println(CArray.isEmpty());
		System.out.println(CArray.isFull());
		System.out.println(CArray.Head());
		System.out.println(CArray.getCount());
		CArray.print();
		CArray.qOut();
		System.out.println(CArray.isEmpty());
		System.out.println(CArray.isFull());
		System.out.println(CArray.Head());
		System.out.println(CArray.getCount());
		CArray.print();
		System.out.println(CArray.getCount());
		int[] multiple= {2,3};
		CArray.multipleIn(multiple);
		CArray.print();
	}
}

