// Q12. Write a program in java to insert an element at desired position from an array.
	// Test Data :

	// Input the size of array : 6

	// Input 5 elements in the array in ascending order :
	// 1   2    3    4    5
	
	// Input the position where to insert : 2
	// Value :      200

	// Expected Output : The new list is : 1 2 200 3 4 5

import java.util.Scanner;
class Q12InsertElement {
	void main() {
		Scanner sc = new Scanner(System.in);
		int [] arr = {1,2,3,4,5};
		System.out.print("Enter The Value : ")  ;
		int value = sc.nextInt();
				System.out.print("Enter The Position : ")  ;
		int insertPosition = sc.nextInt();
		arr[insertPosition] = value;
		
		for(int num : arr) {
			System.out.print(num + "  ");
		}
	}
}