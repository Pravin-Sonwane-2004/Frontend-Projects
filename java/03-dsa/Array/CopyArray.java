// Q9. Write a java program to copy one array to another array.
// Input : Array1 = {5, 10, 15, 20}
// Output : Array2 = {5, 10, 15, 20}
// Explanation:
// Copy each element of Array1 into Array2 using index-by-index assignment.

public class CopyArray {
    static void main(String[] args) {
		 int [] Array1 = {5, 10, 15, 20};
		 int [] newArray = new int[Array1.length];
		 int j = 0;
		 for(int i = 0;i<Array1.length;i++) {
			newArray[j++] = Array1[i];
		 }
		 
		 for(int num : newArray) {
			  System.out.println(num);
		 }
	}
}