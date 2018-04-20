
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Datatesting {

	@org.testng.annotations.Test(dataProvider = "mytestingdata")
	private void Test(HashMap mapdata) {
		System.out.println("***********************TEST STARTED***************************");
		//System.out.println(mapdata.get("ID"));
		System.out.println(mapdata.get("FIRSTNAME"));
		System.out.println(mapdata.get("MIDNAME"));
		System.out.println(mapdata.get("LASTNAME"));
		System.out.println(mapdata.get("ROLLNO"));
		System.out.println(mapdata.get("ADDRESS"));
		System.out.println("***************************TEST END***************************");
	}

	@DataProvider(name = "mytestingdata")
	public Object[][] dataProviderMethod() throws IOException {
		String filepath = "TestData//TRIAL.xlsx";	
		File file = new File(filepath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		workbook.close();
		int rowc = sheet.getLastRowNum();
		int colc = sheet.getRow(0).getLastCellNum();
		// define object array
		Object[][] obj = new Object[rowc][1];
		// define map
		
		for (int i = 0; i < rowc; i++) {
			Map<Object, Object> datamap = new HashMap<>();
			for (int j = 0; j < colc; j++) {
				datamap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i+1).getCell(j).toString());
			}

			obj[i][0] = datamap;
		}
		return obj;
		

	}
}