/*
Q8. Count the number of prime numbers in an array. 
● Input: arr = [2, 5, 6, 9, 11] 
● Output: Count of prime numbers = 3 
● Explanation: Check each element if it is prime (only divisible by 1 and itself), and 
count such elements. 
*/

class Q8CountPrimeInArray {
	 void main() {
		 int [] arr = {2, 5, 6, 9, 11 ,13};
		int count = 0;
		for(int i =0;i<arr.length;i++) {	
		   boolean flag = true;
		   
		   if(arr[i]<1) {
			   flag = false;
		   }
		   else {
			   	for(int j =2;j<arr[i];j++) {
				if(arr[i] % j ==0) {
					flag = false;	
					break;
				}
				else {
					flag = true;
				}
			}
		   }
		   if(flag) count++;
		}
		System.out.println(count);
	 }
}