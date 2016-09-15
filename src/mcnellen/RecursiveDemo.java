package mcnellen;

public class RecursiveDemo {

	public static void main(String[] args) {
		showRecursion(69);
	}
	public static void showRecursion(int num) {
		System.out.println("Entering method. num = " + num);
		if (num > 1) {
			showRecursion(num - 1);
		}
		System.out.println("Leaving method. num = " + num);
	}

}
