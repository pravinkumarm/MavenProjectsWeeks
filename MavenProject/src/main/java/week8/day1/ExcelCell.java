package week8.day1;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCell {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String Location = "./Data/CL.xlsx";
		XSSFWorkbook ws = new XSSFWorkbook(Location);
		XSSFSheet Sheet=ws.getSheet("Sheet1");
		int rownum=Sheet.getLastRowNum();
		int colnum=Sheet.getRow(0).getLastCellNum();
		System.out.println(rownum);
		System.out.println(colnum);
		for (int i=1;i<=rownum;i++) {
			for (int j=0;j<colnum;j++) {
				System.out.println(Sheet.getRow(i).getCell(j).getStringCellValue());
			}
		}
		ws.close();
	}

}
