// Q4. Write a program in java to find the smallest missing element from a sorted array? 
// Expected Output : 
// The given array is : 0 1 3 4 5 6 7 9 
// The missing smallest element is: 2 

class SmallestMissing {
	void main() {
		int [] arr = {0 ,1 ,3 ,4 ,5 ,6 ,7 ,9};
		for(int i = 0;i<arr.length;i++) {
			  boolean found = false;
			for(int j = 0;j<arr.length;j++) {
				if(arr[j]==i) {
					found = true;
					break;
				}
			}
			if(!found) {
				System.out.println(i);
				break;
			}
		}
	}
}