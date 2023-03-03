package com.hemebiotech.analytics;



import java.util.List;
import java.util.Map;
import java.util.TreeMap;




/**
* This is the main class Main 
* 
* @author hilde Jacobi
* @version Commit 7 Build March 3, 2023.
*
*/
public class Main {
	// Inside main, call the methods on the br object
	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) { //Java main() method
		ISymptomReader reader = new SymptomReader(); // Create a br object
		List<String> symptoms = reader.readFile("C:\\Users\\hilde\\git\\Openclassroom_Project4_March2023\\Old-code-NOT-corrected-OpenclassroomProject4\\Project02Eclipse\\symptoms.txt"); // Call the readFile(BufferedReader reader) method

		// method openFile of the class is hidden by the use of the interface
		//read.openFile("XXXX"); -> does not compile and it is done on purpose
		
		System.out.println(symptoms.size());
		Map<String,Integer> sortedSymptoms = new TreeMap<String,Integer>();
	}
	
}


