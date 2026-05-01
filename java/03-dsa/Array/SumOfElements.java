import java.util.Scanner;
// Q2. Write a Java program to calculate the sum of all elements in an array.
// Input:
 // Array Size = 5
 // Array Elements = 2 4 6 8 10
 
// Output:
 // Sum of array elements = 30
 
// Explanation:
// Initialize a variable sum = 0.
// Traverse the array and keep adding each element to sum.
// After the loop ends, sum will hold the total of all array elements.

class SumOfElements{
	 public static void main(String [] args) {
		 int sum = 0;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Size");
		  int size = sc.nextInt();
		  int [] arr = new int[size];
		  
		  System.out.println("elements");
		  for(int i =0;i<size;i++) {
			  arr[i] = sc.nextInt();
		  }
		  for(int i = 0 ;i<arr.length;i++) {
			   sum += arr[i];
		  }
			System.out.println(sum);		
		  // for(int num : arr) {
			   // System.out.print(num + " ");
		  // }
	 }
}