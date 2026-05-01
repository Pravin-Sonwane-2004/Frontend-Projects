package LinkedList;

class PrintLinkedListByHead {
	private static Node head;
	
	class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
		}
	}
	
	
	// 2️⃣ Insert at Beginning
	// Problem:
	// Insert a node at the start of the list.
	// Concept Tested:
	// Pointer reassignment
	// newNode.next = head
	// Updating head
	public void intsetAtBeginning(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else {
			// Node curr = head;
			// head = newNode;
			// head.next = curr;
			//or we can do 
			newNode.next = head;
			head = newNode;
		}
	}
	//3️⃣ Insert at End
	// Problem:
	// Insert a node at the end of the list.
	// Concept Tested:
	// Traversing till null
	// Handling empty list
	// Tail logic

	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else{
			Node curr = head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next = newNode;
		}
		
	}
	
	// ️⃣ Print Linked List
	// Problem:
	// Given head of a singly linked list, print all elements.
	// Concept Tested:
	// Traversal
	// while(current != null)
	// Understanding head reference

	public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
	
	//4️⃣ Delete First Node
	// Problem:
	// Delete the first node.
	// Concept Tested:
	// head = head.next
	// Null safety
	 void deleteFirstNode() {
		 if(head==null ) {
			 throw new RuntimeException("cant perform operation");
		 }
			Node curr = head;
			head = head.next;
	 }

	// 6️⃣ Find Length of Linked List
	// Iterative + Recursive approach.
	// Concept Tested:
	// Traversal
	// Recursion stack understanding
	int LengthOfLinkedList() {
		int count = 0;
		Node curr = head;
		while(curr != null) {
			  ++count;
			  curr = curr.next;
		}
		return count;
	}
//    7️⃣ Search an Element
//    Return true/false if value exists.
//    Concept Tested:
//    Linear search
//    Early exit
    boolean search(int key) {
        Node curr = head;
        while(curr !=null) {
            if(key == curr.data) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
//    8️⃣ Find Middle of Linked List
//    Without counting length.
//    Hint Concept:
//    Slow and Fast Pointer (Tortoise-Hare)
    int middleofList() {
        if(head == null) {
            return 0;
        }

        Node slow = head;
        Node fast = head;

        while(fast !=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
//9️⃣ Reverse a Linked List (Iterative)
//    Classic.
//    Concept Tested:
//    Three pointers (prev, curr, next)
//    Pointer flipping
    void reverseLinkedList() {

        Node prev = null;
        Node curr = head;

        while(curr != null) {
            Node next = curr.next;  // store next
            curr.next = prev;       // reverse link
            prev = curr;            // move prev
            curr = next;            // move curr
        }
        head = prev;  // update head
    }
	
	// 1️⃣1️⃣ Detect Cycle
	// Return true if cycle exists.
	// Hint Concept:
	// Floyd’s Cycle Detection Algorithm



    static void main(String[] a) {
		  PrintLinkedListByHead p = new PrintLinkedListByHead();
		  		  p.intsetAtBeginning(30);
		  		  p.intsetAtBeginning(40);
		  		  p.intsetAtBeginning(  50);
                    p.intsetAtBeginning(  60);
                    p.intsetAtBeginning(  70);
				 IO.println( p.LengthOfLinkedList());
        p.print();
                    p.reverseLinkedList();
				  		  p.print();
//                            IO.println(p.middleofList());


	}
}