// Assignment 2
// Find first non-repeating element.
// Hint:
// First pass → frequency map
// Second pass → check freq == 1
import java.util.*;
class FirstNonRepetingElement {
	void main() {
		int arr [] = new int[] {1,1,1,2,2,3,4,4,4,5,6,66,5};
		Map<Integer,Integer> map = new LinkedHashMap<>();
		for(int nums : arr) {
			if(map.containsKey(nums)) {
				map.put(nums,map.getOrDefault(nums,0)+1);			}
			else {
				map.put(nums,1);
			}
		}
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			 if(entry.getValue()==1) {
				 IO.println(entry.getKey() + "-> " + entry.getValue());
				 return;
			 }
		}
		// for(int n : arr){
			// if(map.get(n)==1) {
				// IO.println(n);
				// break;
			// }
		// }
		// IO.println(entry);
	}
}