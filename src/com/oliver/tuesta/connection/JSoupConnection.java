package com.oliver.tuesta.connection;

import com.oliver.tuesta.entity.Company;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;


public class JSoupConnection {

    private static final String URL = "https://www.universidadperu.com/empresas/busqueda/";

    public void getData(final String ruc, Company company) {

        try {
            final Document document = Jsoup.connect(URL + ruc).get();

            Elements elements = document.select("li.exp");
            ArrayList<String> phones = new ArrayList<>();

            //phones set to Company
            for (Element p : elements.select("li.phone")) {
                phones.add(p.text().split(" ")[0]);
            }
            company.setTelephones(phones);

            //li phone(s) removed
            elements.select("li.phone").remove();

            for (Element row : document.select("li.exp")) {

                String element = row.select("strong").text();
                Element data = row;
                data.select("strong").remove();

                switch (element) {
                    case "RUC:":
                        company.setRuc(data.text());
                        break;
                    case "Razón Social:":
                        company.setBusinessName(data.text());
                        break;
                    case "Tipo Empresa":
                        company.setCompanyType(data.text());
                        break;
                    case "Condición:":
                        company.setCondition(data.text());
                        break;
                    case "Fecha Inicio Actividades:":
                        company.setStart(data.text());
                        break;
                    case "Actividades Comerciales:":
                        company.setActivities(data.text());
                        break;
                    case "CIIU:":
                        company.setCiiu(data.text());
                        break;
                    case "Dirección Legal:":
                        company.setAddress(data.text());
                        break;
                    case "Distrito / Ciudad:":
                        company.setCity(data.text());
                        break;
                    case "Departamento:":
                        company.setDepartment(data.text());
                        break;

                    case "Gerente General:":
                        company.setCeo(data.text());
                        break;
                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
