package com.hemebiotech.analytics;



import java.util.List;
import java.util.TreeMap;




/**
 * 
 * This is the Interface ISymptomReader 
 * 
 * @author hilde Jacobi
 * @version  Commit 9 Build March 4, 2023.
 *
 */

public interface ISymptomReader {
	
	public List<String> readFile(String filePath);
	public TreeMap<String,Integer> sortSymptoms(List<String> symptoms);

	
}

