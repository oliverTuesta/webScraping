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

    public Company(String ruc) {
        this.ruc = ruc;
    }

    public String getRuc() {
        return ruc;
    }

    public String getBusinessName() {
        return businessName == null ? "not found" : businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName != null ? businessName : "Not found";
    }

    public String getWeb() {
        return web == null ? "not found" : web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getCompanyType() {
        return companyType == null ? "not found" : companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCondition() {
        return condition == null ? "not found" : condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getStart() {
        return start == null ? "not found" : start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getCiiu() {
        return ciiu == null ? "not found" : ciiu;
    }

    public String getActivities() {
        return activities == null ? "not found" : activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }

    public void setCiiu(String ciiu) {
        this.ciiu = ciiu;
    }

    public String getAddress() {
        return address == null ? "not found" : address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city == null ? "not found" : city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDepartment() {
        return department == null ? "not found" : department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public ArrayList<String> getTelephones() {
        return telephones;
    }

    public void setTelephones(ArrayList telephones) {
        this.telephones = telephones;
    }

    public String getCeo() {
        return ceo == null ? "not found" : ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }
}
