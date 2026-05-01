/*
Q7. Replace each element with its factorial. 
● Input: arr = [3, 4, 5] 
● Output: arr = [6, 24, 120] 
● Explanation: For each element, calculate factorial using repeated multiplication, and 
update the array element with this value. 
*/

class Q7ReplaceFactorial {
	void main() {
		int [] arr = {3,4,5};
		int j = 0;
		for(int i = 0;i<arr.length;i++) {
			int rev = 1;
		 	int temp = arr[i];
			 while(temp > 0) {
				 rev *= temp--;
			 }
			 arr[i] = rev;
		}
		
		for(int num : arr) {
			System.out.println(num);
		}
	}
}
