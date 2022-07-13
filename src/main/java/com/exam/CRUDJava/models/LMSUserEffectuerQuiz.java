package com.exam.CRUDJava.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@IdClass(LMSUserEffectuerQuizCle.class)
@EntityListeners(AuditingEntityListener.class)
public class LMSUserEffectuerQuiz {
    @Id
    private Integer quizPartieId;
    @Id
    private Integer userId;
    @MapsId("lms_quiz_partie_id")
    @ManyToOne
    @JoinColumn(name = "lms_quiz_partie_id")
    private LMSQuizPartie quizpart;

    @MapsId("lms_user_id")
    @ManyToOne
    @JoinColumn(name = "lms_user_id")
    private UsrUsr user;
    private Integer tempsPassez;
    private Integer score;

    public LMSQuizPartie getQuizpart() {
        return quizpart;
    }

    public void setQuizpart(LMSQuizPartie quizpart) {
        this.quizpart = quizpart;
    }

    public UsrUsr getUser() {
        return user;
    }

    public void setUser(UsrUsr user) {
        this.user = user;
    }

    public Integer getTempsPassez() {
        return tempsPassez;
    }

    public void setTempsPassez(Integer tempsPassez) {
        this.tempsPassez = tempsPassez;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getDateEffectuer() {
        return dateEffectuer;
    }

    public void setDateEffectuer(Date dateEffectuer) {
        this.dateEffectuer = dateEffectuer;
    }

    private Date dateEffectuer;
}
