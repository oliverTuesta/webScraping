package com.oliver.tuesta.connection;

import com.oliver.tuesta.entity.Company;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelConnection {

    public void writeData(ArrayList<Company> companies) throws IOException {

        //create file
        String fileName = System.getProperty("user.dir") + "/result.xlsx";
        File file = new File(fileName);

        if (!file.exists()){
            file.createNewFile();
        }

        Workbook workbook = insertData(companies);

        //writing the created excel
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            workbook.write(outputStream);
            outputStream.close();
            System.out.println("Excel file is writed success");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private XSSFWorkbook insertData(ArrayList<Company> companies){

        //create a Workbook
        XSSFWorkbook workbook = new XSSFWorkbook();
        //create a spreadsheet
        XSSFSheet sheet = workbook.createSheet();

        //create a ROW object
        XSSFRow row = sheet.createRow(0);

        //create cells
        XSSFCell column0 = row.createCell(0);
        XSSFCell column1 = row.createCell(1);
        XSSFCell column2 = row.createCell(2);
        XSSFCell column3 = row.createCell(3);
        XSSFCell column4 = row.createCell(4);
        XSSFCell column5 = row.createCell(5);
        XSSFCell column6 = row.createCell(6);
        XSSFCell column7 = row.createCell(7);
        XSSFCell column8 = row.createCell(8);
        XSSFCell column9 = row.createCell(9);
        XSSFCell column10 = row.createCell(10);
        XSSFCell column11 = row.createCell(11);

        column0.setCellValue("RUC");
        column1.setCellValue("Razon Social");
        column2.setCellValue("Tipo Empresa");
        column3.setCellValue("Condicion");
        column4.setCellValue("Fecha Inicio Actividades");
        column5.setCellValue("Actividades Comerciales");
        column6.setCellValue("CIIU");
        column7.setCellValue("Direccion Legar");
        column8.setCellValue("Distrito / Ciudad");
        column9.setCellValue("Departamento");
        column10.setCellValue("Telefonos");
        column11.setCellValue("Gerente General");

        for (int i = 0; i < companies.size(); i++){
            row = sheet.createRow(i+1);
            column0 = row.createCell(0);
            column1 = row.createCell(1);
            column2 = row.createCell(2);
            column3 = row.createCell(3);
            column4 = row.createCell(4);
            column5 = row.createCell(5);
            column6 = row.createCell(6);
            column7 = row.createCell(7);
            column8 = row.createCell(8);
            column9 = row.createCell(9);
            column10 = row.createCell(10);
            column11 = row.createCell(11);

            column0.setCellValue(companies.get(i).getRuc());
            column1.setCellValue(companies.get(i).getBusinessName());
            column2.setCellValue(companies.get(i).getCompanyType());
            column3.setCellValue(companies.get(i).getCondition());
            column4.setCellValue(companies.get(i).getStart());
            column5.setCellValue(companies.get(i).getActivities());
            column6.setCellValue(companies.get(i).getCiiu());
            column7.setCellValue(companies.get(i).getAddress());
            column8.setCellValue(companies.get(i).getCity());
            column9.setCellValue(companies.get(i).getDepartment());
            String phones = "";
            for (String phone : companies.get(i).getTelephones()){
                phones += phone+" ,";
            }
            column10.setCellValue(phones);
            column11.setCellValue(companies.get(i).getCeo());
        }

        return workbook;
    }

}
