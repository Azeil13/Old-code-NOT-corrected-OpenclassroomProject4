package com.hemebiotech.analytics;


import java.util.List;
import java.util.Map;
import java.util.TreeMap;




/**
* This is the main class Main 
* 
* @author hilde Jacobi
* @version Commit 6 Build February 23, 2023.
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
		for(String symptom : symptoms){
			if(!sortedSymptoms.containsKey(symptom)){
				// I initialize my counter for the symptom if it is the first time that I see it
				sortedSymptoms.put(symptom, 0);
			}

			// I am looking for the number of symptoms that I have already found
			int nbSymptomFound = sortedSymptoms.get(symptom);
			// I add 1 to the number of symptoms
			sortedSymptoms.put(symptom, nbSymptomFound+1);

		}
		
		try {
			reader.printFile(sortedSymptoms, "C:\\Users\\hilde\\git\\Openclassroom_Project4_March2023\\Old-code-NOT-corrected-OpenclassroomProject4\\Project02Eclipse\\symptoms.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


