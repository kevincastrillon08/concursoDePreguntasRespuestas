package com.kevin.castrillon.concursoDePreguntasRespuestas.model;

import java.util.List;

public class Player {

    private long id;
    private String name;
    private int score;
    private List<Reward> rewards;
    private List<Round> rounds;


    public Player(long id, String name, int score, List<Reward> rewards, List<Round> rounds){
        this.id = id;
        this.name = name;
        this.score = score;
        this.rewards = rewards;
        this.rounds = rounds;

    }

    public long getId() {
        return id;
    }

    public void setId(long id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<Reward> getRewards() {
        return rewards;
    }

    public void setRewards(List<Reward> rewards) {
        this.rewards = rewards;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public void setRounds(List<Round> rounds) {
        this.rounds = rounds;
    }
}
