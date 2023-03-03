package com.hemebiotech.analytics;

import java.io.BufferedReader;
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
* @version  Commit 6  Build February 23, 2023.
*
*/

public class SymptomReader implements ISymptomReader{


	//Create a openFile(String filename) Method
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	//Create a readFile(BufferedReader reader) Method
	/**
	 *
	 * @param reader create read File Method
	 * @return list of string File of symptoms
	 */
	public List<String> readFile(String filePath) { //method BufferedReader native of Java
		BufferedReader reader =openFile(filePath);

		List<String> symptoms = new ArrayList<>(); // create a List of string with variable symptoms

		try {
			while (reader.ready()) {
				symptoms.add(reader.readLine()); // add in the List what it is reading each sentence
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return symptoms;
	}


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

		}

		resultsDocument.close();

	}




}
