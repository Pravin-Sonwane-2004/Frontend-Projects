// Problem: Find the first "peak" element in an array.
// An element is a peak if it is greater than its neighbors.

// Input: arr = [1, 3, 20, 4, 1, 0]

// Output: 20

// Explanation: 20 is greater than 3 (left) and 4 (right).
// For the first and last elements, only one neighbor needs to be checked.

class CheckNeighbor{
	public static int retNeb (int [] arr) {
		int left = 0;
		int right = 0;
		int peak = 0;
		for(int i=1;i<arr.length-1;i++) {
			left = arr[i-1];
			right = arr[i+1];
			if(arr[i] > left && arr[i] > right) {
				peak = arr[i];
			}
		}
		return peak;
	}
	void main() {
		int [] arr = {1, 3, 1, 4, 1, 0};
		// CheckNeighbor obj = new CheckNeighbor();
		int result = retNeb(arr);
		System.out.println(result);	
	}
}