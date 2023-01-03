package PropertyFiles;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteFileP {

	public static void main(String[] args) throws IOException {
		/**property file location - using relative path, "." indicates current working directory
		 * Create instance of FileInputStream class and pass file location to its constructor
		 */
		FileInputStream fis = new FileInputStream(".\\PropertyFiles\\AppData.properties");
		// create an instance of Properties class
		Properties prop = new Properties();
		// call load method of property class to load property file
		prop.load(fis);
		System.out.println("Name: " + prop.getProperty("name"));
		
		prop.setProperty("Position", "Delivery Manager");
		//to save changes, get the file location and pass it to FileOutput stream class constructor
		FileOutputStream fos=new FileOutputStream(".\\PropertyFiles\\AppData.properties");
		prop.store(fos, "Added position");
		//flush the content into a property file
		fos.flush();
		//close property file instance
		fos.close();
		System.out.println("Updated");
	}
}
