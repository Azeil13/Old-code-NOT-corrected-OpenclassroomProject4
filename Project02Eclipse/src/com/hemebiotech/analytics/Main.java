package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;


/**
* This is the main class Main.
* In which the methods:
*  Create an an empty string list by declaring elements of readFile
*  Print the number of element in the  list of symptoms
*  Creating an empty TreeMap by declaring object of string, Integer pairs
*  Mapping int values to string  keys (symptom)
*  read the sorted symptom and put them in the empty TreeMap
*  
* 
* @author hilde Jacobi
* @version Commit 12 Build March 6, 2023.
*
*/
public class Main {
	
	/**
	 *
	 * @param args
	 */
          
	public static void main(String[ ] args) { 
          
		ISymptomReader reader = new SymptomReader(); 
		List<String> symptoms = reader.readFile("symptoms.txt"); 
		System.out.println(symptoms.size());
		TreeMap<String,Integer> sortedSymptoms = reader.sortSymptoms(symptoms);

		ISymptomWriter writer = new SymptomWriter();
		try {
			writer.printFile(sortedSymptoms,"result.out");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
