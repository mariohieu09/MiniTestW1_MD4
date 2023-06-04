package com.example.model;

import java.time.LocalDate;

public class news {
    private int id;
    private String title;
    private String content;
    private LocalDate create_date;

    public news(int id, String title, String content, LocalDate create_date) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.create_date = create_date;
    }

    public news() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getCreate_date() {
        return create_date;
    }

    public void setCreate_date(LocalDate create_date) {
        this.create_date = create_date;
    }
}
