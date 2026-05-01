// Q13. Write a java program to display only non-zero values from an array.
// Input : Array = {1, 0, 5, 0, 7, 0, 9}
// Output : Non-zero elements = {1, 5, 7, 9}
// Explanation :
// Traverse the array and print only elements that are not equal to zero.

class Q13PrintAllNonZero {
	void main() {
		int [] arr = {1, 0, 5, 0, 7, 0, 9};
		
		// this is for non zero print
		   // for(int i=0;i<arr.length;i++) {
			   // if(arr[i] != 0) {
				   // System.out.print(arr[i] + "  ");
			   // }
		   // }
		   // shift all zeros at last
			   int j = 0;
		   for(int i = 0;i<arr.length;i++) {
			   if(arr[i] != 0) {
				   arr[j++]= arr[i];
			   }
		   }
				while(j<arr.length) {
				  arr[j++] = 0; 
			   }
		   for(int i = 0;i<arr.length;i++) {
			   System.out.println(arr[i]);
		   }
	}
}