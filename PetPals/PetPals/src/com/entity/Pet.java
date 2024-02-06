package com.entity;

import java.util.ArrayList;
import java.util.List;

class Pet {
    private String Name;
    private int Age;
    private String Breed;

    public Pet(String name, int age, String breed) {
        this.Name = name;
        this.Age = age;
        this.Breed = breed;
    }

    // Getters and setters 
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        this.Breed = breed;
    }

    // ToString() method to provide a string representation of the pet
    public String toString() {
        return "Name: " + Name + ", Age: " + Age + ", Breed: " + Breed;
    }
}
