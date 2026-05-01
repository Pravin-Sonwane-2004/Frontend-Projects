// Q4. Separate Even and Odd Numbers
// Problem Statement
// Rearrange an array so that all even numbers come first and odd numbers later.
// Two Pointer Explanation
// Left pointer finds odd number.
// Right pointer finds even number.

// Swap them.
// Continue until pointers cross.

// Logical Operations Used
// Modulus operator
// Conditional swapping

// Pointer movement

class SeperateEvenAndOdd {
	void main() {
		int [] arr= {2,4,6,7,3,9};
		
		
		int start = 0;
		int end = arr.length-1;
		while (start<end && arr[start]%2==1) {
				start++;
		}
		 while (start<end && arr[end]%2==0) {
			 end--;
		}
		while (start<end) {
			if(arr[start]%2==0) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
		}
		for(int n : arr) {
			System.out.println(n);
		}
		
	}
}
