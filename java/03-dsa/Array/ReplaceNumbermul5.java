// Q3. Replace all elements in the array that are multiples of 5 with the number 5 itself. 
// ● Input: [10, 12, 15, 17, 20] 
// ● Output: [5, 12, 5, 17, 5] 
// ● Explanation: 
// ○ 10 is divisible by 5 → replaced with 5. 
// ○ 12 is not divisible by 5 → unchanged. 
// ○ 15 is divisible by 5 → replaced with 5. 
// ○ 17 is not divisible by 5 → unchanged. 
// ○ 20 is divisible by 5 → replaced with 5. 


class ReplaceNumbermul5 {
	void main() {
		int [] arr = {10, 12, 15, 17, 20};
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] % 5 == 0) {
				arr[i] = 5;
			}
		}
		for(int n : arr) {
			System.out.print(n+ " ");
		}
	}
}