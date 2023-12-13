package fibonacci;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// Get number of terms from console
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter the number of terms in the sequence (0-100): ");
		int count = cs.nextInt();
		// check 0 < count < 100
		while (count < 0 || count > 100) {
			System.out.println("The number of terms must be from 0 to 100: ");
			count = cs.nextInt();
		}
		cs.close();
		
		FibonacciCalc f = new FibonacciCalc();
		f.fib(count);

	}
}