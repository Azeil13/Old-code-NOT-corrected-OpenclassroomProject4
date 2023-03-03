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
* @version  Commit 8 Build March 3, 2023.
*
*/

public abstract class SymptomWriter implements ISymptomWriter{
	
	
	
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



    
	
	
	
	        

	String[] symptoms;
	for(String symptom : symptoms){
		if(!sortedSymptoms.containsKey(symptom)){
			
			sortedSymptoms.put(symptom, 0);
		}
		
					int nbSymptomFound = sortedSymptoms.get(symptom);
					
					sortedSymptoms.put(symptom, nbSymptomFound+1);

				}
				
				try {
					SymptomWriter reader;
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



