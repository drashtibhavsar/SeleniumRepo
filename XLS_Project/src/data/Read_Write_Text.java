package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Write_Text {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f= new File("D:\\testing\\temp.txt");
		f.createNewFile();
		
		//writing into a text file
		FileWriter filewrite = new FileWriter("D:\\testing\\temp.txt");
		BufferedWriter buff = new BufferedWriter(filewrite);
		buff.write("Hello we are writing in a file");
		buff.newLine();
		buff.write("this is new line 1");
		buff.newLine();
		buff.write("this is new line 2");
		buff.newLine();
		buff.write("this is new line 3");
		buff.newLine();
		buff.write("this is new line 4");
		buff.flush();
		buff.close();
		
		//read from the text file
		FileReader fread = new FileReader("D:\\testing\\temp.txt");
		BufferedReader bf = new BufferedReader(fread);
		
		String Content;
		int i=0;
		  while((Content = bf.readLine())!= null){
			   System.out.println(Content);
			   i++;
			  }
		  System.out.println(i);
		  
		/*System.out.println(bf.readLine());
		System.out.println(bf.readLine());
		System.out.println(bf.readLine());
		System.out.println(bf.readLine());
		System.out.println(bf.readLine());
		System.out.println(bf.readLine());
		System.out.println(bf.readLine());*/
				
	}

}
