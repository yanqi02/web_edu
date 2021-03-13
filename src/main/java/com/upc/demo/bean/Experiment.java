package com.upc.demo.bean;

public class Experiment {
    private  int id;
    private  String title;
    private  String  context;
    private  String date;
    private  String  author;
private  int state;
private String url;
private  int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
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

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Experiment() {
    }

    public Experiment(int id, String title, String context, String date, String author, int state) {
        this.id = id;
        this.title = title;
        this.context = context;
        this.date = date;
        this.author = author;
        this.state = state;
    }

    public Experiment(String title, String context, String date, String author) {
        this.title = title;
        this.context = context;
        this.date = date;
        this.author = author;
    }
}
