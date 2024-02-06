package com.entity;

class Dog extends Pet {
    private String DogBreed;

    public Dog(String name, int age, String breed, String dogBreed) {
        super(name, age, breed);
        this.DogBreed = dogBreed;
    }

    // Getters and setters for DogBreed
    public String getDogBreed() {
        return DogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.DogBreed = dogBreed;
    }
}
