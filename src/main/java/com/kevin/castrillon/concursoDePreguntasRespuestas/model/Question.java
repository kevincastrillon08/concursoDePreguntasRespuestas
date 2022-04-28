package com.kevin.castrillon.concursoDePreguntasRespuestas.model;

import java.util.List;

public class Question {

    //  Atributos
    private Long id;
    private String text;
    private List<Answer> answers;
    private Category category;

    // Constructores
    public Question() {}

    public Question(Long id, String text, List<Answer> answers) {
        this.id = id;
        this.text = text;
        this.answers = answers;
        this.category = category;


    }

    //Metodos GET y SET
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}