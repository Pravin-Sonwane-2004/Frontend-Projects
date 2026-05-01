// Q8. Write a java program to find union array of two unsorted array. 
// Input :-  arr1 = [1, 2, 3]   
// arr2 = [2, 3, 4, 5] 
// Output :- [1, 2, 3, 4, 5] 
// Explanation: 
// ● Union combines all elements from both arrays. 
// ● Duplicates are removed to keep only unique elements.

class FindUniqueArray {
	void main () {
		  int [] arr1 = {1, 2, 3};
		  int [] arr2 = {2, 3, 4, 5};
		  int [] newArr = new int [arr1.length + arr2.length];
		  int k = 0;
		  for(int i = 0;i<arr1.length;i++) {
			newArr[k++] = arr1[i];
		  }


		  for(int i =0;i<newArr.length;i++) {
			for(int j = 0;j<arr2.length;j++) {
				
			}
		  }

		  for(int n : newArr) {
			System.out.println(n);
		  }
 	}
}