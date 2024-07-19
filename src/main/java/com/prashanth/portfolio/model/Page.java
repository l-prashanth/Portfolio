package com.prashanth.portfolio.model;

import java.util.UUID;

public class Page {
    private String id;
    private String title;
    private String content;

    public Page(String title, String content) {
        this.id = generateUniqueId();
        this.title = title;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    private String generateUniqueId() {
        return UUID.randomUUID().toString();
    }
}