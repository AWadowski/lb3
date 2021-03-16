package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Account {
    private String login,password,firstName,lastName;
    public LocalDate lastLogin;
    private static ArrayList<Account> accounts=new ArrayList<>();
    public Account(String login, String password, String firstName, String lastName) {
        for(Account acc:accounts)
        if(checkLogin(login)){
            login=login+"1";
        }
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastLogin = LocalDate.of(1970,1,1);
        accounts.add(this);
    }
    public Account(Account account){
        this(account.login,account.password,account.firstName,account.lastName);
        this.lastLogin=account.lastLogin;
    }
   public boolean authorize(String login, String password){
        if(login.equals(login)&& password.equals(password)){
            this.lastLogin=LocalDate.now();
            return true;
        }
        else return false;
    }

    public String getLogin() {
        return login;
    }

    public String getLastName() {
        return lastName;
    }

    public final String toString(){
        return firstName+" "+lastName;
    }
    private boolean checkLogin(String login){
        for(Account acc:accounts){
        if(acc.login.equals(login))
                return true;
    }
        return false;}
}
