package PropertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propetry2 {

	public static void main(String[] args) throws IOException {
		
		//by using relative path
         String fileLocation=".\\PropertyFiles\\AppData.properties";
         FileInputStream fis=new FileInputStream(fileLocation);
         Properties prop=new Properties();
         prop.load(fis);
         String name=prop.getProperty("name");
         System.out.println("Nmae:"+name);
         System.out.println("City:"+prop.getProperty("city"));
         System.out.println("Email:"+prop.getProperty("email"));
         System.out.println("Address:"+prop.getProperty("address"));
         
	}

}
