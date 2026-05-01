class PrintNumsFrom1ton {
	static void mystery(int n) {
		if(n<=0) {
			return;
		}
		mystery(n-1);
		
		IO.println(n+ " ");		   
	}

	void main() {          
		mystery(10);
	}
}