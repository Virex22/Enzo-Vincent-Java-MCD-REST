package com.exam.CRUDJava.controllers;

import com.exam.CRUDJava.dao.LMSQuizDAO;
import com.exam.CRUDJava.models.LMSQuiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class QuizController {

    @Autowired
    private LMSQuizDAO quizDao;

    @GetMapping("/quiz")
    public List<LMSQuiz> getListQuiz() {

        List<LMSQuiz> listeQuiz = quizDao.findAll();

        return listeQuiz;
    }

    @GetMapping("/quiz/{id}")
    public LMSQuiz getQuiz(@PathVariable int id){

        Optional<LMSQuiz> quiz = quizDao.findById(id);

        return quiz.orElse(null);
    }

    @PostMapping("/quiz")
    public boolean createQuiz(@RequestBody LMSQuiz quiz){
        quizDao.save(quiz);

        return true;
    }

    @DeleteMapping("/quiz/{id}")
    public ResponseEntity<LMSQuiz> deleteQuiz(@PathVariable int id) {

        Optional<LMSQuiz> quizAsupprimer = quizDao.findById(id);

        if(quizAsupprimer.isPresent()) {
            quizDao.deleteById(id);
            return ResponseEntity.ok(quizAsupprimer.get());
        }

        return ResponseEntity.notFound().build();
    }

}
