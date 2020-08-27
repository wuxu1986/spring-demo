package com.csdn.domain;

public class Person {
    private String username;
    private String passwork;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswork() {
        return passwork;
    }

    public void setPasswork(String passwork) {
        this.passwork = passwork;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", passwork='" + passwork + '\'' +
                '}';
    }
}
