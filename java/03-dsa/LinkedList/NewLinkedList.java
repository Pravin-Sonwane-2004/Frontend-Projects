package LinkedList;

public class NewLinkedList {
    Node head;

    static void printLinked(Node head) {
        Node curr = head;
        while (curr != null) {
            IO.println(curr.data);
            curr = curr.next;
        }
    }

    void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }
	// void removeDuplicates() {
		 // Node curr = head;
		 // while(curr != null && curr.next != null) {
			// while(curr.data == curr.next.data) {
				// curr.next = curr.next.next;
			// }
			// curr = curr.next;
		 // }
	// }
	void removeDuplicates() {
		 Node curr = head;
		 while(curr != null && curr.next != null) {
			if(curr.data == curr.next.data)   {
				curr.next = curr.next.next;
			}	
			else {
				curr = curr.next;
			}
		 }
	}

    void main() {
        NewLinkedList li = new NewLinkedList(); 
		li.insertAtEnd(10);
		li.insertAtEnd(20);
		li.insertAtEnd(20);
		li.insertAtEnd(30);
		li.insertAtEnd(30);
		li.insertAtEnd(40);
        printLinked(li.head);
		li.removeDuplicates();
		IO.println();
        printLinked(li.head);

    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}