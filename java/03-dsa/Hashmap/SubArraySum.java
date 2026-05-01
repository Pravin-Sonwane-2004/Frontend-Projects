import java.util.*;
class SubArraySum {
	void main () {		
			//3
		int arr[] = {3,4,1,5,1,5};
		
		int target = 6;
		Map<Integer,Integer> map = new HashMap<>();
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(sum - k)) {
				count += map.get(sum-k);
			}
			count += map.put(arr[i],map.get()+1);
		}
		
		IO.println(map);
	}
}