package com.kevin.castrillon.concursoDePreguntasRespuestas.model;

import java.util.List;

public class Category {

    private long id;
    private String text;
    private int level;
    private List<Question> questions;

    public Category ()  {}

    public Category (long id, String text, int level, List<Question> questions) {
        this.id = id;
        this.text = text;
        this.level = level;
        this.questions = questions;
    }

    public long getId () {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText() {
        this.text = text;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
