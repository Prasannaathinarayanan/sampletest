package filehandlingexamples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepadhadling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("D:\\vcentry.txt");
		if(!f.exists())
		{
			f.createNewFile();
		}
		FileWriter fr = new FileWriter(f);
		BufferedWriter br = new BufferedWriter(fr);
		br.write("vcentry");
		br.newLine();  
		br.write("Technologies");
		br.close();
		
		FileReader fc = new FileReader(f);
		BufferedReader bc = new BufferedReader(fc);
		
		String x="";
		
		while((x=bc.readLine())!=null)
		{
			System.out.println(x);
		}
			 
		bc.close();

	}

}
