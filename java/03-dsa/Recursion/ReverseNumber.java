class ReverseNumber {    
	int re =0;
	int reverse(int n) {
		if(n<=0) {
		return re;
		}
		int temp = n%10;
		re = re*10+temp;
		return reverse(n/10);
	}
	int reverese(int n,int v) {
		if(n<=0) {
			return 1;
		}
		return reverese(n/10,v*10+n%10);
	}
	void main() {
		int n = 12345;
		IO.println(reverse(n));
	}
}
