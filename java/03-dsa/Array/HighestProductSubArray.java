// Random Question 3: Maximum Product Subarray of size K (Sliding Window)
// Problem: Given an array, find the maximum product of any continuous subarray of size K.

// Input: arr = [1, 5, 2, 3, 0, 10], K = 3

// Output: 30

// Explanation: The windows are {1,5,2} -> 10, {5,2,3} -> 30, {2,3,0} -> 0, {3,0,10} -> 0. The max is 30.


class HighestProductSubArray {

    public static int maxProduct(int[] arr, int k) {
        if (k > arr.length) return -1;

        int product = 1;
        int maxProduct = 0;
        int zeroCount = 0;

        // First window
        for (int i = 0; i < k; i++) {
            if (arr[i] == 0) zeroCount++;
            else product *= arr[i];
        }

        maxProduct = (zeroCount > 0) ? 0 : product;

        // Sliding window
        for (int i = k; i < arr.length; i++) {

            // outgoing
            if (arr[i - k] == 0) {
                zeroCount--;
            } else {
                product /= arr[i - k];
            }

            // incoming
            if (arr[i] == 0) {
                zeroCount++;
            } else {
                product *= arr[i];
            }

            if (zeroCount == 0) {
                maxProduct = Math.max(maxProduct, product);
            }
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 0, 10};
        int k = 3;
        System.out.println(maxProduct(arr, k));
    }
}
