package mcnellen;

public class Palindrome {

	/**
	 * Palindrome.java
	 * Recursive Palindrome tester
	 * @author Quinlan McNellen
	 * @version 1.0.0
	 * @date 11/09/2016
	 * @param args
	 */
	public static void main(String[] args) {
		Palindrome("some random string");
		Palindrome("racecar");
		Palindrome("The quick brown fox jumps over the lazy dog");
		Palindrome("madam");
		Palindrome("kayak");
	}
	/**
	 * Palindrome checker control method
	 * @param str	String to test
	 */
	public static void Palindrome(String str) {
		boolean palindrome = Palindrome(str, 0, str.length() - 1);
		if (palindrome) {
			System.out.println("This string is a palindrome.");
		} else if (!palindrome) {
			System.out.println("This string is not a palindrome.");
		}
	}
	/**
	 * Palindrome checker recursive method
	 * @param str	String to test
	 * @param left	Left character
	 * @param right	Right character
	 * @return		True if palindrome, false if not
	 */
	private static boolean Palindrome(String str, int left, int right) {
		if (str.charAt(left) == str.charAt(right) && left < right) {
			Palindrome(str, left + 1, right - 1);
			return true;
		} else if (left < right) {
			return false;
		} else {
			return true;
		}
	}
}
