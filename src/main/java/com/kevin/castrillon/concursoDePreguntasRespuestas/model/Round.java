package com.kevin.castrillon.concursoDePreguntasRespuestas.model;

import java.util.List;

public class Round {

    private long id;
    private Player player;
    private List<Category> categories;
    private Reward reward;


    public Round() {}

    public Round(long id, Player player, List<Category> categories, Reward reward) {
        this.id = id;

        this.player = player;
        this.categories = categories;
        this.reward = reward;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Reward getReward() {
        return reward;
    }

    public void setReward(Reward reward) {
        this.reward = reward;
    }
}
