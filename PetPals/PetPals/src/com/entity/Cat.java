package com.entity;

public class Cat extends Pet {
    private String CatColor;

    public Cat(String name, int age, String breed, String catColor) {
        super(name, age, breed);
        this.CatColor = catColor;
    }

    // Getters and setters for CatColor
    public String getCatColor() {
        return CatColor;
    }

    public void setCatColor(String catColor) {
        this.CatColor = catColor;
    }

}

