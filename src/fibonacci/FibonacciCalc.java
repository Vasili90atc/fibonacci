package fibonacci;

public class FibonacciCalc {

	public long fib(int n) {
		long n1 = 1;
		long n2 = 1;
		if (n > 0) {
			System.out.print(n1 + " ");
		}
		if (n > 1) {
			System.out.print(n2+" ");
		}
		
		long n3 = -1;
		for (int term = 3; term <= n; term++) {
			 n3 = n1 + n2;
			if (n3 < 0) {
				//overflow
				System.out.println("\nOverflow at term " + term + " with value = " + n3);
				break;
			}
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
		return n3;
	}
}
