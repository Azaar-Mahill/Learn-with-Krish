package linkedListTelusko;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insertAtEnd(5);
		list.insertAtEnd(12);
		list.insertAtEnd(19);
		
		list.show();
		System.out.println("--------------------");
		
		list.insertAtStart(21);
		list.show();
		System.out.println("--------------------");

		list.insertAt(2, 55);
		list.show();
		System.out.println("--------------------");
		
		list.insertAt(0, 55);
		list.show();
		System.out.println("--------------------");
		
		list.deleteAt(2);
		list.show();
		System.out.println("--------------------");
	}

}
