package com.example.recycleview;

public class CellData {

    private  String title = "title";
    private String content = "content";

    public CellData(String title,String content){
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
