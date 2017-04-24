package com.example.bhuiy.tourism.Model;

import java.util.ArrayList;

/**
 * Created by bhuiy on 4/25/2017.
 */

public class Register {
    private String fullName;
    private String userName;
    private String password;
    private String emergencyConNo;
    private String address;
    private int SecurityQuestionId;
    private int RoleId;

    public Register(String fullName, String userName, String password, String emergencyConNo, String address, int securityQuestionId, int roleId) {
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.emergencyConNo = emergencyConNo;
        this.address = address;
        SecurityQuestionId = securityQuestionId;
        RoleId = roleId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmergencyConNo() {
        return emergencyConNo;
    }

    public void setEmergencyConNo(String emergencyConNo) {
        this.emergencyConNo = emergencyConNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSecurityQuestionId() {
        return SecurityQuestionId;
    }

    public void setSecurityQuestionId(int securityQuestionId) {
        SecurityQuestionId = securityQuestionId;
    }

    public int getRoleId() {
        return RoleId;
    }

    public void setRoleId(int roleId) {
        RoleId = roleId;
    }

    public ArrayList<Register> GetAllRegisterdAcc()
    {
        return new ArrayList<Register>();
    }
}
