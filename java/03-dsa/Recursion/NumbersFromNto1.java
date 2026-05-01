class NumbersFromNto1 {
	void printN(int n) {
		if(n<=0) {
			return;
		}
		IO.println(n);
		printN(n-1);
	}
	void main() {
		printN(10);
	}
}