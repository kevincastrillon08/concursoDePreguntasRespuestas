package com.kevin.castrillon.concursoDePreguntasRespuestas.model;

public class Answer {

    private Long id;
    private String text;
    private boolean correct;
    private Question question;


    public Answer() {}

    public Answer(Long id, String text, boolean correct, Question question) {
        this.id = id;
        this.text = text;
        this.correct = correct;
        this.question = question;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String text() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean getCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
