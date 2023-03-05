
package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

/**
 * 
 * This is the Interface ISymptomWriter
 * 
 * @author hilde Jacobi
 * @version  Commit 9  Build March 4, 2023.
 *
 */

 
public interface ISymptomWriter {
	public void printFile(Map<String,Integer> sortedSymptoms,String outputPath) throws IOException;

}
