// Q7.Write a java program count all pairs of elements in an array whose sum is equal to 
// a given number. 
// Input :- arr = [1, 5, 7, -1, 5]        
// Output :- 3 
// Explanation: 
// ● Pairs whose sum = 6 are: 
// ○ (1, 5) → first occurrence 
// ○ (7, -1) 
// sum = 6 
// ○ (1, 5) → second occurrence (from the second 5) 
// ● Total pairs = 3

class CountPairs{
	void main() {
        int[] arr = {1, 5, 7, -1, 5};
		int sum = 6;
		int count = 0;
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] + arr[j] == sum)
				count++;
			}
		}
		System.out.println(count);
	}
}