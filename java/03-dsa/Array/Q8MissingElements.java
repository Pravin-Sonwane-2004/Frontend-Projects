// Q8. Write a java program to find missing elements in an array.
// Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
// Output : Missing elements = {3, 6}
// Explanation:
// Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.

class Q8MissingElements {
	void main() {
		int[] arr = { 1, 2, 4, 5, 7 };
		int count = 1;
		// this is for only 1 missing number in array
		for (int i = 1; i < arr.length; i++) {
			++count;
			if (arr[i] != count) {
				System.out.println(count);
				--count;
			}
			++count;
		}

	}
}