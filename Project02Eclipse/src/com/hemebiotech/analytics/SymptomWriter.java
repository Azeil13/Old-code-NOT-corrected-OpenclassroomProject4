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
* @version  Commit 10 Build March 5, 2023.
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
		
        // For-each loop for traversal over Map
		// via KeySet() Method
		for (String symptomKey: sortedSymptoms.keySet()) 
		{
			try {
                   // Printing the symptomkey and the sortedsymptom 
				System.out.println(symptomKey+":"+sortedSymptoms.get(symptomKey));
				resultsDocument.write(symptomKey+":"+sortedSymptoms.get(symptomKey));

			} catch (IOException e) {

                      // printStackTrace() method is used to handle exceptions and errors
                     //pinpoint the exact line in which the method raised the exception.
				e.printStackTrace();
		       }

		resultsDocument.close();
	    }
     
	
	}
}







