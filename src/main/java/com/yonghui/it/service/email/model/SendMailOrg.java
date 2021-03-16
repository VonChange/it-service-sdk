package com.yonghui.it.service.email.model;

import java.util.List;
import java.util.Map;

public class SendMailOrg {
    private String account;
    private String password;
    private List<String> to;
    private String subject;
    private String content;
    private List<String> filePath;
    private Map<String,String> rscMap;


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getTo() {
        return to;
    }

    public void setTo(List<String> to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getFilePath() {
        return filePath;
    }

    public void setFilePath(List<String> filePath) {
        this.filePath = filePath;
    }

    public Map<String, String> getRscMap() {
        return rscMap;
    }

    public void setRscMap(Map<String, String> rscMap) {
        this.rscMap = rscMap;
    }
}
