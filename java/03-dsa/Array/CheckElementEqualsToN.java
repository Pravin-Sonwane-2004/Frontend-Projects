// Random Question 2: Two-Pointer Pair Difference (Two-Pointer)

// Problem: Given a sorted array and a number N, 
// find if there exists a pair of elements whose difference is exactly N.

// Input: arr = [1, 8, 30, 40, 100], N = 60
// Output: True (100 - 40 = 60)
// Challenge: Try to do this in $O(n)$ time using two 
// pointers starting from the same side.

//i didnt got this question actually

class CheckElementEqualsToN {
	public static boolean retFound(int[] arr, int target) {
        int i = 0;
        int j = 1;

        while (j < arr.length) {
            int diff = arr[j] - arr[i];

            if (diff == target) {
                return true;
            } else if (diff < target) {
                j++;
            } else {
                i++;
                if (i == j) j++;
            }
        }
        return false;
    }

	void main() {
		int arr[] = {1, 8, 30, 40, 100};
		System.out.println(retFound(arr,60));
	}
}

// otpt 

// i=0 (1), j=1 (8)    diff=7   → too small → j++
// i=0 (1), j=2 (30)   diff=29  → too small → j++
// i=0 (1), j=3 (40)   diff=39  → too small → j++
// i=0 (1), j=4 (100)  diff=99  → too big   → i++
// i=1 (8), j=4 (100)  diff=92  → too big   → i++
// i=2 (30), j=4 (100) diff=70  → too big   → i++
// i=3 (40), j=4 (100) diff=60  → bingo
