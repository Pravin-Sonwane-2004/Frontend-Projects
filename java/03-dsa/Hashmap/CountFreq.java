import java.util.*;
class CountFreq {
	void main() {
		int arr[] = {1,2,2,3,1,4};
	Map<Integer,Integer> map = new HashMap<>();
	for(int num : arr) {
		if(map.containsKey(num)) {
			map.put(num,map.get(num)+1);
		}
		else{
			map.put(num,1);
		}
	}
	IO.println(map);
	}
}