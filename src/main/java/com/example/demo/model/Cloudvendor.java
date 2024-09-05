package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cloudvendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Userid;
    private String Username;
    private String BookName;
    private String Author;

    public String getUserid() {
        return Userid;
    }

    public void setUserid(String userid) {
        Userid = userid;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public Cloudvendor() {
    }

    public Cloudvendor(String userid, String username, String bookName, String author) {
        this.Userid = userid;
        this.Username = username;
        this.BookName = bookName;
        this.Author = author;
    }

}
