
class LengthOfLongestSubarray {
	void main() {
        int[] arr = {2, 1, 5, 1, 3, 2};
		 int start = 0;
		 int end = arr.length;
		 
	}
}

// Q1. Given an integer array and a number K, find the length of the
    // longest continuous subarray whose sum is less than or equal to K.
// Explanation:
// Use two pointers (start, end)
// Expand the window by moving end
// If sum > K, shrink window from start
// Track maximum window length
// Input :- arr = [2, 1, 5, 1, 3, 2]		K = 7
// Output :- 4
