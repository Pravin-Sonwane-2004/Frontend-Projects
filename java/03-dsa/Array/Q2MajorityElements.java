
	// A majority element in an array of size n is an element
	// that appears more than n/2 times (and
	// hence there is at most one such element).
	// Expected Output:
	// The given array is: 4  8  4  6  7  4  4  8
	// There are no Majority Elements in the given array

	class Q2MajorityElements {
	void main() {
	int [] arr = {4 , 8 , 4 , 6 , 7 , 8};
	// int count =0;
	int n = arr.length;
	boolean found = false; 
	    for(int i = 0;i<arr.length;i++) {
			int count=0;
			for(int j = 0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>=(n/2)) {
				System.out.println(arr[i]);
				found = true;
				break;
			}
		}  
	}
}
	