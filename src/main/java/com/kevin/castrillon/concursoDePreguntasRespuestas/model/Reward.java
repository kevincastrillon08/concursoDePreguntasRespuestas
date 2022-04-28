package com.kevin.castrillon.concursoDePreguntasRespuestas.model;

public class Reward {

    private long id;
    private String description;

    public Reward() {}

    public Reward(long id, String description) {
        this.id = id;
        this.description = description;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
