// Q1. Write a java program to Check if any
 // subarray of size K has sum equal to Target.
// Input:
// arr = {1, 4, 2, 10, 23, 3, 1, 0, 20}
// K = 4, Target = 39
// Output:
// Yes
// Explanation:
// Window {4,2,10,23} → sum = 39

class SubarrayIsEqualToSum {
	void main () {
		int [] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
		int w = 4;
		int target = 39;
		int sum = 0;
		//first window
		for(int i =0;i<w;i++) {
			sum = sum+arr[i];
		}
		if(sum == target)   {
			System.out.println("Yes");
		}
		
		//slide the window
		for(int i =w;i<arr.length;i++) {
			sum = sum+ arr[i] - arr[i-w];
			
			if(sum == target)   {
			System.out.println("Yes");
			return;
		}
		
		}
		System.out.println("No");
		
	}
}