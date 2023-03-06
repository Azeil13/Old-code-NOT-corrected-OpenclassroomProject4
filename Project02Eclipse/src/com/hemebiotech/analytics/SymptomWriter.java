package com.hemebiotech.analytics;

 
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;


/**
* 
* This is the class SymptomsWriter which implements Interface ISymptomWriter
* 
* @author hilde Jacobi
* @version  Commit 12 Build March 6, 2023.
*
*/

public class SymptomWriter implements ISymptomWriter{
	
	/**
	 *method printFile print the symptoms that are in a map provide an order 
	 *+ print the file result.out
	 * @param Map<String,Integer> sortedSymptoms : map of the symptoms
	 * @throws IOException
	 */
	public void printFile(Map<String,Integer> sortedSymptoms ,String outputPath) throws IOException { 
		FileWriter resultsDocument = new FileWriter(outputPath); 
		
		for (String symptomKey: sortedSymptoms.keySet()) 
		{
			try {
				System.out.println(symptomKey+":"+sortedSymptoms.get(symptomKey));
				resultsDocument.write(symptomKey+":"+sortedSymptoms.get(symptomKey)+"\n");

			} catch (IOException e) {
				e.printStackTrace();
		       }

		
	    }
		
		resultsDocument.close();
	
	}
}







