package com.example.realtimewithfirebase;

import java.io.Serializable;
import java.util.Date;

public class JournalItem implements Serializable {
    private  String id;
    private Date date;
    private  String title;
    private String content;
    private int color;

    public JournalItem(){
    }

    public JournalItem(Date date, String title, String content, int color){
        this.date = date;
        this.title = title;
        this.color = color;
        this.content = content;
    }
}
