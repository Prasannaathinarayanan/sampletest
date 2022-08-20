package filehandlingexamples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exampleprogram1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("D:\\example1.txt");
		
		if(!f.exists())
		{
			f.createNewFile();
		}
		
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Prasanna");
		bw.newLine();
		bw.write("1234");
		bw.close();
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);	
		
		File f2=new File("D:\\example1.xlsx");		
		
		FileOutputStream re= new FileOutputStream(f2);
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		
	}

}
