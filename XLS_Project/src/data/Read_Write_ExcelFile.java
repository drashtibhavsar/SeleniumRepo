package data;

public class Read_Write_ExcelFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//apache poi jar is used to read and write from the excel file
		
		Xls_Reader s = new Xls_Reader("D:\\testing\\NikulTest.xlsx");		//created object of xls_reader class
		System.out.println(s.getCellData("Data1", "Name",3));		//get the cell data from the excel sheet using get cell data
		System.out.println(s.getCellData("Data1", 1 ,2));		
		
		String correctEmail = s.getCellData("Data1", 1, 2);		//passed the data of a cell to the string name error collector 
		System.out.println(correctEmail);		//print the string value
		System.out.println(s.getRowCount("Data1"));		//get the number of data of the row using get row count
		System.out.println(s.getColumnCount("Data1"));	//get the number of data of the column data using get column count
		s.setCellData("Data1", "Name", 8, "testing2");		//set the data to the excel file
		s.addColumn("Data1", "drashti");	//add the column using add column 
		
	}

}
