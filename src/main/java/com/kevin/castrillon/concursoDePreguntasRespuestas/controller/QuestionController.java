package com.kevin.castrillon.concursoDePreguntasRespuestas.controller;

import com.kevin.castrillon.concursoDePreguntasRespuestas.model.Question;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/question")
public class QuestionController {


    @GetMapping("/name")
    String resultName() {
        return "Kevin";
    }
}
