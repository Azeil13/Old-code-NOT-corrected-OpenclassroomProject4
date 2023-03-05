package com.hemebiotech.analytics;


import java.io.IOException;
import java.util.List;
import java.util.TreeMap;




/**
* This is the main class Main 
* 
* @author hilde Jacobi
* @version Commit 9 Build March 4, 2023.
*
*/
public class Main {
	
	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) { 
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


