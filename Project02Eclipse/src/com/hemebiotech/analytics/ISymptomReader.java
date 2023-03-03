package com.hemebiotech.analytics;


import java.io.IOException;
import java.util.List;
import java.util.Map;



/**
 * 
 * This is the Interface ISymptomReader 
 * 
 * @author hilde Jacobi
 * @version  Commit 6  Build February 23, 2023.
 *
 */

public interface ISymptomReader {
	
	public List<String> readFile(String filePath);

	public void printFile(Map<String,Integer> sortedSymptoms ,String outputPath) throws IOException;
}

