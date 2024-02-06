package com.controller;

import java.sql.*;
import java.util.Scanner;

public class PetController {
	public static void startPet() {
    Scanner scanner = new Scanner(System.in);
    String choice;
	do {
        System.out.println("Choose an option:");
        System.out.println("1. Display Pet Listings");
        System.out.println("2. Record Donation");
        System.out.println("3. Adoption Event Management");
        System.out.println("4. Exit");
        choice = scanner.nextLine();

        switch (choice) {
            case "1":
                displayPetListings();
                break;
            case "2":
                recordDonation();
                break;
            case "3":
                manageAdoptionEvent();
                break;
            case "4":
                System.out.println("Exiting program...");
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
                break;
        }
    } while (!choice.equals("4"));

    scanner.close();
	}

private static void displayPetListings() {
    String url = "jdbc:mysql://localhost:3306/petpals";
    String username = "root";
    String password = "1234";

    try (Connection connection = DriverManager.getConnection(url, username, password)) {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM pets");

        System.out.println("Available Pets:");
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            String breed = resultSet.getString("breed");
            System.out.println("Name: " + name + ", Age: " + age + ", Breed: " + breed);
        }
    } catch (SQLException e) {
        System.out.println("Database connection error: " + e.getMessage());
    }
}

private static void recordDonation() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter donoation ID:");
    String donoationID = scanner.nextLine();
    System.out.println("Enter donor name:");
    String donorName = scanner.nextLine();
    System.out.println("Enter donation amount:");
    double donationAmount = scanner.nextDouble();

    String url = "jdbc:mysql://localhost:3306/petpals";
    String username = "root";
    String password = "1234";

    try (Connection connection = DriverManager.getConnection(url, username, password)) {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO donations (DonationID, DonorName, DonationAmount) VALUES (?, ?, ?)");
        preparedStatement.setString(1, donoationID);
        preparedStatement.setString(2, donorName);
        preparedStatement.setDouble(3, donationAmount);
        preparedStatement.executeUpdate();
        System.out.println("Donation recorded successfully.");
    } catch (SQLException e) {
        System.out.println("Database error: " + e.getMessage());
    }
}

private static void manageAdoptionEvent() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name:");
    String participantName = scanner.nextLine();

    String url = "jdbc:mysql://localhost:3306/petpals";
    String username = "root";
    String password = "1234";

    try (Connection connection = DriverManager.getConnection(url, username, password)) {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO participants ParticipantName) VALUES (?)");
        preparedStatement.setString(1, participantName);
        preparedStatement.executeUpdate();
        System.out.println("You have successfully registered for the adoption event.");
    } catch (SQLException e) {
        System.out.println("Database error: " + e.getMessage());
    }
}
}



