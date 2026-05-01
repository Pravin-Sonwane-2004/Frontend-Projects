// Q6. Move all zeros in an array to the end while maintaining the relative order of 
// non-zero elements. 
// Input :- arr = [0, 1, 0, 3, 12] 
// Output :- arr = [1, 3, 12, 0, 0] 
// Explanation: 
// ● All non-zero elements [1, 3, 12] retain their original order. 
// ● All zeros are moved to the end of the array.

class MoveAllZeros {
	void main() {
		int arr [] = {0, 1, 0, 3, 12};
	int j=0;
	  for(int i =0;i<arr.length;i++) {
		  if(arr[i] != 0) {
			arr[j++] = arr[i];
		  }
	  }
	  while(j<arr.length) {
		arr[j++] = 0;
	  }
	  for(int n : arr) {
		  System.out.println(n);
	  }
	}
}