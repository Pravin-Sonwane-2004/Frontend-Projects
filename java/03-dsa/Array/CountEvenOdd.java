// Q5. Write a Java program to count even & odd values from an array.
// Input:
 // Array Size = 7
 // Array Elements = 12 17 24 39 40 55 70
// Output:
 // Count of Even Values = 4
 // Count of Odd Values = 3
// Explanation:
// Initialize counters: evenCount = 0, oddCount = 0.

// For each element in the array:

// If divisible by 2 → increase evenCount.
// Otherwise → increase oddCount.

// Final counts are displayed.


class CountEvenOdd {
    static void main(String[] args) {

        int[] arr = {12, 17, 24, 39, 40, 55, 70};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Count of Even Values = " + evenCount);
        System.out.println("Count of Odd Values = " + oddCount);
    }
}
