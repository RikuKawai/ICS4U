package mcnellen;

import mcnellen.Search;

public class Searching {

	/**
	 * Searching.java
	 * Linear and Binary searches applied to integers, doubles, and strings
	 * @author Quinlan McNellen
	 * @version 1.0.0
	 * @date 11/07/2016
	 * @param args
	 */
	public static void main(String[] args) {
		//arrays to search in
		int[] integers = {1, 2, 4, 7, 9, 10, 14, 20, 29, 42};
		double[] doubles = {1.2, 2.7, 4.3, 7.5, 9.1, 10.9, 14.7, 20.4, 42.3};
		String[] strings = {"Tree", "Apple", "Orange", "Bush", "Berry", "Oak"};
		
		//per type targets to search for
		int integerTarget = 29;
		double doubleTarget = 7.5;
		String stringTarget = "Berry";
		
		//search each target using linear and binary, and print the results
		printResult("Linear", "integer", Integer.toString(integerTarget), Search.linear(integers, integerTarget));
		printResult("Binary", "integer", Integer.toString(integerTarget), Search.binary(integers, integerTarget));
		printResult("Linear", "double", Double.toString(doubleTarget), Search.linear(doubles, doubleTarget));
		printResult("Binary", "double", Double.toString(doubleTarget), Search.binary(doubles, doubleTarget));
		printResult("Linear", "string", stringTarget, Search.linear(strings, stringTarget));
		printResult("Binary", "string", stringTarget, Search.binary(strings, stringTarget));
	}
	
	/**
	 * Print the result of a search
	 * @param searchType	Type of search that was performed
	 * @param dataType		Type of data used
	 * @param targetValue	Value that was searched for
	 * @param result		Output from the searching method
	 */
	public static void printResult(String searchType, String dataType, String targetValue, int result) {
		if (result == -1) {
			System.out.println(searchType + " Search did not find " + dataType + " " + targetValue);
		} else {
			System.out.println(searchType + " Search found " + dataType + " " + targetValue + " at indice " + result);
		}
	}

}
