package mcnellen;

import mcnellen.Sort;

public class Sorting {

	/**
	 * Sorting.java
	 * Selection, Insertion, and Bubble sorts applied to integers, doubles, and strings
	 * @author Quinlan McNellen
	 * @version 1.0.0
	 * @date 11/17/2016
	 * @param args
	 */
	public static void main(String[] args) {
		int[] integers1 = {9, 2, 5, 7, 1, 4, 3, 8, 6};
		int[] integers2 = {9, 2, 5, 7, 1, 4, 3, 8, 6};
		int[] integers3 = {9, 2, 5, 7, 1, 4, 3, 8, 6};
		
		double[] doubles1 = {9.2, 2.4, 9.1, 6.7, 4.3, 9.6, 3.1, 9.8, 4.5};
		double[] doubles2 = {9.2, 2.4, 9.1, 6.7, 4.3, 9.6, 3.1, 9.8, 4.5};
		double[] doubles3 = {9.2, 2.4, 9.1, 6.7, 4.3, 9.6, 3.1, 9.8, 4.5};
		
		String[] strings1 = {"Aardvark", "Zebra", "Cat", "Bear", "Rat", "Giraffe", "Kangaroo", "Lion", "Centipede"};
		String[] strings2 = {"Aardvark", "Zebra", "Cat", "Bear", "Rat", "Giraffe", "Kangaroo", "Lion", "Centipede"};
		String[] strings3 = {"Aardvark", "Zebra", "Cat", "Bear", "Rat", "Giraffe", "Kangaroo", "Lion", "Centipede"};
		
		System.out.println("\nSelection Sort");
		Sort.Selection(integers1, true);
		Sort.Selection(doubles1, true);
		Sort.Selection(strings1, true);
		
		System.out.println("\nInsertion Sort");
		Sort.Insertion(integers2, true);
		Sort.Insertion(doubles2, true);
		Sort.Insertion(strings2, true);
		
		System.out.println("\nBubble Sort");
		Sort.Bubble(integers3, true);
		Sort.Bubble(doubles3, true);
		Sort.Bubble(strings3, true);
	}

}
