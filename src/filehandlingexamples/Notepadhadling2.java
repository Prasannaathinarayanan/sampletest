package filehandlingexamples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepadhadling2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("D:\\Prasanna.txt");
		
		if (!f.exists())
		{
			f.createNewFile();					
		}
		
		FileWriter fw = new FileWriter(f);
		BufferedWriter fb =new BufferedWriter(fw);
		fb.write("Java class");
		fb.newLine();
		fb.write("File Handling");
		fb.newLine();
		fb.write("example");
		fb.close();		
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String A = "";
		while ((A =br.readLine())!=null)
		{
				System.out.println(A);
		}
		br.close();
	}
	
	}


