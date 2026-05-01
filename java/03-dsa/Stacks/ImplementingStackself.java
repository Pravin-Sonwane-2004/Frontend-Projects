public class ImplementingStackself {
    int [] stack;
    int capacity;
    int top;
    void initialize(int size) {
       stack = new int[size];
       top = -1;
       capacity = size-1; 
    }
    void push(int n) {
        if(top == capacity) {
          IO.print("stack is overflow"); 
          return; 
        }
        stack[++top] = n;
    }
    int pop() {
        if(top == -1) {
            System.err.println("Stack is underflow");
            return -1;
        }
        return stack[--top];
    }
    int peek () {
        if(top == -1) {
                        System.err.println("Stack is underflow");
            return -1;
        }
        return stack[top];
    }
    void display () {
          if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }    
    }
    void main() {

        ImplementingStackself s = new ImplementingStackself(); // no constructor used
        s.initialize(5);                                // manual initialization
        s.push(10);
        s.push(20);
        s.push(30);

        s.display();          // 30 20 10

        System.out.println(s.pop());   // 30
        System.out.println(s.peek());  // 20

    }
}