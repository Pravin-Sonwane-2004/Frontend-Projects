import java.util.*;
class RemoveDulivcate {
	void main() {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,4,5,6,7,41,3,3,3,3,4,5566,6,66,6,5));
		ArrayList <Integer> newList = new ArrayList<>();
		
		for(int i=0;i<list.size();i++) {
			if(!newList.contains(list.get(i))) {
				newList.add(list.get(i));
			}
		}
		
		for(int n:newList) {
			IO.println(n);
		}
	}
}