// Q11. Write a java program to give an array, find the second largest element.
// Input : Array = {12, 35, 1, 10, 34, 1}
// Output : Second largest = 34
// Explanation:
// First largest is 35, second largest is the next maximum (34). 
// We maintain two variables (largest, secondLargest).

class SecLargestE {
	public static void main(String []args) {
		int [] arr = {12, 35, 1, 10, 34, 1};
		int max = 0;
		int secMax = 0;
		for(int i =0;i<arr.length;i++) {  
			  if(arr[i] > max) {
				  int temp = max;
				  secMax = temp;
				  max = arr[i];
			  }
			  else if(arr[i]>secMax ) {
				   secMax = arr[i];
			  }
		}
			System.out.println(secMax);
	} 
	
}