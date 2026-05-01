class BubbleSort {
	void main() {
		int [] arr= {5,2,1,3,5,6,8,999,0,9,77,6,4,4};
		for(int i=0;i<arr.length;i++) {
		boolean flag = false;

			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					flag = true;
				}
				for(int n : arr) {
				System.out.print(n +" ");
				}
			System.out.println();	
			}
			if(!flag) {
					break;
				}
		}
		for(int n : arr) {
				System.out.println(n);
		}
	}
}