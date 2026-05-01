// Q5. Write a java program to Count how many subarrays of size K have sum greater than X.
// Input:
 // arr = {2, 1, 5, 1, 3, 2}
 // K = 3, X = 7
// Output:
 // 2
// Explanation:
// {2,1,5} → 8 
// {1,5,1} → 7 
// {5,1,3} → 9 
// {1,3,2} → 6 
// Total = 2


class SubarrayGraterX {
	void main () {
		int [] arr = {2, 1, 5, 1, 3, 2};
		int k = 3;
		int x = 7;
		int sum =0;
		int count = 0;
		for(int i =0;i<k;i++) {
			sum += arr[i];
		}
		if(sum>x) {
			++count;
		}
		for(int i = k;i<arr.length;i++) {
			 sum = sum+ arr[i] - arr[i-k];
			 if(sum>x) {
				 ++count;
			 }
		}
		System.out.println(count);
	}
}