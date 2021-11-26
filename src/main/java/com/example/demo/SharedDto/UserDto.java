package com.example.demo.SharedDto;

import java.io.Serializable;

public class UserDto implements Serializable{
    private static final long serialVersionUID = 1L;
    private long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String encryptedPassword;
    private String emailVerificationToken;
    private Boolean emailVerificationStatus;

    public String getEmail() {
        return email;
    }
    public Boolean getEmailVerificationStatus() {
        return emailVerificationStatus;
    }
    public String getEmailVerificationToken() {
        return emailVerificationToken;
    }
    public String getEncryptedPassword() {
        return encryptedPassword;
    }
    public String getFirstName() {
        return firstName;
    }
    public long getId() {
        return id;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPassword() {
        return password;
    }
    public String getUserId() {
        return userId;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
        this.emailVerificationStatus = emailVerificationStatus;
    }
    public void setEmailVerificationToken(String emailVerificationToken) {
        this.emailVerificationToken = emailVerificationToken;
    }
    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

}
