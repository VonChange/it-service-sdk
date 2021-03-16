package com.yonghui.it.service.email.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ItReqSendMail {
    private List<String> receiver;
    private String subject;
    private String content;
    private Map<String,String> rscMap;
    private List<String> filePath;


    public ItReqSendMail(String subject,String content,String ... receiver){
        this.subject=subject;
        this.content=content;
        this.receiver= Arrays.asList(receiver);
    }
    public List<String> getReceiver() {
        return receiver;
    }


    public String getSubject() {
        return subject;
    }



    public String getContent() {
        return content;
    }

    public Map<String, String> getRscMap() {
        return rscMap;
    }

    public ItReqSendMail setRscMap(Map<String, String> rscMap) {
        this.rscMap = rscMap;
        return this;
    }

    public List<String> getFilePath() {
        return filePath;
    }

    public ItReqSendMail setFilePath(List<String> filePath) {
        this.filePath = filePath;
        return this;
    }
}
