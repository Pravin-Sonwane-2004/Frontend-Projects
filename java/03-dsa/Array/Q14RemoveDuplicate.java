// Q14.  Write a java program to remove duplicated values from arrays.
// Input : Array = {10, 20, 20, 30, 40, 40, 50}
// Output : Unique elements = {10, 20, 30, 40, 50}
// Explanation:
// Traverse the array, check if element already exists before adding to result, thus avoiding duplicates.

class Q14RemoveDuplicate {  
	  void main() {
		  int [] arr = {10, 20, 20, 30, 40, 40, 50};
		  int j = 0;
		  int count =0;
		  for(int i =0;i<arr.length-1;i++) {
			  if(arr[i] !=arr[i+1]) {
				  arr[j++] = arr[i];
				  count++;
			  }
		  }
		  arr[j++] = arr[arr.length-1];
		  count++;
		  
		 for(int i = 0;i<arr.length;i++) {
			 if(i < count) {
			    System.out.println(arr[i]);
			 }
		 }
	  }
}