// Q4. Write a program in java to find out the maximum 
// difference between any two elements such that larger element appears
 // after the smaller number.
	// Expected Output :
	// The given array is : 7 9 5 6 13 2
	// The elements which provide maximum difference is: 5, 13
	// The Maximum difference between two elements in the array is: 8


class FindMaxDiff {
	void main() {
		int arr [] = new int[] {7,9,5,6,13,2};
		int max =Integer.MIN_VALUE;
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max = arr[i];
		}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
			min = arr[i];
		}
		}
		
		IO.println(max-min);
	}
}