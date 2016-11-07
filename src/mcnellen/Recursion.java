package mcnellen;

/**
 * Recursion.java
 * Various examples of recursive methods
 * @author Quinlan McNellen
 * @date 10/26/2016
 */
public class Recursion {

	public static void main(String[] args) {
		starString(6);
		System.out.println(permut(10,4));
		System.out.println(factorial(8));
	}
	
	/**
	 * Prints n rows of asterisks, each with 2n-1 asterisks
	 * @param n Number of iterations
	 */
	public static void starString(int n) {
		if (n >= 0) {
			starString(n-1);
			int x = (int) Math.pow(2, n);
			for (int i=0; i<x; i++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		return;
	}
	/**
	 * Determines the factorial of n
	 * @param n
	 * @return calculated factorial
	 */
	public static int factorial(int n) {
		if (n==1) {
			return 1;
		} return n*factorial(n-1);
	}
	/**
	 * Determines the number of permutations of a set
	 * @param n Number of independent values
	 * @param r Values per set
	 * @return
	 */
	public static int permut(int n, int r) {
		return factorial(n)/factorial(n-r);
	}
}