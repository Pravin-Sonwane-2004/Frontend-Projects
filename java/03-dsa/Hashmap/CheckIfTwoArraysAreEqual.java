// Assignment 3
// Check if two arrays are equal (same elements, same frequency).
// Industry angle:
// Used in:
// Data integrity checks
// Log comparison

// Steps:
// If lengths different → return false
// Create Map<Integer, Integer>
// First array → increase frequency
// Second array → decrease frequency
// If any value ≠ 0 → not equal
// Complexity:
// Time: O(n)
// Space: O(n)
import java.util.*;
class CheckIfTwoArraysAreEqual {
	boolean areEqual(int arr1 [],int [] arr2) {
		Map<Integer,Integer> map = new HashMap<>();
		if(arr1.length != arr2.length) {
			return false;
		}
		for(int num : arr1) {
		if(map.containsKey(num)) {
			map.put(num,map.get(num)+1);
		}   else {
			map.put(num,1);
			}
		}
		for(int num : arr2){
			if(!(map.containsKey(num))) return false;
			if(map.containsKey(num)) {
				map.put(num,map.get(num)-1);
			}
			
		}
		for(int n: map.values()) {
			if(n != 0) {
				return false;
			}
		}
		return true;
	}
	void main() {
		int arr1 [] = {1,2,2,3};
		int arr2 [] = {2,1,3,2};
		 IO.println(areEqual(arr1,arr2));
	}
}