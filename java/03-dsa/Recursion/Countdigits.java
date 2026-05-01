
class CountDigits  {
	//i wrote it by myself
	static int retCount(int n,int count) {
		if(n==0) {
			return count;
		}
		count++;
		return retCount(n/10,count);
	}
	 //chatgpt gave me this and i think this actually makes more sense
	static int digitCount(int n) {
		if(n<=10) {
			return 1;
		}
		return 1+digitCount(n/10);
	}
	void main() {
		int n = 12345;
		IO.println(digitCount(n) );
	}
}