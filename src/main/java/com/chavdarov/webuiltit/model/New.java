package com.chavdarov.webuiltit.model;

public class New {

    private String title;
    private String content;

    public New() {

    }

    public New(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
