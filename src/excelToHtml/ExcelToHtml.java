package excelToHtml;

import java.io.File;

public class ExcelToHtml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file=new File("d:/2019104»ÆìÏº¼.xls");
		try {
			String str=ExcelTransformHtml.getExcelInfo(file);
			System.out.println("test");
			System.out.println(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
