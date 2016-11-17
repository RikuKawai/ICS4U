package mcnellen;

public class Sort {
	/**
	 * Integer Selection Sort
	 * @param array	Integer array to sort
	 * @param print	Print each pass
	 */
	public static void Selection(int[] array, boolean print) {
		if (print){printArray(array);}
		int temp;
		for (int i = array.length - 1; i>0; i--) {
			int first = 0;
			for (int j = 1; j<=i; j++) {
				if (array[j] > array[first]){first = j;}
			}
			temp = array[first];
			array[first] = array[i];
			array[i] = temp;
			if (print){printArray(array);}
		}
	}
	/**
	 * Double Selection Sort
	 * @param array Double array to sort
	 * @param print	Print each pass
	 */
	public static void Selection(double[] array, boolean print) {
		if (print){printArray(array);}
		double temp;
		for (int i = array.length - 1; i>0; i--) {
			int first = 0;
			for (int j = 1; j<=i; j++) {
				if (array[j] > array[first]){first = j;}
			}
			temp = array[first];
			array[first] = array[i];
			array[i] = temp;
			if (print){printArray(array);}
		}
	}
	/**
	 * String Selection Sort
	 * @param array	String array to sort
	 * @param print	Print each pass
	 */
	public static void Selection(String[] array, boolean print) {
		if (print){printArray(array);}
		String temp;
		for (int i = array.length - 1; i>0; i--) {
			int first = 0;
			for (int j = 1; j<=i; j++) {
				if (array[j].compareTo(array[first]) > 0){first = j;}
			}
			temp = array[first];
			array[first] = array[i];
			array[i] = temp;
			if (print){printArray(array);}
		}
	}
	/**
	 * Integer Insertion Sort
	 * @param array	Integer array to sort
	 * @param print	Print each pass
	 */
	public static void Insertion(int[] array, boolean print) {
		if (print){printArray(array);}
		int i;
		for (int j=1; j<array.length; j++) {
			int key = array[j];
			for (i=j-1; (i>=0)&&(array[i]>key); i--) {
				array[i+1] = array[i];
			}
			array[i+1] = key;
			if (print){printArray(array);}
		}
	}
	/**
	 * Double Insertion Sort
	 * @param array	Double array to sort
	 * @param print	Print each pass
	 */
	public static void Insertion(double[] array, boolean print) {
		if (print){printArray(array);}
		int i;
		for (int j=1; j<array.length; j++) {
			double key = array[j];
			for (i=j-1; (i>=0)&&(array[i]>key); i--) {
				array[i+1] = array[i];
			}
			array[i+1] = key;
			if (print){printArray(array);}
		}
	}
	/**
	 * String Insertion Sort
	 * @param array	String array to sort
	 * @param print	Print each pass
	 */
	public static void Insertion(String[] array, boolean print) {
		if (print){printArray(array);}
		int i;
		for (int j=1; j<array.length; j++) {
			String key = array[j];
			for (i=j-1; (i>=0)&&(array[i].compareTo(key)>0); i--) {
				array[i+1] = array[i];
			}
			array[i+1] = key;
			if (print){printArray(array);}
		}
	}
	/**
	 * Integer Bubble Sort
	 * @param array	Integer array to sort
	 * @param print	Print each pass
	 */
	public static void Bubble(int[] array, boolean print) {
		if (print){printArray(array);}
		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;
			for (int j=0; j<array.length-1; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					flag = true;
					if (print){printArray(array);}
				}
			}
		}
	}
	/**
	 * Double Bubble Sort
	 * @param array	Double array to sort
	 * @param print	Print each pass
	 */
	public static void Bubble(double[] array, boolean print) {
		if (print){printArray(array);}
		boolean flag = true;
		double temp;
		while (flag) {
			flag = false;
			for (int j=0; j<array.length-1; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					flag = true;
					if (print){printArray(array);}
				}
			}
		}
	}
	/**
	 * String Bubble Sort
	 * @param array	String array to sort
	 * @param print	Print each pass
	 */
	public static void Bubble(String[] array, boolean print) {
		if (print){printArray(array);}
		boolean flag = true;
		String temp;
		while (flag) {
			flag = false;
			for (int j=0; j<array.length-1; j++) {
				if (array[j].compareTo(array[j+1])>0) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					flag = true;
					if (print){printArray(array);}
				}
			}
		}
	}
	/**
	 * Print an array with a space between each value
	 * @param array	Integer array to print
	 */
	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	/**
	 * Print an array with a space between each value
	 * @param array	Double array to print
	 */
	public static void printArray(double[] array) {
		for (double i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	/**
	 * Print an array with a space between each value
	 * @param array	String array to print
	 */
	public static void printArray(String[] array) {
		for (String i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
