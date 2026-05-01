package Queue;

import java.util.Scanner;

public class CircularQueue {
    int [] cArray;
    int size;
    int front;
    int tail;
    int capacity;
    void initialize (int capacity) {
        this.capacity= capacity;
        cArray = new int[capacity];
        size = 0;
        front = 0;
        tail = -1;
    }
    static void main(String[] args) {
    CircularQueue q = new CircularQueue();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter The Size Of Array");
    int size = sc.nextInt();

    q.initialize(size);

    int choice = 0;

    do {
        System.out.println("1.EnQueue");
        System.out.println("2.DeQueue");
        System.out.println("3.Peek");
        System.out.println("4.IsEmpty");
        System.out.println("5.IsFull");
        System.out.println("6.Exit");
        System.out.println("Enter your choice");

        choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Enter the data");
                int data = sc.nextInt();
                q.enQueue(data);
                break;

            case 2:
                System.out.println("Removed Element is " + q.deQueue());
                break;

            case 3:
                System.out.println(q.peek());
                break;

            case 4:
                System.out.println(q.isEmpty());
                break;

            case 5:
                System.out.println(q.isFull());
                break;
        }

    } while(choice != 6);

    sc.close();
}

    boolean isFull() {
        return size == capacity;
    }

    void enQueue(int data) {
        if(isFull()) {
            throw new RuntimeException("Queue is Full");
        }
        tail = (tail +1 )%capacity;
        cArray[tail] = data;
        size++; 
        
    }
    int deQueue() {
        if(isEmpty()) {
            throw new RuntimeException("Queue is empty");
            // return -1;
        }
        int removed = cArray[front];
        front = (front + 1) % capacity;
        size--;
        return removed;
    }
    
    int peek() {
        if (isEmpty())
            return -1;
        return cArray[front];
    }

    boolean isEmpty() {
        return size == 0;
    }
}
