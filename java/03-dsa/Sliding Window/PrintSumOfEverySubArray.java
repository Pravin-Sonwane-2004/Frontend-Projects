// Q2.  Write a java program to Print sum of every subarray of size K.
// Input:
 // arr = {1, 2, 3, 4, 5}
 // K = 2
// Output:
 // 3 5 7 9
// Explanation:
// {1,2} → 3
// {2,3} → 5
// {3,4} → 7
// {4,5} → 9


class PrintSumOfEverySubArray {
	void main () {
		int [] arr = {1, 2, 3, 4, 5};
		int k = 2;
		int sum = 0;
		for(int i = 0;i<k;i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
		for(int i = k;i<arr.length;i++) {
			sum = sum+arr[i]-arr[i-k];
			System.out.println(sum);
		}
	}
}