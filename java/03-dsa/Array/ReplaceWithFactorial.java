// Q7. Replace each element with its factorial.
// Input: arr = [3, 4, 5]
// Output: arr = [6, 24, 120]
// Explanation: For each element, calculate factorial using 
// repeated multiplication, and update the array element with this value.

class ReplaceWithFactorial {
	void main() {
		int [] arr = {3, 4, 5};
		int k = 0;
		// for(int i = 0;i<arr.length;i++) {
			// arr[k++] = retFact(arr[i]);			
		// }
		
		for(int i =0;i<arr.length;i++) {
			
			int fact = 1;
			// int k = 0;
			
			for(int j = arr[i];j>0;j--) {
				fact *= j;
			}
			arr[k++] = fact;
		}
		
		
		for(int n : arr) {
			System.out.println(n);
		}
	
	}
	
		// public static int retFact (int n) {
			 // if (n <= 1) {
				// return 1;
			 // }
			// return n * retFact(n - 1);
		// }
	
	
	// public static int retFact (int n) {
		// int sum =1;
		// for(int i=n;i>0;i--)   //3>0
		// {
			// sum = sum * i;//1*3=3   3*2=6   6*1=6
		// }
		// return sum;
	// }
	
}