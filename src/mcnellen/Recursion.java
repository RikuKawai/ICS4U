package mcnellen;

public class Recursion {
	/**
	 * Recursion.java
	 * Recursion problems
	 * @author Quinlan McNellen
	 * @version 1.0
	 * @date 09/19/2016
	 */
	public static void main(String[] args) {
		starString(6);
		System.out.println(permut(10, 4));
	}
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
	public static int permut(int n, int r) {
		return (factorial(n) / factorial(n-r));
	}
	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n*factorial(n-1);
	}
}
