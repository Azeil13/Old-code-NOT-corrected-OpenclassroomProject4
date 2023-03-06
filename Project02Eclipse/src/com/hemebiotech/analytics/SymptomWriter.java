package com.hemebiotech.analytics;

import java.io.File; 
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;


/**
* 
* This is the class SymptomsWriter which implements Interface ISymtomWriter
* 
* @author hilde Jacobi
* @version  Commit 11 Build March 5, 2023.
*
*/

public class SymptomWriter implements ISymptomWriter{
	
	/**
	 *
	 * @param Map<String,Integer> sortedSymptoms : map of the symptoms
	 * @throws IOException
	 */
	public void printFile(Map<String,Integer> sortedSymptoms ,String outputPath) throws IOException { 
		FileWriter resultsDocument = new FileWriter(outputPath); 
		
		for (String symptomKey: sortedSymptoms.keySet()) 
		{
			try {
				System.out.println(symptomKey+":"+sortedSymptoms.get(symptomKey));
				resultsDocument.write(symptomKey+":"+sortedSymptoms.get(symptomKey));

			} catch (IOException e) {
				e.printStackTrace();
		       }

		resultsDocument.close();
	    }
     
	
	}
}







