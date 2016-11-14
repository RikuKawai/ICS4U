package mcnellen;

public class Palindrome {

	/**
	 * Palindrome.java
	 * Recursive Palindrome tester
	 * @author Quinlan McNellen
	 * @version 1.1.0
	 * @date 11/14/2016
	 * @param args
	 */
	public static void main(String[] args) {
		printResult(palindrome("some random string"));
		printResult(palindrome("racecar"));
		printResult(palindrome("The quick brown fox jumps over the lazy dog"));
		printResult(palindrome("madam"));
		printResult(palindrome("kayak"));
	}
	public static void printResult(boolean bool) {
		if (bool) {
			System.out.println("This string is a palindrome.");
		} else if (!bool) {
			System.out.println("This string is not a palindrome.");
		}
	}
	/**
	 * Palindrome checker control method
	 * @param str	String to test
	 */
	public static boolean palindrome(String str) {
		return palindrome(str, 0, str.length() - 1);
	}
	/**
	 * Palindrome checker recursive method
	 * @param str	String to test
	 * @param left	Left character
	 * @param right	Right character
	 * @return		True if palindrome, false if not
	 */
	private static boolean palindrome(String str, int left, int right) {
		if (str.charAt(left) == str.charAt(right) && left < right) {
			palindrome(str, left + 1, right - 1);
			return true;
		} else if (left < right) {
			return false;
		} else {
			return true;
		}
	}
}
