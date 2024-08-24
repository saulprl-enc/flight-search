package com.flightsearch.backend.models;

public class IssueSource {
    private String pointer;
    private String parameter;
    private String example;

    public IssueSource() {
    }

    public IssueSource(String pointer, String parameter, String example) {
        this.pointer = pointer;
        this.parameter = parameter;
        this.example = example;
    }

    public String getPointer() {
        return pointer;
    }

    public void setPointer(String pointer) {
        this.pointer = pointer;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
}
