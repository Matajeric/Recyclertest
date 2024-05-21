package com.example.recyclerviewtest;

public class Items {
    private  String title;
    private String date;

    public  Items(String title, String date){
        this.title = title;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Items{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}