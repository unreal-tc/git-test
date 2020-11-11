package com.unreal.git.test;

/**
 * @author tangchao
 * @date 2020/11/11
 */
public class User {
    private int id;
    private String name;
    private int old;
    private String mobile;

    public User(int id, String name, int old, String mobile) {
        this.id = id;
        this.name = name;
        this.old = old;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
