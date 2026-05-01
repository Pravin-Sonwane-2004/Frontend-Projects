// Q5. Return the first element that repeats in the array. 
// ● Input: {10, 5, 3, 4, 3, 5, 6} 
// ● Output: First repeating element is 5 
// ● Explanation: 
// ○ Traverse from left: 
// ■ 10 → first time. 
// ■ 5 → first time. 
// ■ 3 → first time. 
// ■ 4 → first time. 
// ■ 3 → already seen earlier → repeating, but not the first repeating (we 
// must check carefully). 
// ■ 5 → this was the earliest element that repeats. 
// ● Therefore, the first repeating element is 5.

class Q5FirstElementThatRepetsInArray {
	void main() {
		int arr [] = {10, 5, 3, 4, 3, 5, 6};
		boolean flag = false;
		for(int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++)  {
				if(i != j) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
					flag = true;
					break;
				}	
				}
			}
			if(flag) {
					break;
				}
		}
	}

}