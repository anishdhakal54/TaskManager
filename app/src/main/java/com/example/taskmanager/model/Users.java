package com.example.taskmanager.model;

public class Users {
    private String firstName;
    private String lastName;
    private String usename;
    private String password;
    private String image;

    public Users(String firstName, String lastName, String usename, String password, String image) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.usename = usename;
        this.password = password;
        this.image = image;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
