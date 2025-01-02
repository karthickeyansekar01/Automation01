package seleniumbasicsay2;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;




public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("");
	FileWriter fw= new FileWriter(f);
	BufferedWriter bw=new BufferedWriter(fw);
	
	bw.write("Second Line,Mid");
	bw.newLine();
	bw.write("Third Line,End");
	bw.newLine();
	
	
	bw.close();
	System.out.println("file is created");
	
	
		
		
		

	}

}
