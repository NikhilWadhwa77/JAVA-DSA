class LL{
	
	Node head;
	
	class Node{
		
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next = null;
		}
		
	}
	
	void add(String data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	void addFirst(String val) {
		
		Node newNode = new Node(val);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		
	}
	
	void deleteLast() {
		
		Node temp = head;
		
		while((temp.next).next != null) {
			temp = temp.next;
		}
		
		temp.next = null;
	}
	
	void deleteFirst() {
		head = head.next;
	}
	
	void delete(int index) {
		
		Node temp = head;
		
		for(int i = 0; i < index-1; i++) {
			temp = temp.next;
		}
		
		Node tempNext = temp.next;
		temp.next = (temp.next).next;
		tempNext.next = null;
		
		
	}
	
	void display() {
		
		Node temp = head;
		
		if(temp == null) {
			System.out.println("EMPTY LIST");
			return;
		}
		
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	
}



public class LL101 {

	public static void main(String[] args) {
		
		LL list = new LL();
		list.add("2");
		list.add("3");
		list.add("4");
		list.addFirst("1");
		list.display();
		
		list.delete(2);
		list.display();
    //output
    //1->2->3->4->NULL
    //1->2->4->NULL

	}

}

