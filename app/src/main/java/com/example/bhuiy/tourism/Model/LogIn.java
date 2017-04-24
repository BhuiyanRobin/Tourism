package com.example.bhuiy.tourism.Model;

/**
 * Created by bhuiy on 4/25/2017.
 */

public class LogIn {
    private String userName;
    private String password;

    public LogIn(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    public boolean isAlreadyLogIn()
    {
        return true;
    }
    public boolean LogOut()
    {
        return true;
    }
    public String LogedIn(LogIn logIn)
    {
        return "true";
    }

}
