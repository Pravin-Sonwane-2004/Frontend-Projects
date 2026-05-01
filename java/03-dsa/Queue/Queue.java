package Queue;

import java.util.Scanner;
public class Queue {
    int [] queue;
    int front;
    int rear;
    int capacity;
    int size;
    void initialize(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        size = 0;
        front = 0;
        rear = -1;  
    }
    boolean isEmpty () {
        return size == 0;
    }

    boolean isFull() {
        return capacity == size;
    }

    void enQueue(int data) {
       if(isFull()) {
           throw new RuntimeException("Queue is full");
        //    return -1;
       }
       else {
           size++;
           rear++;
           queue[rear] = data;
       }
    }
    
    int deQueue() {
        if (isEmpty()) {
           throw new RuntimeException("queue is empty ");
        }
        int removed = queue[front];
        front++;
        size--;
        return removed;
       }
       
       int peek() {
        if (isEmpty())
            return -1;
        return queue[front];
       }
    void main() throws Exception {
        Queue q = new Queue();
       Scanner sc = new Scanner(System.in);
       IO.println("Enter The Size Of Queue");
       int capacity = sc.nextInt();
       q.initialize(capacity);

       int choice = 0;
       do {
        Thread.sleep(1000);
           IO.println("1.enqueue");
           IO.println("2.deque");
           IO.println("3.isfull");
           IO.println("4.isempty");
           IO.println("5.Peek");

            System.out.println("Enter The Choice");
            choice = sc.nextInt();
      
           int data = 0;
            switch(choice) {
                case 1 :
                    IO.println("Enter The Element");
                    data = sc.nextInt();
                    q.enQueue(data);
                    break;
                case 2 :
                    IO.println(q.deQueue());
                    break;
                case 3 :
                    IO.println(q.isEmpty());
                    break;
                case 4 :
                    IO.println(q.isFull());
                    break;

                case 5 :
                    IO.println(q.peek());
                    break;
                default : IO.println("Thank You");
            }
       }
       while(choice != 6);
    }
}
