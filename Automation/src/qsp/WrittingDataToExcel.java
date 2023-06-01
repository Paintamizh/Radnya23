package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;

public class WrittingDataToExcel {

			public static void main(String[] args) throws EncryptedDocumentException, IOException {
				FileInputStream fis=new FileInputStream("C:\\Users\\barat\\eclipse-workspace\\Automation\\data\\Book1.xlsx");
				Workbook wb=WorkbookFactory.create(fis);
				
				wb.getSheet("Sheet1").getRow(1).getCell(3).setCellValue("fail");
				FileOutputStream fos=new FileOutputStream("C:\\Users\\barat\\eclipse-workspace\\Automation\\data\\Book1.xlsx");
				wb.write(fos);
				wb.close();
			}

}
