package com.twigaRest.twigaRestApp.entity;

public class EmailFromFrontEnd {

    private String csvContent;

    private String EmailName;


    public String getCsvContent() {
        return csvContent;
    }

    public void setCsvContent(String csvContent) {
        this.csvContent = csvContent;
    }

    public String getEmailName() {
        return EmailName;
    }

    public void setEmailName(String emailName) {
        EmailName = emailName;
    }


    public EmailFromFrontEnd(String csvContent, String emailName) {
        this.csvContent = csvContent;
        EmailName = emailName;
    }

    public EmailFromFrontEnd() {
    }
}
