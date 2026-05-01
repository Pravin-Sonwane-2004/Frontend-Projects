// Count how many subarrays of size K have sum even.

class HowManyHasEvenSum {
	void main() {
		int [] arr = {2,3,5,6,7,3,2,1};
		int k =3;
		int sum = 0;
		for(int i =0;i<k;i++) {
			sum += arr[i];
		}
		if(sum % 2 ==0) {
			System.out.println(sum);
		}
		for(int i=k;i<arr.length;i++) {
			sum += arr[i] - arr[i-k];
			if(sum % 2 ==0) {
			System.out.println(sum);
		}
			
		}
		
	}
}