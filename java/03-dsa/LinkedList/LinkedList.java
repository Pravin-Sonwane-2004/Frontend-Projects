class LinkedList {
	Node head;
	class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
		void insertAtBeginning(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}    
	
	void print() {
		Node curr = head;
		while(curr != null) {
			IO.print(curr.data + " -> ");
			curr = curr.next;
		}
		IO.print("null");
	}
	void makeCircular () {
		if(head == null) return;
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = head;
	}
	
boolean circular() {
    if (head == null) return false;

    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            return true;
        }
    }

    return false;
}
	void findMid() {
		 Node slow = head;
		Node fast = head;

		while(fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
		}
		IO.println();
		IO.println(slow.data);
	}
	int fildLength() {
		Node curr = head;
		int size = 0;
		while(curr != null) {
			curr = curr.next;
			size++;
		}
		return size;
	}
	
	boolean searchElement(int target) {
		Node curr = head; 
		while(curr != null) {
			if(curr.data == target) {
				return true;
			}
			curr = curr.next;
		}
		return false;
	}
	//9️⃣ Reverse a Linked List (Iterative)
// Classic.
// Concept Tested:
// Three pointers (prev, curr, next)
// Pointer flipping
		
	// void reverseL() {
		// Node prev = null;
		// Node curr = head;
		// Node next = null;
		// while(curr != null) {
			// next = curr.next;
			// prev = curr;
			// curr = next;
		// }
		// 1️⃣3️⃣ Remove Nth Node from End
// Without calculating length separately.
// Concept:
// Two pointer gap technique

	
	}
	void main() {
		LinkedList li = new LinkedList();
		li.insertAtBeginning(10);
		li.insertAtBeginning(11);
		li.insertAtBeginning(12);
		li.insertAtBeginning(13);
		li.insertAtBeginning(14);
		li.insertAtBeginning(15);
		li.insertAtBeginning(16);
		// IO.println("Circular " + li.circular());
		// li.makeCircular();
		// IO.println("Circular " + li.circular());
		
		li.print();
		// System.out.println(li.searchElement(11));
		// li.findMid();
		// IO.println("Length " + li.fildLength());
	}
}               