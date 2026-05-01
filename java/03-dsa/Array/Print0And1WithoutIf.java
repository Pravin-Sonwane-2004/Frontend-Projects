class Print0And1WithoutIf{
void main() {
	int [] arr = {1,1,1,0,0,1,0,1,0,1};
	int sum =0;
	int length = arr.length;
	for(int i =0;i<length;i++) {
		sum += arr[i];
	}
	System.out.println("0 = "+ (length-sum));
	System.out.println("1 = "+sum);
	}
	}