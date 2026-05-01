import java.util.*;

class FreqCount {
	void main () {
		int arr [] = {1,2,2,3,1,4};
		Map<Integer,Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for(int n : arr) {
			if(map.containsKey(n)) {
				list.add(n);
			}
			else {
				map.put(n,map.getOrDefault(n,0)+1);
			}
		}
		IO.println(list);
	}
}