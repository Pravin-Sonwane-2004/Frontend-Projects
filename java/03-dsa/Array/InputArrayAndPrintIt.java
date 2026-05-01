import java.util.Scanner;
// import java.util.Arrays;
// Q1. Write a Java program to input an array & display it.  


// Input:
 // Array Size = 5
 // Array Elements = 10 20 30 40 50
// Output:
 // 10 20 30 40 50
// Explanation:
// First, we take the size of the array from the user.
// Then, elements are entered one by one into the array.
// Finally, using a loop, we display all elements in the same order they were entered.


class InputArrayAndPrintIt {
    static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Size of Array");
		int size = sc.nextInt();
		int [] arr = new int[size];
		
		System.out.println("Enter The Elements of Array");
		for(int i = 0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Entered Elements of Array");
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
}