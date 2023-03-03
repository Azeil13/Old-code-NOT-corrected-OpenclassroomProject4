package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.io.FileReader;

/**
* 
* This is the class SymptomsReader which implements Interface ISymtomsReader
* 
* @author hilde Jacobi
* @version  Commit 8  Build March 3, 2023.
*
*/

public class SymptomReader implements ISymptomReader{


	
	/**
	 * open a file and return BufferReader
	 * @param filename it is the path of the file to open in the buffer
	 * @return return a BufferReader of all the lines of the file
	 */
	public BufferedReader openFile(String filename) {
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

		}

		resultsDocument.close();

	

    
	
	
	
	         

	String[] symptoms;
	for(String symptom : symptoms){
		Map<String, Integer> sortedSymptoms1;
		if(!sortedSymptoms.containsKey(symptom)){
			
			sortedSymptoms.put(symptom, 0);
		}
		
					int nbSymptomFound = sortedSymptoms.get(symptom);
					
					sortedSymptoms.put(symptom, nbSymptomFound+1);

				}
				
				try {
					SymptomReader reader;
					Map<String, Integer> sortedSymptoms1;
					reader.printFile(sortedSymptoms, "C:\\Users\\hilde\\git\\Openclassroom_Project4_March2023\\Old-code-NOT-corrected-OpenclassroomProject4\\Project02Eclipse\\symptoms.txt");
				} catch (Exception e) {
					e.printStackTrace();
				
					
					
					
			        try {
			  
			           
			            File results = new File("C:\\Users\\hilde\\git\\Openclassroom_Project4_March2023\\Old-code-NOT-corrected-OpenclassroomProject4\\Project02Eclipse\\symptoms.txt");
			  
			            
			            String path = results.getPath();
			  
			            
			            System.out.println("File path : " + path);
			        }
			        catch (Exception e1) {
			            System.err.println(e1.getMessage());
			        }

			        
					  
			       
			        try {
			  
			           
			            File symptoms1 = new File("C:\\Users\\hilde\\git\\Openclassroom_Project4_March2023\\Old-code-NOT-corrected-OpenclassroomProject4\\Project02Eclipse\\symptoms.txt");
			  
			            
			            String path = symptoms1.getPath();
			  
			            
			            System.out.println("File path : " + path);
			        }
			        catch (Exception e2) {
			            System.err.println(e2.getMessage());
			        }


				
				
				}
			}


}
