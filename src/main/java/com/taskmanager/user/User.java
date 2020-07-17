package com.taskmanager.user;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Timestamp;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private static Long uid = 0L;
    private String name;
    private String email;
    private Timestamp createdTime;
    private Timestamp modifiedTime;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public Long getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
