// Q5. Write a Java program to sort a given array in ascending & descending order. 
// Input :  
// Output :  
// Array = [12, 5, 9, 34, 1] 
// Ascending Order: [1, 5, 9, 12, 34] 
// Descending Order: [34, 12, 9, 5, 1] 
// Explanation: 
// ● Sorting means arranging elements in a particular order. 
// ● In ascending order, numbers are arranged from smallest to largest. 
// ○ For example: 1 < 5 < 9 < 12 < 34. 
// ● In descending order, numbers are arranged from largest to smallest. 
// ○ For example: 34 > 12 > 9 > 5 > 1. 
// ● The program should first sort the array in ascending order, then print the reverse of 
// that order for descending.
import java.util.*;
class SortArray {
	void main () {
	int arr[] = {12, 5, 9, 34, 1};
	
	Arrays.sort(arr);
	
	for(int i = arr.length-1;i>=0;i--){
		System.out.print(arr[i] + " ");
	}
	 System.out.println();
	for(int n : arr) {
		System.out.print(n + " ");
	}
	}
}