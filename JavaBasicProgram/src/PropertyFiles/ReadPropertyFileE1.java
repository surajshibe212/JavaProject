package PropertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFileE1 {

	public static void main(String[] args) throws IOException {
		String fileLocation="E:\\workspace\\JavaBasicProgram\\PropertyFiles\\AppData.properties";
		FileInputStream fis=new FileInputStream(fileLocation);

		Properties prop=new Properties();
		prop.load(fis);
		
		String name=prop.getProperty("name");
		String email=prop.getProperty("email");
		System.out.println("Name:"+name);
		System.out.println("Email:"+email);
		
	}

}

