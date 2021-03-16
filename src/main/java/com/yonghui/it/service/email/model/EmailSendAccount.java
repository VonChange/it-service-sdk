package com.yonghui.it.service.email.model;

public class EmailSendAccount {
    private String account;
    private String password;
    public EmailSendAccount(String account,String password){
        this.account=account;
        this.password=password;
    }
    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }
}
