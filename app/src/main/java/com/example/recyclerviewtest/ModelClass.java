package com.example.recyclerviewtest;

public class ModelClass {

    private String name;
    private int avatar;

    public ModelClass(String name1, int man) {
        this.avatar = man;
        this.name = name1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}
