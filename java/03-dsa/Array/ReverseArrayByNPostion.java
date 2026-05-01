// given : 0  3  6  9  12  14  18  20  22  25  27
// ans : 12 14 18 20 22 25 27 0 3  6 9
import java.util.*;
class ReverseArrayByNPostion {
	static int [] revByN(int [] arr,int start,int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}
	void main() {
		int arr [] = {0,3,6,9,12,14,18,20,22,25,27};
		revByN(arr,0,arr.length-1);
		revByN(arr,0,6);
		revByN(arr,7,arr.length-1);
		IO.print(Arrays.toString(arr));
	}
}