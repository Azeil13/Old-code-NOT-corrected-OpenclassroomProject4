package com.hemebiotech.analytics;



import java.util.List;
import java.util.TreeMap;


/**
 * 
 * This is the Interface ISymptomReader 
*  This Interface  takes the place of the Dictionary class. 
* The user of this interface has precise control over where in the list each element (symptom) is read.
 * provides  collection view, which allow a map's contents to be viewed as a set of key-value     
 *  mappings. The TreeMap class makes specific guarantees as to the order of the symptoms.

 * java.util.List reads a file into a list of string
 * 
 * @author hilde Jacobi
 * @version  Commit 11 Build March 5, 2023.
 *
 */

public interface ISymptomReader {
	
	public List<String> readFile(String filePath);
	public TreeMap<String,Integer> sortSymptoms(List<String> symptoms);

	
}


