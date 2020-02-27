package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fs = new FileInputStream("D:\\Testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(fs);
		
		String s = prop.getProperty("browser");
		System.out.println(s);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("enviromment"));
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("tool", "selenium");
		System.out.println(prop.getProperty("tool"));
		
		prop.setProperty("name", "jira");
		System.out.println(prop.getProperty("name"));
		
		FileOutputStream os = new FileOutputStream("D:\\testing\\prop.properties");
		prop.store(os, "Adding to the file");
		
	}

}
