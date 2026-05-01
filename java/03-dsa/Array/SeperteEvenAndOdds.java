// Input 
// arr = [12, 17, 70, 15, 22, 65, 21, 90]

// Output 
// Separated array = [12, 90, 70, 22, 15, 65, 21, 17]

import java.util.Arrays;
class SeperteEvenAndOdds{
	void main() {
        int[] arr = {12, 17, 70, 15, 22, 65, 21, 90};
		
		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
			if(arr[start] %2 !=0 && arr[end] %2 ==0) {
				int temp  =arr[end];
				arr[end] = arr[start];
				arr[start] = temp;
				start++;
				end--;
			}
			else if(arr[start] %2 == 0) {
			start++;
				}
				
				else {
					end--;
				}
		}
		
		IO.println(Arrays.toString(arr));
	}
}