/*
Q6. Create a new array where each element is the square of the original. 
● Input: arr = [2, 4, 6, 8] 
● Output: newArr = [4, 16, 36, 64] 
● Explanation: For each index, calculate arr[i] * arr[i] and store it in the new 
array.
*/

class Q6SquareOfNewElement {
	void main() {
		int arr [] = {2, 4, 6, 8};
		for(int i = 0;i<arr.length;i++) {
			arr[i] = (arr[i] * arr[i]);
		}
		for(int num : arr) {
			System.out.print(num + "  ");
		}
	}
}