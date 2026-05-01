class FibbonacciSerise {
	// static void printFibbo(int n) {
			// if(n== 1 || n==2) {
				// return 1;
				// }
				// return printFibbo(n-1)+printFibbo(n-2);
		// }
		int fact(int n) {
		if(n == 0) return 1;
		return n * fact(n - 1);
	}
	int sum(int n) {
		if(n == 0) return 0;
		return n + sum(n - 1);
	}
	int pow(int base , int pow) {
		if(pow == 0 || base == 1) {
			return 1;
		}
		return base*pow(base,pow-1);
	}
	void test(int n) {
		if(n == 0) return;
		System.out.print(n + " ");
		test(n - 1);
		System.out.print(n + " ");
	}
	int fun(int n) {
		if(n == 0) return 0;
		return fun(n - 1) + n;
	}

	int fib(int n) {
		if (n <= 1) return n;
		
		return fib(n - 1) + fib(n - 2);
	}

	void fibonacci(int prev, int curr, int n) {
		 if(n==0) {
			 return;
		 }
		     System.out.print(prev + " ");

		 fibonacci(curr,prev+curr,n-1);
		 
	}
	int f(int n) {
    if(n <= 0) return 1;
    return n+f(n-1);
}
		void main() {
		IO.println(fib(4));
	}
}