package filehandlingexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreading2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File F = new File("D:\\test2excel.xlsx");
		FileInputStream fex = new FileInputStream(F);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fex);
		XSSFSheet sheet = workbook.getSheet("Prasanna");
		
		int row = sheet.getLastRowNum()+1;
		int col = sheet.getRow(0).getLastCellNum();
		
		System.out.println(row);
		System.out.println(col);
		
		for(int i =0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				
			{
				if(sheet.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_STRING)
				{
					String value = sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.println(value);
					
				}
				
			}
		}
		
	fex.close();	
	}

}
