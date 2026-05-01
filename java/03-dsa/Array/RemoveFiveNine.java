class RemoveFiveNine {
	void main() {
		int [] arr = {1,3,5,5,5,5,6,5,8,5,5,5,8,5,5,9,9};
		int [] newArr = new int[arr.length];
		System.out.println("Actual Array : ");
		for(int i: arr) {
			System.out.print(arr[i] + " ");
		}
		  		System.out.println();
		//remove 5 and nine
		
		int count = 0;  
			int pointer = 0;
		 System.out.println("Five And Nine Removed : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!= 5 && arr[i]!=9) {
				newArr[i] = arr[i];
				// count++;
			} 
		}
		for(int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i] + " ");
		}
		
		System.out.println();
		 int k=0;
		for(int i =0;i<newArr.length-1;i++) {
			 if(newArr[i]!=0) {
				 newArr[k++] = newArr[i];
				 ++count;
			 }
			
		}
		
		System.out.println("changed Array : ");
		for(int i=0;i<count;i++) {
			System.out.print(newArr[i] + " ");
		}
	}
}