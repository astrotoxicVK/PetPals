package com.entity;

import java.util.ArrayList;
import java.util.List;

public class PetShelter {
    private List<Pet> availablePets;

    public PetShelter() {
        this.availablePets = new ArrayList<>();
    }

    // Add a pet to the list of available pets
    public void addPet(Pet pet) {
        availablePets.add(pet);
    }

    // Remove a pet from the list of available pets
    public void removePet(Pet pet) {
        availablePets.remove(pet);
    }

    // List all available pets in the shelter
    public void listAvailablePets() {
        System.out.println("Available Pets:");
        for (Pet pet : availablePets) {
            System.out.println(pet.toString());
        }
    }
}
