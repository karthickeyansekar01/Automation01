package basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
	
		
	//Writing or Creating a file
		
		File f = new File("C:\\Users\\kar3k\\eclipse-workspace\\basics\\basics\\src\\TestFileCreation.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter writer = new BufferedWriter(fw);
		//writing code
		writer.write("Second Line, Mid");
		writer.newLine();
		writer.write("Third Line, End");
		writer.newLine();
		
		//close stream
		writer.close();
		System.out.println("File is created....");

	
		
		
		
	//Reading File 	
		
		
		File f1 = new File("C:\\Users\\kar3k\\eclipse-workspace\\basics\\basics\\src\\TestFileCreation.txt");
		FileReader fr = new FileReader(f1);
		BufferedReader reader = new BufferedReader(fr);
		//Read a file
		String line = null;
		while((line=reader.readLine())!=null){
			
			System.out.println(line);

		
		
		
		
		
		
		}
		
		
	}

}
