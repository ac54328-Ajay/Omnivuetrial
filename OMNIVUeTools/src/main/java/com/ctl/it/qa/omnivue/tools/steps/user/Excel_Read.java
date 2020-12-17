package com.ctl.it.qa.omnivue.tools.steps.user;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.ctl.it.qa.staf.Page;
public class Excel_Read {
	private static Workbook workbook;
	private static Sheet sheet;
	private static Row row;
	private static Cell cell;
	HashMap<String, String> columnHeader;
	String ext;
	String location;
	//Properties p = new Properties();

	public void ExcelReader(String inputFile) {
		try {
			// workbook=new XSSFWorkbook(inputFile);
			File f = new File(inputFile);
			String name = f.getName();
			// System.out.println("--------------" + name);
			ext = name.substring(name.lastIndexOf(".") + 1);

			FileInputStream fio = new FileInputStream(f);

			if (ext.equalsIgnoreCase("xls")) {
				workbook = new HSSFWorkbook(fio);
			} else {
				workbook = new XSSFWorkbook(fio);
			}

			columnHeader = new HashMap<String, String>();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	/*public String getCellData_excel(String excelsheet, String sheetName, int rowNo, int colNo)
			throws Exception {
		try {
			String excelbook = Page.envData.getFieldValue(excelsheet);
			FileInputStream file = new FileInputStream(excelbook);
			workbook = new HSSFWorkbook(file);
			
			sheet = workbook.getSheet(sheetName);

			row = sheet.getRow(rowNo);
			cell = row.getCell(colNo);

			if (cell == null)
				
				return "";
			else if (cell.getCellType() == Cell.CELL_TYPE_STRING)
				return cell.getStringCellValue();
			else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC
					|| cell.getCellType() == Cell.CELL_TYPE_FORMULA) {

				String cellText = String.valueOf(cell.getNumericCellValue());
				if (HSSFDateUtil.isCellDateFormatted(cell)) {
					// format in form of M/D/YY
					double d = cell.getNumericCellValue();

					Calendar cal = Calendar.getInstance();
					cal.setTime(HSSFDateUtil.getJavaDate(d));
					cellText = (String.valueOf(cal.get(Calendar.YEAR)))
							.substring(2);
					cellText = cal.get(Calendar.DAY_OF_MONTH) + "/"
							+ cal.get(Calendar.MONTH) + 1 + "/" + cellText;

				}

				return cellText;
			} else if (cell.getCellType() == Cell.CELL_TYPE_BLANK)
				return "";
			else
				return String.valueOf(cell.getBooleanCellValue());

		} catch (Exception e) {
			throw new Exception("\nrow " + rowNo + " or column " + colNo
					+ " does not exist  in Excel");
		}

	}
	
	*/
	
	// This method will get the String data from the Excel sheet
	@SuppressWarnings("deprecation")
	public String getCellData(String sheetName, int rowNo, int colNo)
			throws Exception {
		try {
			
			
			sheet = workbook.getSheet(sheetName);

			row = sheet.getRow(rowNo);
			cell = row.getCell(colNo);
	
			if (cell == null)
				return "";
			else if (cell.getCellType() == Cell.CELL_TYPE_STRING)
				return cell.getStringCellValue();
			else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC
					|| cell.getCellType() == Cell.CELL_TYPE_FORMULA) {

				String cellText = String.valueOf(cell.getNumericCellValue());
				if (HSSFDateUtil.isCellDateFormatted(cell)) {
					// format in form of M/D/YY
					double d = cell.getNumericCellValue();

					Calendar cal = Calendar.getInstance();
					cal.setTime(HSSFDateUtil.getJavaDate(d));
					cellText = (String.valueOf(cal.get(Calendar.YEAR)))
							.substring(2);
					cellText = cal.get(Calendar.DAY_OF_MONTH) + "/"
							+ cal.get(Calendar.MONTH) + 1 + "/" + cellText;

				}

				return cellText;
			} else if (cell.getCellType() == Cell.CELL_TYPE_BLANK)
				return "";
			else
				return String.valueOf(cell.getBooleanCellValue());

		} catch (Exception e) {
			throw new Exception("\nrow " + rowNo + " or column " + colNo
					+ " does not exist  in Excel");
		}

	}

	public ArrayList<String> getRowContent(String sheetName, int rowNo)
			throws Exception {
		ArrayList<String> data = new ArrayList<String>();
		// sheet=workbook.getSheet(sheetName);
		for (int i = 0; i < getRowCellCount(sheetName, rowNo); i++) {
			data.add(getCellData(sheetName, rowNo, i));
		}
		return data;

	}

	public ArrayList<String> getColumnContent(String sheetName, int colNo)
			throws Exception {
		ArrayList<String> data = new ArrayList<String>();
		// sheet=workbook.getSheet(sheetName);

		for (int i = 0; i < getColumnCellCount(sheetName); i++) {
			data.add(getCellData(sheetName, i, colNo));
		}
		return data;

	}

	// Returns the Column count in a Row
	public int getRowCellCount(String sheetName, int rowNo) throws Exception {
		try {
			sheet = workbook.getSheet(sheetName);

			return sheet.getRow(rowNo).getLastCellNum();
		} catch (Exception e) {
			throw new Exception("\nInvalid Sheet or Row:" + sheetName + "or"
					+ rowNo);
		}
	}

	// Returns the Row count in a Sheet
	public int getColumnCellCount(String sheetName) throws Exception {
		try {
			sheet = workbook.getSheet(sheetName);

			return sheet.getLastRowNum() + 1;
		} catch (Exception e) {
			throw new Exception("\nInvalid Sheet Name:" + sheetName);
		}

	}

	public String getCellData(String sheetName, int rowNo, String colName)
			throws Exception {
		String cellText = null;
		if (columnHeader.isEmpty())
			getColumnHeaders(sheetName);
		try {
			if (!columnHeader.get(colName).equals(null)) {
				cellText = getCellData(sheetName, rowNo,
						Integer.parseInt(columnHeader.get(colName)));
			}
		} catch (Exception e) {
			throw new Exception("\nInvalid Column Name:" + colName);
		}
		return cellText;
	}

	public void getColumnHeaders(String sheetName) throws Exception {
		for (int i = 0; i < getRowCellCount(sheetName, 0); i++) {
			columnHeader.put(getCellData(sheetName, 0, i).trim(), i + "");
		}
	}
	
	public int getIntegerCellData(String sheetName, int rowNo, String colName)
			throws Exception {

		return (int) Float.parseFloat(getCellData(sheetName, rowNo, colName));

	}

	@SuppressWarnings("deprecation")
	public String getICellData(String sheetName, int rowNo, String colName)
			throws Exception {
		String cellText = null;
		if (columnHeader.isEmpty())
			getColumnHeaders(sheetName);
		try {
			if (!columnHeader.get(colName).equals(null)) {
				// cellText=getCellData(sheetName, rowNo,
				// Integer.parseInt(columnHeader.get(colName)));
				int colNo = Integer.parseInt(columnHeader.get(colName));
				try {
					sheet = workbook.getSheet(sheetName);

					row = sheet.getRow(rowNo);
					cell = row.getCell(colNo);

					if (cell == null)
						return "";
					else if (cell.getCellType() == Cell.CELL_TYPE_STRING)
						return cell.getStringCellValue();
					else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC
							|| cell.getCellType() == Cell.CELL_TYPE_FORMULA) {

						cellText = String.valueOf((int) cell
								.getNumericCellValue());
						if (HSSFDateUtil.isCellDateFormatted(cell)) {
							// format in form of M/D/YY
							double d = cell.getNumericCellValue();

							Calendar cal = Calendar.getInstance();
							cal.setTime(HSSFDateUtil.getJavaDate(d));
							cellText = (String.valueOf(cal.get(Calendar.YEAR)))
									.substring(2);
							cellText = cal.get(Calendar.DAY_OF_MONTH) + "/"
									+ cal.get(Calendar.MONTH) + 1 + "/"
									+ cellText;

						}

						return cellText;
					} else if (cell.getCellType() == Cell.CELL_TYPE_BLANK)
						return "";
					else
						return String.valueOf(cell.getBooleanCellValue());

				} catch (Exception e) {
					throw new Exception("\nrow " + rowNo + " or column "
							+ colNo + " does not exist  in Excel");
				}

			}
		} catch (Exception e) {
			throw new Exception("\nInvalid Column Name:" + colName);
		}
		return cellText;
	}

