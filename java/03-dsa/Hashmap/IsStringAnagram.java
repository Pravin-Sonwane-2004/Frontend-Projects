import java.util.*;
class isStringAnagram {
	boolean isIt(String s1,String s2) {
		Map<Character,Integer> map = new HashMap<>();
	
		if(s1.length() != s2.length()) {
            return false;
        }
		
	for(char ch : s1.toCharArray()) {
		map.put(ch,map.getOrDefault(ch,0)+1);
	}
	for(char ch : s2.toCharArray()) {
		if(!(map.containsKey(ch))) {
			return false;
		}
		map.put(ch,map.get(ch)-1);
	}
	for(int ch : map.values()) {     
		if(ch != 0) {
			return false;
		}
	}
	  return true;
	}
	void main() {
	String s1 = "listen";
	String s2 = "silent";
	IO.println(isIt(s1,s2));
}

}