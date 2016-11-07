package mcnellen;

public class Search {
	public static int linear(int[] array, int target) {
		for (int i=0; i<array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}
	public static int binary(int[] array, int target) {
		return binary(array, target, 0, array.length-1);
	}
	private static int binary(int[] array, int target, int startIndex, int endIndex) {
		int midIndex = (startIndex + endIndex) / 2;
		
		if (startIndex > endIndex) {
			return -1;
		}
		if (array[midIndex] == target) {
			return midIndex;
		} else if (array[midIndex] > target) {
			return binary(array, target, startIndex, midIndex - 1);
		} else if (array[midIndex] < target) {
			return binary(array, target, midIndex + 1, endIndex);
		}
		return -1;
	}
	public static int linear(double[] array, double target) {
		for (int i=0; i<array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}
	public static int binary(double[] array, double target) {
		return binary(array, target, 0, array.length-1);
	}
	private static int binary(double[] array, double target, int startIndex, int endIndex) {
		int midIndex = (startIndex + endIndex) / 2;
		
		if (startIndex > endIndex) {
			return -1;
		}
		if (array[midIndex] == target) {
			return midIndex;
		} else if (array[midIndex] > target) {
			return binary(array, target, startIndex, midIndex - 1);
		} else if (array[midIndex] < target) {
			return binary(array, target, midIndex + 1, endIndex);
		}
		return -1;
	}
	public static int linear(String[] array, String target) {
		for (int i=0; i<array.length; i++) {
			if (array[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}
	public static int binary(String[] array, String target) {
		return binary(array, target, 0, array.length-1);
	}
	private static int binary(String[] array, String target, int startIndex, int endIndex) {
		int midIndex = (startIndex + endIndex) / 2;
		
		if (startIndex > endIndex) {
			return -1;
		}
		if (array[midIndex].equals(target)) {
			return midIndex;
		} else if (array[midIndex].compareTo(target) < 0) {
			return binary(array, target, startIndex, midIndex - 1);
		} else if (array[midIndex].compareTo(target) > 0) {
			return binary(array, target, midIndex + 1, endIndex);
		}
		return -1;
	}
}
