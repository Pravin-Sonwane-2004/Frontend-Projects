package vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.event.InternalFrameAdapter;

// Q1.Write a Java program to store 5 integer elements in a Vector and display all elements.
// Description
// Create a Vector of Integer type.
// Accept 5 numbers from user.
// Store them using add() method.
// Display elements using loop.
// Input
// Enter 5 numbers:
// 10
// 20
// 30
// 40
// 50
// Output
// Vector elements are:
// 10
// 20
// 30
// 40
// 50

public class Q1 {
    /**
     * 
     */
    void main() {
        Vector <Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(60);

       Iterator<Integer> i = v.iterator();

    while(i.hasNext()) {
        Object obj =  i.next();
        IO.println(obj);
    }
        
    }
}
