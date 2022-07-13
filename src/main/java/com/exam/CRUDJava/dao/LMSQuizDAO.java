package com.exam.CRUDJava.dao;

import com.exam.CRUDJava.models.LMSQuiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LMSQuizDAO extends JpaRepository<LMSQuiz,Integer> {
}
