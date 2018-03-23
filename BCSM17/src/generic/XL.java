package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XL 
{
public static String getcellvalue(String path, String sheet, int r, int c)
{
	String v=" ";
	
	try
	{
		Workbook wb= WorkbookFactory.create(new FileInputStream(path));
		
		v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
	}
	
	catch(Exception e)
	{
		
	}
	return v;
}
	public static int getRowCount(String path1 , String sheet1)
	{
		int rc=0;
		
		try
		{
			Workbook wb= WorkbookFactory.create(new FileInputStream(path1));
			
			rc=wb.getSheet(sheet1).getLastRowNum();
		}
		
		catch(Exception e)
		{
			
		}
		return rc;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

