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

		long n1 = 1;
		long n2 = 1;
		if (count > 0) {
			System.out.print(n1 + " ");
		}
		if (count > 1) {
			System.out.print(n2+" ");
		}
		
		for (int term = 3; term <= count; term++) {
			long n3 = n1 + n2;
			if (n3 < 0) {
				//overflow
				System.out.println("\nOverflow at term " + term + " with value = " + n3);
				break;
			}
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
	}
}