	@SuppressWarnings("resource")
	public void setcelldata(String excelname,String sheetName, int rowNo, int colNo, String Val)
			throws Exception {
		try {
			 String GDB_Sheet = Page.envData.getFieldValue(excelname);
		/*	p.load(new FileInputStream(
					".\\src\\Properties\\parameter.properties"));
			location = p.getProperty("Input_file_Loc");*/

			FileInputStream file = new FileInputStream(GDB_Sheet);
			// "c:\\OSSPROVOrig\\Common_FlowThru\\GDB_Device_sheet_Test1.xls");
			Workbook workbook;
			Sheet sheet;
			workbook = new HSSFWorkbook(file);
			sheet = workbook.getSheet(sheetName);

			/*if (ext.equalsIgnoreCase("xls")) {
				workbook = new HSSFWorkbook(file);
				sheet = workbook.getSheet(sheetName);
			} else {
				workbook = new XSSFWorkbook(file);
				sheet = workbook.getSheet(sheetName);
			}*/

			Cell cell = null;

			// Retrieve the row and check for null
			Row sheetrow = sheet.getRow(rowNo);
			if (sheetrow == null) {
				sheetrow = sheet.createRow(rowNo);
			}
			// Update the value of cell
			cell = sheetrow.getCell(colNo);
			if (cell == null) {
				cell = sheetrow.createCell(colNo);
			}
			cell.setCellValue(Val);

			file.close();

			FileOutputStream outFile = new FileOutputStream(new File(GDB_Sheet));
			// "c:\\OSSPROVOrig\\Common_FlowThru\\GDB_Device_sheet_Test1.xls"));
			workbook.write(outFile);
			outFile.close();			
			
			file.close();
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("resource")
	public void setcelldata2excel(String excelname,String sheetName, int rowNo, int colNo, String Val)
			throws Exception {
		try {
			// String GDB_Sheet = Page.envData.getFieldValue(excelname);
		/*	p.load(new FileInputStream(
					".\\src\\Properties\\parameter.properties"));
			location = p.getProperty("Input_file_Loc");*/

			FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\"+excelname+".xls");
			// "c:\\OSSPROVOrig\\Common_FlowThru\\GDB_Device_sheet_Test1.xls");
			Workbook workbook;
			Sheet sheet;
			workbook = new HSSFWorkbook(file);
			sheet = workbook.getSheet(sheetName);

			/*if (ext.equalsIgnoreCase("xls")) {
				workbook = new HSSFWorkbook(file);
				sheet = workbook.getSheet(sheetName);
			} else {
				workbook = new XSSFWorkbook(file);
				sheet = workbook.getSheet(sheetName);
			}*/

			Cell cell = null;

			// Retrieve the row and check for null
			Row sheetrow = sheet.getRow(rowNo);
			if (sheetrow == null) {
				sheetrow = sheet.createRow(rowNo);
			}
			// Update the value of cell
			cell = sheetrow.getCell(colNo);
			if (cell == null) {
				cell = sheetrow.createCell(colNo);
			}
			cell.setCellValue(Val);

			file.close();

			FileOutputStream outFile = new FileOutputStream(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\"+excelname+".xls"));
			// "c:\\OSSPROVOrig\\Common_FlowThru\\GDB_Device_sheet_Test1.xls"));
			workbook.write(outFile);
			outFile.close();			
			
			file.close();
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

@SuppressWarnings({ "rawtypes", "resource", "deprecation", "unused" })
public ArrayList Excelreaddata(String excelname,String sheetName){
	
	try {
	FileInputStream file;
	ArrayList<String> data = new ArrayList<>();
		file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\"+excelname+".xls");
	
	Workbook workbook;
	Sheet sheet;
	workbook = new HSSFWorkbook(file);
	sheet = workbook.getSheet(sheetName);
	 Iterator<Row> rowIterator  = sheet.iterator();
	 int i=1;
	 System.out.print("SL No");
	 while (rowIterator.hasNext()) {
		 if(i!=1){
			 System.out.print(i-1+".");
			}
		
		  Row nextRow = rowIterator.next();
		  Iterator<Cell> cellIterator = nextRow.cellIterator();
		  while (cellIterator.hasNext()) {
			  Cell cell = cellIterator.next();
			 
			  System.out.print(" 	");
			  System.out.print(cell.getStringCellValue());
			  if(i!=1){
				  cell.setCellType(Cell.CELL_TYPE_BLANK);  
			  }			
			  System.out.print(" 		 		");
		  }
		  System.out.println();
		  i++;
	 }
	 //workbook.close();
	 
	// int colsize=sheet.getColumnWidth(0);
	 file.close();
		 
	
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null; 
	
	
}

}