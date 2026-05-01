// Q1. Write a java program to count the frequency of each element in a given array.
// Input:
// Array = {1, 2, 2, 3, 3, 3, 4}
// Output:
//  1 → 1 time
//  2 → 2 times
//  3 → 3 times
//  4 → 1 time
// Explanation:
// For each element, count how many times it occurs in the array using nested traversal.

class Q1FrequencyOfElements {
	void main(){
		int [] arr = {1, 2, 2, 3, 3, 3, 4};
		boolean [] visited = new boolean[arr.length];
		for(int i = 0;i<arr.length;i++) {
			int count = 1;
			if(visited[i]) continue;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(arr[i] + " = " + count);		
		}
	}
}
