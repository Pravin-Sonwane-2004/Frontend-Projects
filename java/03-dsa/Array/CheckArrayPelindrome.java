/*
Q4. Check whether the given array is a palindrome. 
● Input: {1, 2, 3, 2, 1} 
● Output: true 
● Explanation: 
A palindrome reads the same forward and backward. 
Forward: 1 2 3 2 1 
Backward: 1 2 3 2 1 
Since both are the same, the array is a palindrome.
*/

class CheckArrayPelindrome{
	void main() {
        int[] arr = {1, 2, 3, 2, 1};
		int first = 0;
		int last = arr.length-1;
		boolean b = false;
		while(first<last) {
            if (arr[first] == arr[last]) {
                b = true;
                break;
            }
			first++;
			last--;
		}
		System.out.println(b);
	}
}