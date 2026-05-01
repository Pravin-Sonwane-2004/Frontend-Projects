/*
Q3. Write a java program to count how many subarrays of size K have
sum divisible by 3.
Explanation:
Maintain window sum
Check sum % 3 == 0 for each window
Input :- arr = [3, 6, 2, 4, 7]	K = 2
Output :- 2
*/

class CheckSumDevisible {
	void main() {
		int [] arr = {3, 6, 2, 4, 7};
		int k = 2;
		int sum =0;
		int count =0;
		for(int i =0;i<k;i++) {
			sum += arr[i];
		}
		
		if(sum%3 == 0) {
		++count;
		}
		
		for(int i=k;i<arr.length;i++) {
			sum += arr[i] - arr[i-k];
				if(sum%3 == 0) {
					++count;
				}
		}
		System.out.println(count);
	}
}