import java.util.List;
import java.util.ArrayList;

class RiverseLinkedList{

	public static void main(String[] args) {
		ArrayList<String> Alist = new ArrayList<>(List.of("1", "2", "3", "4"));
		LinkedList list = new LinkedList();
		int size=Alist.size();
		System.out.println("size of ArrayList: "+ size);
		for(int i=0;i<size;i++){
			list.insertAtStart(Alist.get(i) );
		}
		list.show();
		int count=list.count();
		System.out.println("size of LinkedList: "+ count);
		list.reversePrint(count);
	}
}


class LinkedList {
	
	Node head;
	int nodeCount;

	public void reversePrint(int count){
		
		for(int a=count;a>0;a--){
			Node n = head;
			for(int b=0;b<a-1;b++){
				n=n.next;
			}
			System.out.println(n.data);
		}

	}
	public int count(){//count number of nodes


		if(head==null){
			nodeCount=0;
		}else{
			Node node = head;
			while(node.next!=null) {
				nodeCount++;
				node = node.next;
			}
			nodeCount++;
		}
		return nodeCount;

	}

	public void show() {//print data from head to last
		
		Node node = head;
		while(node.next!=null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

	public void insertAtStart(String data) {//use to add node at head
		Node node = new Node();
		node.data= data;
		node.next=null;
		
		node.next = head;
		head = node;	
	}
}

class Node {
	String data;
	Node next;
	
}