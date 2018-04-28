package com.lyk.wechart.domain;

import javax.persistence.Id;

public class Paper {
    @Id
    private long id;
    private String name;
    private String content;

    public Paper(long id,String name,String content){
        this.id = id;
        this.content = content;
        this.name =name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
