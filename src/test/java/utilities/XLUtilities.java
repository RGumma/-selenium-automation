package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtilities {

	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow ro;
	public static XSSFCell ce;
	
	
	
	public static int getRowCount(String xlfile, String xlsheet) throws IOException {
		
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(xlsheet);
		int rowcount=sh.getLastRowNum();
		wb.close();
		fi.close();
		
		return rowcount;
	}
	
	public static int getCellCount(String xlfile,String xlsheet, int rowno) throws IOException {
		
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(xlsheet);
		ro=sh.getRow(rowno);
		int cellcount=ro.getLastCellNum();
		wb.close();
		fi.close();
		
		return cellcount;
	}

  public static String getCellData(String xlfile, String xlsheet, int rowno, int column) throws IOException {
	  
	  fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(xlsheet);
		ro=sh.getRow(rowno);
		ce=ro.getCell(column);
		String data;
		
		try {
			
			DataFormatter formatter= new DataFormatter();
			
			String celldata=formatter.formatCellValue(ce);
			
			return celldata;
			
			}catch(Exception e) {
			
			 data ="";
			}
		
		   wb.close();
		   fi.close();
		   return data;
		   
  }
		
	public static void setCellData(String xlfile, String xlsheet, int rowno, int column, String data) throws IOException {
		
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(xlsheet);
		ro=sh.getRow(rowno);
		ce= ro.createCell(column);
		ce.setCellValue(data);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
}
		 


}






