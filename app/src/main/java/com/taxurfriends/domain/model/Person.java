package com.taxurfriends.domain.model;

public class Person {
    private String id;
    private String userId;
    private String name;
    private String info;

    public Person(String id, String userId, String name, String info) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.info = info;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
