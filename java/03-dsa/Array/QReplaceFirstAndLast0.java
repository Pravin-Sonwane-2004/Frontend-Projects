// Q2. Replace First and Last Element with 0. 
// ● Input:[5, 3, 7, 2] 
// ● Output: [0, 3, 7, 0] 
// ● Explanation: 
// The first element (5) and the last element (2) are replaced with 0. Middle elements 
// remain the same

class QReplaceFirstAndLast0 {
	void main() {
	 int [] arr = {5, 3, 7, 2};
	 arr[0] = 0;
	 arr[arr.length-1] = 0;
	 for(int n : arr) {
		System.out.print(n + "  ");
	 }
	}
}