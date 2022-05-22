package SeleniumAssignment.com.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFileDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		//obtaining input bytes from a file
		File file = new File("C:\\Users\\Harika\\Downloads\\Student.xlsx");
		System.out.println("File opened");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook excel= new XSSFWorkbook(inputStream); //xlsx
		XSSFSheet sheet= excel.getSheetAt(0);
		String data=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data present in the excel: "+ data);

		XSSFCell data1=sheet.getRow(0).createCell(4);
		data1.setCellValue("Exp");
		XSSFCell data2=sheet.getRow(1).createCell(4);
		data2.setCellValue("9");
		XSSFCell data3=sheet.getRow(2).createCell(4);
		data3.setCellValue("Fresher");
		XSSFCell data4=sheet.getRow(3).createCell(4);
		data4.setCellValue("4");
		FileOutputStream out= new FileOutputStream(file);
		excel.write(out);
		System.out.println("Data present in the excel: "+data1);
		System.out.println("Data present in the excel: "+data2);
		System.out.println("Data present in the excel: "+data3);
		System.out.println("Data present in the excel: "+data4);
		excel.close();
		
		}  
	}  






