package com.oliver.tuesta;

import com.oliver.tuesta.connection.ExcelConnection;
import com.oliver.tuesta.connection.JSoupConnection;
import com.oliver.tuesta.entity.Company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<Company> companies = new ArrayList<>();
        ArrayList<String> rucs = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String input = "";
        do {
            input = sc.nextLine();
            if (input.equals("-1")){
                break;
            }
            rucs.add(input);

        } while (true);

        System.out.println("downloading...");

        for (String ruc : rucs){
            Company com = new Company(ruc);
            JSoupConnection jSoup = new JSoupConnection();
            jSoup.getData(com);
            companies.add(com);
        }

        System.out.println("download complete!!");

        ExcelConnection excelConnection = new ExcelConnection();
        excelConnection.writeData(companies);

    }
}
