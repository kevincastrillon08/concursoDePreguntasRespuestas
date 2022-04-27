package com.kevin.castrillon.concursoDePreguntasRespuestas.controller;

import com.kevin.castrillon.concursoDePreguntasRespuestas.model.Question;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/question")
public class QuestionController {


    @GetMapping("/name")
    String resultName() {
        Question question1 = new Question();
        Question question2 = new Question(1L, "pregunta 2", 1);

        question1.getId();
        question1.setText("pregunta 1");

        String textSaved = question1.getText();

        return "Kevin";
    }
}
