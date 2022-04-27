package com.kevin.castrillon.concursoDePreguntasRespuestas.model;

public class Question {

    //  Atributos
    private Long id;
    private String text;
    private int category;

    // Constructores
    public Question() {}

    public Question(Long id, String text, int category) {
        this.id = id;
        this.text = text;
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

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
}