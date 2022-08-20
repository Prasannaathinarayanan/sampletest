package filehandlingexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("D:\\testexcel.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		int row=sheet.getLastRowNum()+1;
		int col=sheet.getRow(0).getLastCellNum();
		
		System.out.println(row);
		System.out.println(col);
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(sheet.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_STRING)
				{
					String data=sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(data+" ");
				}
				else if(sheet.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_NUMERIC)
				{
					int num=(int) sheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(num+" ");
				}
			}
			System.out.println();
		}
		
		fis.close();
		
		
		FileOutputStream fos= new FileOutputStream(f);
		sheet.getRow(1).getCell(2).setCellValue("Vcentry6");
		workbook.write(fos);
		
		fos.close();

	}

}
