package mcnellen;

public class Recursion {

	public static void main(String[] args) {
		starString(6);
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
}
