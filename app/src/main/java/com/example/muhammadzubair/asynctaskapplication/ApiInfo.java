package com.example.muhammadzubair.asynctaskapplication;

import java.io.Serializable;

public class ApiInfo implements Serializable{
    String userId;
    String Id;
    String title;
    String body;
    public ApiInfo(){}
    public ApiInfo(String userId, String id, String title, String body)
    {
        this.userId = userId;
        this.Id = userId;
        this.title = title;
        this.body = body;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
