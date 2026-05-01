import java.util.Scanner;
// Q6. Write a java program to search an element in an array , its element found or not.
// Input:
 // Array = {10, 20, 30, 40, 50}
 // Element to search = 30
// Output : Element 30 found at index 2
// Explanation :
// We traverse the array and compare each element with the search key. If it matches, print "found" with index; otherwise print "not found".


class SearchEnteredElement {
    static void main(String[] args) {
		 int [] arr = {10, 20, 30, 40, 50};
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Element Enter ");
		 int search = sc.nextInt();
		 for(int i =0;i<arr.length;i++) {
			 if(search == arr[i]) {
				System.out.print("Element: " + search + " found at index : " + i); 
			 }
			  else {
				System.out.print("Sorry Couldent Found Element In This Array"); 
			 }
		 }
	}
}