import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;






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
	public void printFile(List<String> symptoms) throws IOException {   //method printFile no return
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






	// Inside main, call the methods on the br object
	public static void main(String[] args) {
		Main br = new Main();    // Create a br object
		BufferedReader mybr =br.openFile("C:\\Users\\hilde\\git\\Openclassroom_Project4_March2023\\Old-code-NOT-corrected-OpenclassroomProject4\\Project02Eclipse\\symptoms.txt");                // Call the openFile(String filename) method
		List<String> symptoms = br.readFile(mybr);   // Call the readFile(BufferedReader reader) method
		System.out.println(symptoms.size());
		Map<String,Integer> sortedSymptoms = new TreeMap<String,Integer>();
		for(String symptom : symptoms){
			if(!sortedSymptoms.containsKey(symptom)){
				// j'initialise mon compteur pour le symptome si c'est la première fois que je le vois
				sortedSymptoms.put(symptom, 0);
			}
			
			// je cherche le nombre de symptome que j'ai déjà trouvé
			int nbSymptomFound = sortedSymptoms.get(symptom);
			// j'ajoute 1 au nb de symptome
			sortedSymptoms.put(symptom, nbSymptomFound+1);
			
		}
		for(String symptomKey : sortedSymptoms.keySet()) {
			System.out.println(symptomKey+":"+sortedSymptoms.get(symptomKey));
		}
	}
}


