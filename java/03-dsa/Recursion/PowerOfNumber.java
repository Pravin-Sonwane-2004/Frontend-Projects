//5) Power of a number (a^b)
  

class PowerOfNumber {
	static int powern(int a,int b) {
		if(b==0) {
			return 1;
		}
		return a*powern(a,b-1);
	  }
	  void main() {
		  int a = 3; int b = 3;
		  IO.println(powern(a,b));
	  }
}