import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
*/
	
//Above examples code in case if need it 
	
	
	//Below starting code for SESSION OC Friday 20 January 2023
	/*
	 * - Dans la fonction main, 
	 * 	 appeler les méthodes créées précédemment pour dérouler dans l'ordre ce chemin :
    				- Ouvrir le fichier
					- Récupérer la liste des symptomes dans le buffered reader retourné par la méthode 1
					- Afficher à l'écran les symptômes de la liste récupérés
					- Cloturer le buffered reader

	 */




public class Main {

	//Create a openFile(String filename) Method
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
	  
	
	//Create a  readFile(BufferedReader reader) Method
	public List<String> readFile(BufferedReader reader) {   //BufferedReader function native of Java
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
	 * to do list friday 10 february 2023
	 * de la même manière que nous avons écrit la fonction readFile, 
	 * écrire la fonction printFile qui prend en entrée la List<String> créée précédemment 
	 * et génère un fichier result.out avec les lignes que contient cette liste.
	 */
	//Create a  printFile(BufferedWriter writer) Method
	public void printFile(List<String> symptoms) throws IOException {   //method printfile no return
		FileWriter resultsDocument = new FileWriter("result.out"); // create a new File 
			for (String symptom: symptoms) //create a new variable loop for line by line symptom	
			{
				try {		
				resultsDocument.write(symptom); // put in the file the newline 	
				} catch (IOException e) {
					 e.printStackTrace();
				}
				
			}
			
			resultsDocument.close();
		
	  }
	
	 
	 
	
	
	//Create a closeBR(BufferedReader reader)  Method
	public void closeBR(BufferedReader reader) {
	    System.out.println("BufferedReader is closed");
	    }
	
	
	
	

	
	// Inside main, call the methods on the br object
	public static void main(String[] args) {
	  Main br = new Main();    // Create a br object
	  BufferedReader mybr =br.openFile("C:\\Users\\hilde\\git\\Openclassroom_Project4_March2023\\Old-code-NOT-corrected-OpenclassroomProject4\\Project02Eclipse\\symptoms.txt");                // Call the openFile(String filename) method
	  List<String> symptoms = br.readFile(mybr);   // Call the readFile(BufferedReader reader) method
	  try {
		br.printFile(symptoms);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	   // Call the printList(symptoms) method
	  br.closeBR(mybr);	 // close mybr	
	  
	}
}

