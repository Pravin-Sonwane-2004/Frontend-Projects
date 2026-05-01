// Find the average of all subarrays of size K.

class FindAverageSubarray {
	void main() {
		int [] arr = {2,3,5,6,7,3,2,1};
		int k =3;
		int sum = 0;
		for(int i =0;i<k;i++) {
			sum += arr[i];
		}
		int avg = sum/k;
		System.out.println(avg);
		for(int i=k;i<arr.length;i++) {
			sum += arr[i] - arr[i-k];
			avg = sum/k;
			System.out.println(sum);
		}
		
	}
}