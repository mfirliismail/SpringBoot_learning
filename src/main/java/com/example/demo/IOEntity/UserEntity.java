package com.example.demo.IOEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="users")
public class UserEntity implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;
    
    @Column(nullable = false)
    private String userId;

    @Column(nullable = false, length=50)
    private String firstName;
    @Column(nullable = false, length=50)
    private String lastName;
    @Column(nullable = false, length=120)
    private String email;
    @Column(nullable = false)
    private String encryptedPassword;
    
    private String emailVerificationToken;
    
    @Column(nullable = false, columnDefinition = "boolean default false")
    private Boolean emailVerificationStatus;

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
    public void setUserId(String userId) {
        this.userId = userId;
    }
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
    public String getUserId() {
        return userId;
    }
}
