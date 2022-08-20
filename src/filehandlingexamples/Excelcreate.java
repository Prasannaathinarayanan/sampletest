package filehandlingexamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelcreate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f= new File("D:\\vcentry.xlsx");
		if(!f.exists())
		{
		f.createNewFile();
		}
		
		FileOutputStream fos = new FileOutputStream(f);
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("vcentry");
		XSSFRow row=sheet.createRow(0);
		XSSFCell col=row.createCell(2);
		
		col.setCellValue("Technologies");
		
		workbook.write(fos);
		
		fos.close();

	}

}
