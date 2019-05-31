package com.me.app.tool;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.me.app.model.AoAccountInfo;

public class ExcelCreator {
	public static ByteArrayInputStream AccountsToExcel(List<AoAccountInfo> aoAccounts) {
		String[] COLUMNs = { "No", "Opened date", "Account No","Branch"};

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		Workbook workbook = new XSSFWorkbook();

		try {

			Sheet sheet = workbook.createSheet("Accounts");
			Font headerFont = workbook.createFont();
			
			
			headerFont.setBold(true);
			headerFont.setColor(IndexedColors.BLACK.getIndex());

			CellStyle headerCellStyle = workbook.createCellStyle();
			headerCellStyle.setFont(headerFont);
			headerCellStyle.setAlignment(HorizontalAlignment.RIGHT);
			
			CellStyle contentCellStyle = workbook.createCellStyle();
			contentCellStyle.setAlignment(HorizontalAlignment.RIGHT);
			
			// Row for Header
			Row headerRow = sheet.createRow(0);

			// Header
			for (int col = 0; col < COLUMNs.length; col++) {
				Cell cell = headerRow.createCell(col);
				cell.setCellValue(COLUMNs[col]);
				cell.setCellStyle(headerCellStyle);
			}

			int rowIdx = 1;
			SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy"); 
			for (AoAccountInfo aoAccount : aoAccounts) {
				Row row = sheet.createRow(rowIdx++);
				row.createCell(0).setCellValue(rowIdx-1);
				row.getCell(0).setCellStyle(contentCellStyle);
				
				row.createCell(1).setCellValue(dt.format(aoAccount.getAcOpendate()));
				row.getCell(1).setCellStyle(contentCellStyle);
				
				row.createCell(2).setCellValue(aoAccount.getId().getAcNo());
				row.getCell(2).setCellStyle(contentCellStyle);
				
				row.createCell(3).setCellValue(aoAccount.getAcBrno());
				row.getCell(3).setCellStyle(contentCellStyle);
			}
			
			sheet.autoSizeColumn(1);
			sheet.autoSizeColumn(2);
			sheet.autoSizeColumn(3);
			sheet.autoSizeColumn(4);
			
			
			
			workbook.write(out);
			workbook.close();

		} catch (Exception e) {

		} finally {

		}

		return new ByteArrayInputStream(out.toByteArray());
	}
}
