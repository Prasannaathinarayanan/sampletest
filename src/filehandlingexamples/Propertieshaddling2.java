package filehandlingexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertieshaddling2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File F = new File("D:\\test2.properties");
		FileInputStream fs = new FileInputStream(F);
		Properties pro = new Properties();
		pro.load(fs);
		
		System.out.println(pro.get("Username"));
		
	}
}
