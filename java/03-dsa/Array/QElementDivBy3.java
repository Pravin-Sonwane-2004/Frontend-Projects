// Q1. Replace All Elements Divisible by 3 with -1. 
// ● Input: [3, 6, 7, 9, 10] 
// ● Output: [-1, -1, 7, -1, 10] 
// ● Explanation: 
// Elements divisible by 3 are 3, 6, 9. These are replaced with -1. Other elements 
// remain unchanged.

class QElementDivBy3 {
	void main() {
		int [] arr = {3, 6, 7, 9, 10};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%3==0) {
				arr[i] = -1;
			}
		}
		for(int n : arr) {
			System.out.print(n + " ");
		}
	}
}