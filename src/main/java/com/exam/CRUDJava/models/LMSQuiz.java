package com.exam.CRUDJava.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
@Entity
@EntityListeners(AuditingEntityListener.class)
public class LMSQuiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition ="TEXT")
    private String description;
    private Boolean published;
    private Date dateCreation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Integer getTempsQuiz() {
        return tempsQuiz;
    }

    public void setTempsQuiz(Integer tempsQuiz) {
        this.tempsQuiz = tempsQuiz;
    }

    private Integer tempsQuiz;
}
