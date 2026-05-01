// Q8. Write a java program to find missing elements in an array.
// Input : Array = {1, 2, 4, 5, 7} 
// (numbers from 1 to 7 should be present)
// Output : Missing elements = {3, 6}
// Explanation:
// Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.
// ////////////////////////////////////
//i need to debug it and dry run it 
///////////////////////////////////////

public class MissingNumbers {

	public static void findAllMissing(int[] nums) {
		// 1. Find the maximum value in the input array to determine the range
		int maxVal = Integer.MIN_VALUE;
		for (int num : nums) {
			if (num > maxVal) {
				maxVal = num;
			}
		}
		// Assuming the numbers are in a range starting from 1
		int rangeEnd = maxVal;

		// 2. Create a boolean array to mark the presence of each number
		// The size should be one more than the maximum value to cover all indices from
		// 0 to maxVal
		boolean[] seen = new boolean[rangeEnd + 1];

		// 3. Iterate through the input array and mark the present numbers in the
		// boolean array
		for (int num : nums) {
			if (num >= 1 && num <= rangeEnd) {
				seen[num] = true;
			}
		}

		// 4. Iterate through the boolean array (starting from 1) and print indices that
		// are marked as false
		System.out.println("Missing numbers are:");
		for (int i = 1; i <= rangeEnd; i++) {
			if (!seen[i]) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

    static void main(String[] args) {
		int[] arr1 = { 9, 6, 4, 5, 7, 10, 1 }; // Missing: 2, 3, 8
		findAllMissing(arr1);

		int[] arr2 = { 1, 2, 3, 5, 6, 7, 10 }; // Missing: 4, 8, 9
		findAllMissing(arr2);
	}
}
