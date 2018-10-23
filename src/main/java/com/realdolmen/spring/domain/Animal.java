package com.realdolmen.spring.domain;

/**
 * Created by cda5732 on 25/03/2015.
 */
public abstract class Animal {
    private String name;

    private Food food;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feed(Food food) {
        this.food = food;
    }
    // TODO Feed the Animal some Food

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return name;
    }
}
