// Q8. Count the number of prime numbers in an array.
// Input: arr = [2, 5, 6, 9, 11]
// Output: Count of prime numbers = 3
// Explanation: Check each element if it is prime (only divisible by 1 and itself),
// and count such elements.

public class Count {
	void main () {
        int[] arr = {2, 5, 6, 9, 11};
		 int count = 0;
		 for(int i=0;i<arr.length;i++) {
			boolean isPrime = false;
			for(int j = 2; j*j<=arr[i];j++)  {
				if(arr[i] % j !=0) {
					 isPrime = true;
					 break;
				}
				else {
					isPrime = false;
				}
			}
			if(isPrime)  {
				count++;
			}
		 }
		 System.out.println(count);
	}
}