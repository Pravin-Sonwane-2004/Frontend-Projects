// Q15. Write a java program to find common elements between two arrays.
// Input:
 // Array1 = {1, 2, 3, 4, 5}
 // Array2 = {3, 4, 5, 6, 7}
// Output : Common elements = {3, 4, 5}
// Explanation:
// Compare each element of Array1 with all elements of Array2, if match found → it is a common element.


class Q15CommonElements {
	void main() {
	int [] arr1 = {1, 2, 3, 4, 5};
	int [] arr2 = {3, 4, 5, 6, 7};
	System.out.print("common elements are : ");
	for(int i=0;i<arr1.length;i++) {
		for(int j = 0;j<arr2.length;j++) {
			  if(arr1[i] == arr2[j]) {
				System.out.print(arr1[i] + "  ");
			  }
		}
	}
	}
}