class CountFreqNewTeq {
	void main() {
		int arr[] = {1,2,1,2,2,3,1,5};
		
		for(int i=0;i<arr.length-1;i++) {
			int count = 1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==-1) {
					continue;
				}
				else if(arr[i]==arr[j]) {
					count++;
					arr[j]=-1;
				}
			}
			 if(arr[arr.length-1] != 1)
			
			if(arr[i] != -1) {
				System.out.println(arr[i] + " "+ count);
			
			}
		}
	}
}