class Deleteatbeginning{
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
		Node n = new Node(data);
		 n.next = head;
		 head = n;
	}

	void printLinkedList(Node head) {
			Node curr = head;
			while(curr != null) {
				IO.println(curr.data);
				curr = curr.next;
			}
		}
		
		
	void main() {
		Deleteatbeginning li = new Deleteatbeginning();
		li.insertAtBeginning(10);
		li.printLinkedList(li.head);
	}
}