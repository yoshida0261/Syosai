package com.starcompany.syosai.model;

import java.sql.Date;

public class Book {

    private long id;
    private String title;
    private String author;
    private Date 発売日;
    private Date 購入日;
    private Isdn ISDN;
    private int pictId;

    public long getId()
    {
        return  id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return  title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getAuthor()
    {
        return  this.author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public int getPictId()
    {
        return  pictId;
    }

    public void setPictId(int pictId)
    {
        this.pictId = pictId;
    }

}
