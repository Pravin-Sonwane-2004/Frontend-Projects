package Queue;

class MyQueue {
    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;

    MyQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear++; 
        arr[rear] = data;
        size++;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = arr[front];
        front++;
        size--;
        return removed;
    }

    int peek() {
        if (isEmpty())
            return -1;
        return arr[front];
    }
}
