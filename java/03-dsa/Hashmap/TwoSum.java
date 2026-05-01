// Assignment 4 – Two Sum (Most Important)
// Don't solve directly. Think:
// Question:
// Find two numbers whose sum = target.
// Brute force = O(n²)
// Better?
// Store what in map?
// Key = ?
// Value = ?
// Hint:
// Store number → index
// Check if (target - current) exists.
// Time: O(n)

class TwoSum {                               
	void main() {
		 int arr [] = new int[] {1,3,5,6,3,2,6};
		 int target = 11;
		 Map<Integer,Integer> map = new HashMap<>();
		 
		 for(int i=0;i<arr.length;i++) {
			 int complement = target - nums[i];
			 
			 if(map.containskey(complement)) {
				 return new int[]{map.get(complement),i};
			 }
			map.put(arr[i],i);
		 }
	}
}