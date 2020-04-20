package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class DataProvider {
	public static Object[][]getData(String Sheet)
	{
		Object[][]data=null;
		try
		{
			
			FileInputStream fis=new FileInputStream("./Excel/data.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh =wb.getSheet(Sheet);
			int rc=sh.getLastRowNum();
			Row r=sh.getRow(0);
			short cc=r.getLastCellNum();
			data=new Object[rc+1][cc];
			for(int i=0;i<rc+1;i++)
			{
				Row row=sh.getRow(i);
				for(int j=0;j<cc;j++)
				{
					Cell cell=row.getCell(j);
					String value=cell.getStringCellValue();
					data[i][j]=value;
				}
			}
		}
			catch(Exception e)
			{
				System.out.println("invalid path");
			}
			return data;
		}
	
}
