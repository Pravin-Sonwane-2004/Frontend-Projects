class SumofDigits {
		 int sum = 0;
		static int retSum(int n) {
			if(n<=0) {
				return 0;
			}    
			return n%10+retSum(n/10);
		}
	  void main() {
		  int n = 12345;
		  IO.println(retSum(n));
	  }
}