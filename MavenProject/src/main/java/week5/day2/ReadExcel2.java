package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public String[][] readExcel(String fileName) throws IOException
	{

		XSSFWorkbook wb = new XSSFWorkbook("./Data/"+fileName+".xlsx");
		// OpenSheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		// row counts
		int rownum = sheet.getLastRowNum();
		// column counts
		int columnnum = sheet.getRow(0).getLastCellNum();
		// To take Rows
		String[][] data = new String[rownum][columnnum];
		for (int i = 1; i <= rownum; i++) {
			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < columnnum; j++) {
				// go to cell
				XSSFCell cell = row.getCell(j);
				// Read data from cell in string

				data[i - 1][j] = cell.getStringCellValue();
				
			}

		}
		return data;
		// wb.close();
	}

}
