package com.oliver.tuesta.entity;

import java.util.ArrayList;

public class Company {

    private String ruc;
    private String businessName;
    private String web;
    private String companyType;
    private String condition;
    private String start;
    private String activities;
    private String ciiu;
    private String address;
    private String city;
    private String department;
    private ArrayList<String> telephones;
    private String ceo;

    public Company (){ }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc!=null? ruc : "Not found";
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName!=null? businessName : "Not found";
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web!=null? web : "Not found";
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType!=null? companyType : "Not found";
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition!=null? condition : "Not found";
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start!=null? start : "Not found";
    }

    public String getCiiu() {
        return ciiu;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }

    public void setCiiu(String ciiu) {
        this.ciiu = ciiu!=null? ciiu : "Not found";
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address!=null? address : "Not found";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city!=null? city : "Not found";
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department!=null? department : "Not found";
    }

    public ArrayList<String> getTelephones() {
        return telephones;
    }

    public void setTelephones(ArrayList telephones) {
        this.telephones = telephones;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo!=null? ceo : "Not found";
    }
}
