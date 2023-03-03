package com.hemebiotech.analytics;



import java.util.List;
import java.util.Map;
import java.util.TreeMap;




/**
* This is the main class Main 
* 
* @author hilde Jacobi
* @version Commit 8 Build March 3, 2023.
*
*/
public class Main {
	
	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) { 
		ISymptomReader reader = new SymptomReader(); 
		List<String> symptoms = reader.readFile("C:\\Users\\hilde\\git\\Openclassroom_Project4_March2023\\Old-code-NOT-corrected-OpenclassroomProject4\\Project02Eclipse\\symptoms.txt"); // Call the readFile(BufferedReader reader) method


	
		
		System.out.println(symptoms.size());
		Map<String,Integer> sortedSymptoms = new TreeMap<String,Integer>();
	}
	
}


