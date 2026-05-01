// Q4. Write a java program to Find the sum of the first subarray of size K.
// Input:
// arr = {10, 20, 30, 40, 50}
// K = 3
// Output:
// 60
// Explanation:
// 10 + 20 + 30 = 60


class SumOfFirstSubArray {
	void main() {
		int [] arr = {10, 20, 30, 40, 50};
		int k = 3;
		int sum = 0;
		for(int i = 0;i<k;i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
} 