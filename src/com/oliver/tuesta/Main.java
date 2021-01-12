package com.oliver.tuesta;

import com.oliver.tuesta.connection.JSoupConnection;
import com.oliver.tuesta.entity.Company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Company com = new Company();
        JSoupConnection jSoup = new JSoupConnection();
        jSoup.getData("20523346327",com);

        System.out.println(com.getBusinessName());
        System.out.println(com.getRuc());
        ArrayList<String> t = com.getTelephones();
        System.out.println(t.get(0));

    }
}
