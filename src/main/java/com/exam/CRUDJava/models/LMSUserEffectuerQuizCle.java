package com.exam.CRUDJava.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class LMSUserEffectuerQuizCle implements Serializable {

    @Column(name = "lms_quiz_partie_id")
    private Integer quizPartieId;

    @Column(name = "lms_user_id")
    private Integer userId;

    public Integer getQuizPartieId() {
        return quizPartieId;
    }

    public void setQuizPartieId(Integer quizPartieId) {
        this.quizPartieId = quizPartieId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
