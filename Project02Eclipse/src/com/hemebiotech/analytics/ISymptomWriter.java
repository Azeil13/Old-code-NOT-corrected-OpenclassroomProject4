
package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

/**
 * 
 * This is the  Interface ISymptomWriter .
 * The method in the interface provides methods for positional(indexed)access to list elements.
 * The method in the interface throws certain exception.
 * This Interface  takes the place of the Dictionary class. 
 * The user of this interface has precise control over where in the list each element is printed
 * provides  collection view, which allow a map's contents to be viewed as a set of key-value     
 * mappings. 
 *  
 * @author hilde Jacobi
 * @version  Commit 12  Build March 6, 2023.
 *
 */

 
public interface ISymptomWriter {
	public void printFile(Map<String,Integer> sortedSymptoms,String outputPath) throws IOException;

}

