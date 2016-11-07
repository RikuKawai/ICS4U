package mcnellen;

public class NumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(numDigits(137));
	}
	public static int numDigits(int n) {
		if (n > 0) {
			numDigits(n/10);
		}
		
	}
}
