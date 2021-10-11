package eulerChallange;
/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */

public class Q9 {

	public static void main(String[] args) {

		// x^2 + y^2 = z^2

		
		for (int i = 1; i < 1000; i++) {
			for(int j = 1; j < 1000; j++) {
				int sqr_k = i*i + j*j;
				if (i + j + Math.pow(sqr_k, 0.5) == 1000.0) {
					System.out.println("i= "+ i + "\nj= "+j+"\nk= "+ Math.pow(sqr_k, 0.5));
					System.out.println("Result is: " + i * j * Math.pow(sqr_k, 0.5));
					return;

				}

			}
		}
	}

}
