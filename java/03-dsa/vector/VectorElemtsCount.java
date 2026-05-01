package vector;

import java.util.Scanner;
import java.util.Vector;

public class VectorElemtsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        Vector<Integer> vector = new Vector<>();

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            vector.add(element); 
        }
        for(int i=0;i<n;i++) {
            
        int totalElements = vector.size();

        System.out.println("Total elements in vector = " + vector.get(i));
        }

        scanner.close();
    }
}
    