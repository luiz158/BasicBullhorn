package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.time.LocalDate;

/**
 * Message object should have at least:
 *-------------------------------------
 * id
 * title
 * content
 * postedDate
 * postedBy
 */

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    @Size(min = 4)
    private String title;

    @NonNull
    @Size(min = 10)
    private String content;

//    @NonNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate postedDate;

    @NonNull
    @Size(min = 4)
    private String postedBy;

    @NonNull
    @Size(min = 4)
    private String picturePath;

    public Message() {
        postedDate = LocalDate.now();
    }

    public Message(@Size(min = 4) String title,
                   @Size(min = 10) String content,
                   LocalDate postedDate,
                   @Size(min = 4) String postedBy,
                   @Size(min = 4) String picturePath) {
        this.title = title;
        this.content = content;
        this.postedDate = postedDate;
        this.postedBy = postedBy;
        this.picturePath = picturePath;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(LocalDate postedDate) {
        this.postedDate = postedDate;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }
}
