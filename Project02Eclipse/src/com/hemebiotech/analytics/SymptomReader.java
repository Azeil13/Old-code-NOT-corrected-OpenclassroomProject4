package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.io.FileReader;

/**
* 
* This is the class SymptomsReader which implements Interface ISymtomsReader
* 
* @author hilde Jacobi
* @version  Commit 11  Build March 5, 2023.
*
*/

public class SymptomReader implements ISymptomReader{

	
	/**
	 * open a file and return BufferReader
	 * @param filename it is the path of the file to open in the buffer
	 * @return return a BufferReader of all the lines of the file
	 */
	private BufferedReader openFile(String filename) {
		System.out.println("Open the file:"+ filename);
		BufferedReader reader;
		try {
			reader = new BufferedReader (new FileReader(filename));
			return reader;
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		return null;
	}


	
	/**
	 *
	 * @param reader create read File Method
	 * @return list of string File of symptoms
	 */
	
	public List<String> readFile(String filePath) { 
		BufferedReader reader =openFile(filePath);
		
		List<String> symptoms = new ArrayList<>(); 

		try {
			while (reader.ready()) {
				symptoms.add(reader.readLine()); 
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return symptoms;
	}
 
	 /**
	  * method put the symptoms in alphabetic order + count them 
	  * @param symptoms  List of the symptoms 
	  * @return    Treemap of the symptoms count + ordering
	  */
	  public TreeMap<String,Integer> sortSymptoms(List<String> symptoms){
		     TreeMap<String, Integer> sortedSymptoms = new TreeMap<String,Integer>();
		     for(String symptom : symptoms){
		    	 
				 if(!sortedSymptoms.containsKey(symptom)){
					sortedSymptoms.put(symptom,1);
				 }
				 else {
				 int nbSymptomFound = sortedSymptoms.get(symptom);
							
					sortedSymptoms.put(symptom, nbSymptomFound+1);
				 }
			}
		     return sortedSymptoms;
	  }

}

