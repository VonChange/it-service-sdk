package com.yonghui.it.service.express.model;

public class AddService {
    private String name;
    private String value;
    private String customerId;

    public String getName() {
        return name;
    }

    public AddService setName(String name) {
        this.name = name;
        return this;
    }

    public String getValue() {
        return value;
    }

    public AddService setValue(String value) {
        this.value = value;
        return this;
    }

    public String getCustomerId() {
        return customerId;
    }

    public AddService setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
}
