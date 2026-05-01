// Q7. Write a java program to display the reverse array.

// Input : Array = {1, 2, 3, 4, 5}
// Output : Reverse array = {5, 4, 3, 2, 1}
// Explanation :
// The last element becomes the first, and the first becomes the last by traversing from the end to the start.


class ReverseTheArray {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
		   int si = 0;
		   int ei = arr.length-1;
		   
		   while(si<ei) {
			   	int temp = arr[ei];
				arr[ei] = arr[si];
				arr[si] = temp;
				si++;
				ei--;
		   }
		   
		   for(int num : arr){
			   System.out.println(num);
		   }
	  }
	  
}