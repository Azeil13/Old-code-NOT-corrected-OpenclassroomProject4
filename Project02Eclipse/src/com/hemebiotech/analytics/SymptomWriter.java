package com.hemebiotech.analytics;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;


/**
* 
* This is the class SymptomsReader which implements Interface ISymtomWriter
* 
* @author hilde Jacobi
* @version  Commit 7  Build March 3, 2023.
*
*/

public abstract class SymptomWriter implements ISymptomWriter{
	/*
	 * 
	 * Write printFile method
	 * and create the file result.out  which contain the line read line by line of the symtoms.txt
	 */
	
	
	/**
	 *
	 * @param Map<String,Integer> sortedSymptoms : map of the symptoms
	 * @throws IOException
	 */
	public void printFile(Map<String,Integer> sortedSymptoms ,String outputPath) throws IOException { //method printFile no return
		FileWriter resultsDocument = new FileWriter(outputPath); // create a new File
		
		for (String symptomKey: sortedSymptoms.keySet()) //create a new variable loop for line by line symptom
		{
			try {
				System.out.println(symptomKey+":"+sortedSymptoms.get(symptomKey));
				resultsDocument.write(symptomKey+":"+sortedSymptoms.get(symptomKey)); // put in the file the newline
			} catch (IOException e) {
				e.printStackTrace();
			

		}

		resultsDocument.close();

	}



    
	
	
	
	         // method openFile of the class is hidden by the use of the interface
			//read.openFile("XXXX"); -> does not compile and it is done on purpose

	String[] symptoms;
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
					SymptomWriter reader;
					reader.printFile(sortedSymptoms, "C:\\Users\\hilde\\git\\Openclassroom_Project4_March2023\\Old-code-NOT-corrected-OpenclassroomProject4\\Project02Eclipse\\symptoms.txt");
				} catch (Exception e) {
					e.printStackTrace();
				
					
					
					// convert absolute  results.out  File Path to relative File Path
					// use of getPath() function
					// try catch block to handle exceptions
			        try {
			  
			            // Create a file object
			            File results = new File("C:\\Users\\hilde\\git\\Openclassroom_Project4_March2023\\Old-code-NOT-corrected-OpenclassroomProject4\\Project02Eclipse\\symptoms.txt");
			  
			            // Get the path of the given file results
			            String path = results.getPath();
			  
			            // Display the file path of the file object
			            System.out.println("File path : " + path);
			        }
			        catch (Exception e1) {
			            System.err.println(e1.getMessage());
			        }

			        
					  
			        //convert absolute  symptoms.txt  File Path to relative File Path
			       // use of getPath() function
			     // try catch block to handle exceptions
			        try {
			  
			            // Create a file object
			            File symptoms1 = new File("C:\\Users\\hilde\\git\\Openclassroom_Project4_March2023\\Old-code-NOT-corrected-OpenclassroomProject4\\Project02Eclipse\\symptoms.txt");
			  
			            // Get the path of the given file results
			            String path = symptoms1.getPath();
			  
			            // Display the file path of the file object
			            System.out.println("File path : " + path);
			        }
			        catch (Exception e2) {
			            System.err.println(e2.getMessage());
			        }


				
				
				}
			}


}



