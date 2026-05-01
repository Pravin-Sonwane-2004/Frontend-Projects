// Q3. Write a java program to Find the window of size K whose elements have the highest sum.
// Input:
 // arr = {4, 2, 10, 3, 8, 6}
 // K = 2
// Output:	14
// Explanation:
// Window {10,3} → sum = 14

class HighestSumWindow {
	void main() {
		int k = 2;
		int []  arr = {4, 2, 10, 3, 8, 6};
		int sum = 0;
		for(int i =0;i<k;i++) {      //6
			sum += arr[i];            //6
		}
		int firstSum = sum;       //6
		
		for(int i =k;i<arr.length;i++) {       //2
			sum = sum + arr[i] - arr[i-k];     //10+6-4=12
			
			if(sum>firstSum) {                  //12>firstsum
				firstSum = sum;                 //firstsum=12
			}
		}
		System.out.println(firstSum);
	}
}