package com.exam.CRUDJava.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class LMSQuizPartie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String question;
    @ManyToOne
    private LMSQuiz quiz;
    @Column(columnDefinition = "TEXT")
    private String choix;
    private  Integer tempsPourRepondre;
    private Integer ordre;

    public LMSQuiz getQuiz() {
        return quiz;
    }

    public void setQuiz(LMSQuiz quiz) {
        this.quiz = quiz;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getChoix() {
        return choix;
    }

    public void setChoix(String choix) {
        this.choix = choix;
    }

    public Integer getTempsPourRepondre() {
        return tempsPourRepondre;
    }

    public void setTempsPourRepondre(Integer tempsPourRepondre) {
        this.tempsPourRepondre = tempsPourRepondre;
    }

    public Integer getOrdre() {
        return ordre;
    }

    public void setOrdre(Integer ordre) {
        this.ordre = ordre;
    }
}