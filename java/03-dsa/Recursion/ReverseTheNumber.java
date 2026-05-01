class ReverseTheNumber {
 int rever = 0;
	int rev (int num) {
		if(num==0) {
			return rever;
		}
		int lastD = num%10;
		rever = rever*10+lastD;
        return 10 * rev(num % 10) + rev(num / 10);
	}
	void main() {
		int num = 12345;
		IO.println(rev(num));
	}
}