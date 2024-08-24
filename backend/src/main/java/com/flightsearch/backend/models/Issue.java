package com.flightsearch.backend.models;

public class Issue {
    private Integer status;
    private Integer code;
    private String title;
    private String detail;
    private IssueSource source;

    public Issue() {
    }

    public Issue(Integer status, Integer code, String title, String detail, IssueSource source) {
        this.status = status;
        this.code = code;
        this.title = title;
        this.detail = detail;
        this.source = source;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public IssueSource getSource() {
        return source;
    }

    public void setSource(IssueSource source) {
        this.source = source;
    }
}
