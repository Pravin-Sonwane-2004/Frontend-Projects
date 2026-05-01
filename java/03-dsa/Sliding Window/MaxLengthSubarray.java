// left = 0
// for right = 0 to n-1
    // include arr[right]

    // while (condition is invalid)
        // remove arr[left]
        // left++

    // update answer
class MaxLengthSubarray {
	int returnValid(int arr [] , int target) { 
		int left = 0;
		int sum =0;
		int maxLeng = 0;
		for(int right =0;right<arr.length;right++) {
			sum += arr[right];
			while(sum > target) {
				sum -= arr[left];
				left++;
			}
					maxLeng = Math.max(maxLeng,right-left+1);
		}
		return maxLeng;
	}
	void main() {
		int [] arr= {1,2,3,66,66,677};
		IO.println(returnValid(arr,7));
	}
}