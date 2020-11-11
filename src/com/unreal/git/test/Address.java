package com.unreal.git.test;

/**
 * @author tangchao
 * @date 2020/11/11
 */
public class Address {
    private int id;
    private int UserId;
    private String content;

    public Address(int id, int userId, String content) {
        this.id = id;
        UserId = userId;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", UserId=" + UserId +
                ", content='" + content + '\'' +
                '}';
    }

}
