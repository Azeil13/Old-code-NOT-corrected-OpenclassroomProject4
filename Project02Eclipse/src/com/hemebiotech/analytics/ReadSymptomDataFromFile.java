import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author hilde
 *
 */
//Main 

//Below Example Class written automatically by Eclipse
/*public class ReadSymptomDataFromFile {

	/**
	 * 
	 */
/*	public ReadSymptomDataFromFile() {
		// TODO Auto-generated constructor stub
	}
*/
	/**
	 * @param args
	 */
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

*/



/*
 * Puis faire un nouveau projet Java sous Eclipse avec une classe qui contiendra les éléments ci-dessous :
            - Ecrire une méthode "openFile" qui reçoit en paramètre le nom d'un fichier 
                (ex : Symptomes.txt) et retourne un BufferedReader du fichier
                public static BufferedReader openFile(String filename) {
             // Ouverture du fichier (à coder)

             // Retourne le BufferedReader
             }

             - Ecrire une méthode qui lit tous les symptomes ligne à ligne du fichier 
                et les stocke dans une List<String> qu'elle retourne
               Ex : public static List<String> readFile(BufferedReader reader) {
               }

             - Ecrire une méthode qui affiche à l'écran tous les symptômes d'une List<String>
               Ex : public static void printList(List<String> listSymptoms){
               }

             - Ecrire une méthode qui ferme un BufferedReader
                Ex : public static void closeBR(BufferedReader reader) {
                }
* 
 * 
 */

public class ReadSymptomDataFromFile {
	private static List<String> symptoms;
	private static List<String> listsymptoms;
	/*
	 *  Ecrire une méthode "openFile" qui reçoit en paramètre le nom d'un fichier 
                (ex : Symptomes.txt) et retourne un BufferedReader du fichier
                public static BufferedReader openFile(String filename) {
             // Ouverture du fichier (à coder)

             // Retourne le BufferedReader
             }
	 */
	 public static void main(String args[ ]) throws IOException {
	      //Creating a File object for directory
	 
	 File Symptoms = new File("C:\\Users\\hilde\\git\\Openclassroom_Project4_March2023\\Old-code-NOT-corrected-OpenclassroomProject4\\Project02Eclipse\\symptoms.txt");
     //List of the folder Symptomes.txt
     File filesList[] = Symptoms.listFiles( );
      System.out.println("List of symptoms");
	 }
      
      public static BufferedReader openFile(String filename) {
    	// Ouverture du fichier (à coder)
           
          // Retourne le BufferedReader
    	  try  
          {   
              File file_open=new File("C:\\Users\\hilde\\git\\Openclassroom_Project4_March2023\\Old-code-NOT-corrected-OpenclassroomProject4\\Project02Eclipse\\symptoms.txt");   
              BufferedReader br=new BufferedReader(new FileReader(file_open));  
              System.out.println("The content of the file are: ");  
              int ch=0;  
              while((ch=br.read())!=-1)  
              {  
              System.out.print((char)ch);  
              }  
          }  
          catch(Exception e)  
          {  
              e.printStackTrace();  
          }  
      }  
          
      





public static List<String> readFile(BufferedReader reader) {
	 
	/*
	 *  - Ecrire une méthode qui lit tous les symptomes ligne à ligne du fichier 
                et les stocke dans une List<String> qu'elle retourne
               Ex : public static List<String> readFile(BufferedReader reader) {
               }
	 */
	BufferedReader reader;

	try {
		reader = new BufferedReader(new FileReader("C:\\Users\\hilde\\git\\Openclassroom_Project4_March2023\\Old-code-NOT-corrected-OpenclassroomProject4\\Project02Eclipse\\symptoms.txt"
				+ ""));
		String line = reader.readLine();

		while (line != null) {
			System.out.println(line);
			// read next line
			line = reader.readLine();
		}

		reader.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	//et les stocke dans une List<String> qu'elle retourne
	Scanner s = new Scanner(new File("filepath"));
	ArrayList<String> list = new ArrayList<String>();
	while (s.hasNext()){
	    list.add(s.next());
	}
	s.close();
    }



public static void printList(List<String> listSymptoms){

	/*
	 * Ecrire une méthode qui affiche à l'écran tous les symptômes d'une List<String>
               Ex : public static void printList(List<String> listSymptoms){
               }
	 */
	 for(int i = 0; i < listsymptoms.size(); i++) {
         System.out.println(listsymptoms.get(i).getSymptoms());
         
}


	 
	 
	 
	 
	 
public static void closeBR(BufferedReader reader) {
    
	 /*
	  * Ecrire une méthode qui ferme un BufferedReader
                Ex : public static void closeBR(BufferedReader reader) {
                }
	  */
	 // Call close() method
    bufferReader.close();
    System.out.println(
            "BufferedReader is closed");
	 } 
}
