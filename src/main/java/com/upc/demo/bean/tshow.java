package com.upc.demo.bean;

import java.util.Date;

public class tshow {
   private String  username;
   private String title;
private String date;
private  String msg;
private String path;
private int state;
private String src;

    public tshow(String username, String title, String date, String msg, String path, String src) {
        this.username = username;
        this.title = title;
        this.date = date;
        this.msg = msg;
        this.path = path;
        this.src = src;
    }

    public tshow(String username, String title, String date, String msg, String path, int state, String url) {
        this.username = username;
        this.title = title;
        this.date = date;
        this.msg = msg;
        this.path = path;
        this.state = state;
        this.src = url;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public tshow() {
    }

    public tshow(String username, String title, String date, String msg, String path,int state) {
        this.username = username;
        this.title = title;
        this.date = date;
        this.msg = msg;
        this.path = path;
        this.state=state;
    }
    public tshow(String username, String title, String date, String msg, String path) {
        this.username = username;
        this.title = title;
        this.date = date;
        this.msg = msg;
        this.path = path;

    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public tshow(String username, String title, String date, String msg) {
        this.username = username;
        this.title = title;
        this.date = date;
        this.msg = msg;
    }
}
