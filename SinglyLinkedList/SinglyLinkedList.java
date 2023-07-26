public class SinglyLinkedList {

	private Node head;

	public SinglyLinkedList() {
		head = null;
	}

	public void delFirst() {
		
		if (head == null)
			throw new RuntimeException("List is Empty");

		
		head = head.getNext();

	
	}

	public void delAll() {
		head = null;
	
	}

	public void delLast() {
		
		if (head == null)
			throw new RuntimeException("List is Empty");
	
		if (head.getNext() == null)
	
			head = null;
	
		else {
			
			Node temp = null, trav = head;
			while (trav.getNext() != null) {
				temp = trav;
				trav = trav.getNext();
			}
			
			temp.setNext(null);
		} 
	}

	public void delPos(int position) {
		
		if (head == null || position <= 0)
			throw new RuntimeException("List is Empty");


		if (position == 1)
			delFirst();

		
		if (head.getNext() == null)
		
			head = null;

		
		else {
			
			Node temp = null, trav = head;
			for (int i = 1; i < position; i++) {
				
				if (trav == null)
					throw new RuntimeException("Invalid Exception");

				temp = trav;
				trav = trav.getNext();
			}
			
			temp.setNext(trav.getNext());
		} 

	}

	

	public void display() {

		
		Node trav = head;

		System.out.println("List :");
		while (trav != null) {

			
			System.out.println(trav.getData());

	
			trav = trav.getNext();

		} 
	}

	public void addLast(int data) {
		
		Node newNode = new Node(data);

		
		if (head == null) {
		
			head = newNode;
		}

		else {
			Node trav = head;

			while (trav.getNext() != null) {
				trav = trav.getNext();
			}
		
			trav.setNext(newNode);
		}

	}

	public void addFirst(int data) {

		Node newNode = new Node(data);

		
		if (head == null) {
			
			head = newNode;
		}

	
		else {
			
			newNode.setNext(head);
			
			head = newNode;

		}

	}
	
	public void addAtPos(int data, int position) {

		if (head == null || position <= 1)
		
			addFirst(data);
		
		else {
			
			Node newNode = new Node(data);
		

			Node trav = head;
			for (int i = 1; i < position - 1; i++) {
			
				if (trav.getNext() == null)
					break;
				trav = trav.getNext();
			}
			
			newNode.setNext(trav.getNext());
		
			trav.setNext(newNode);

		}

	}
	
	  

}
