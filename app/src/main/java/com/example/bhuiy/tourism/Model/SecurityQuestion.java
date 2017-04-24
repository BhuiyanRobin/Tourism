package com.example.bhuiy.tourism.Model;

public class SecurityQuestion {

    private int Id;
    private String securityQuestion;

    public SecurityQuestion(int id, String securityQuestion) {
        Id = id;
        this.securityQuestion = securityQuestion;
    }
    public SecurityQuestion()
    {

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

}
