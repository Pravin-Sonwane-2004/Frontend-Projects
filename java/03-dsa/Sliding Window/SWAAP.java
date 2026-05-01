/*
Q3. Write a java program to count how many subarrays of size K have
sum divisible by 3.
Explanation:
Maintain window sum
Check sum % 3 == 0 for each window
Input :- arr = [3, 6, 2, 4, 7]	K = 2
Output :- 2
*/
public class SWAAP {
    void main() {
        int k = 2;
        int sum =0;
        int[] arr = {3, 6, 2, 4, 7};
        int count = 0;

        if (sum % 3 == 0)
            count++;

        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            if (sum % 3 == 0)
                count++;
        }
        IO.println(count + "");
    }
}
