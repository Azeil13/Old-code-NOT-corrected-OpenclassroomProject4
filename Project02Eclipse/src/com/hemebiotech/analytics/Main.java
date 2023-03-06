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
* @version Commit 10 Build March 5, 2023.
*
*/
public class Main {
	
	/**
	 *
	 * @param args
	 */
         
         // Main driver method
	public static void main(String[ ] args) { 
           // Creating object of SymptomReader class 
                      // class SymptomReader implements interface ISymtomReader
		ISymptomReader reader = new SymptomReader(); 
          
           // Create an an empty string list by
		// declaring elements of readFile
		List<String> symptoms = reader.readFile("symptoms.txt"); 

		// Print the number of element in the  list of symptoms 
                      //size() method of the List interface in Java 
                                               //is used to get the number of elements in this list.
                                              // returns the number of elements in this list
		System.out.println(symptoms.size());
                      
                      // Mapping Integer Values to String Keys
                       // Creating the TreeMap using the SortSymptoms
                      //Creating an empty TreeMap by
		// declaring object of string, Integer pairs
                       //  Mapping int values to string  keys (symptom)
                       // read the sorted symptom and put them in the empty TreeMap
		TreeMap<String,Integer> sortedSymptoms = reader.sortSymptoms(symptoms);

                      // Creating object of SymptomWriter class 
                      // class SymptomWriter implements interface ISymtomWriter
		ISymptomWriter writer = new SymptomWriter();
		try {
			writer.printFile(sortedSymptoms,"result.out");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
