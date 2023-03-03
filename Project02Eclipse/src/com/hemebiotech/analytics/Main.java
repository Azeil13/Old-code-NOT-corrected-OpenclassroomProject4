import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
	List<String> GetSymptoms ();
	public List<String> printFile(BufferedWriter writer) {   //BufferedWriter function native of Java
				try {
			while (writer.ready()) {
			       getSymptoms.add(writer.writeLine()); // add in the List what it is writing each sentence
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getSymptoms;
	  }
	
	 //génère un fichier result.out avec les lignes que contient cette liste.
	try {

		 String content = "result.out"; //"Ceci est le contenu ajouté au fichier"

		 File file = new File("result.out");

		 // créer le fichier s'il n'existe pas
		 if (!file.exists()) {
		 file.createNewFile();
		 }

		 FileWriter fw = new FileWriter(file.getAbsoluteFile());
		 BufferedWriter bw = new BufferedWriter(fw);
		 bw.write(content);
		 bw.close();

		 System.out.println("Modification terminée!+ result.out");

		 } catch (IOException e) {
		 e.printStackTrace();
		 }
	 
	
	
	
	// next generate output for File result.out
			FileWriter writer = new FileWriter ("result.out");
			writer.close();
			
	
	
	
	
	
	
	
	
	
	
	
	//Create a  printList(List<String> listSymptoms)Method
	public void printList(List<String> listSymptoms){
	    System.out.println("The content of the List Symptoms  are: ");
	    }
	
	//Create a closeBR(BufferedReader reader)  Method
	public void closeBR(BufferedReader reader) {
	    System.out.println("BufferedReader is closed");
	    }
	
	
	
	
	//Inside main, call the methods 
	
	// Inside main, call the methods on the br object
	public static void main(String[] args) {
	  Main br = new Main();    // Create a br object
	  BufferedReader mybr =br.openFile("C:\\Users\\hilde\\OneDrive\\Desktop\\OpenClassroom- Project 4\\Project\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application-master\\Project02Eclipse\\symptoms.txt");                // Call the openFile(String filename) method
	  List<String> symptoms = br.readFile(mybr);   // Call the readFile(BufferedReader reader) method
	  br.printList(List<String> listSymptoms)	   // Call the printList(List<String> listSymptoms) method
	  br.closeBR(BufferedReader reader)		
	  
	}
}

