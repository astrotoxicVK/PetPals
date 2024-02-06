package com.dao;

import java.sql.*;
import java.util.Scanner;

import com.util.DBConn;
import com.util.DBconn;

public class PetImpl implements IAdoptable {
    private Connection connection;

   
    private void recordDonation(String donorName, double donationAmount) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO donations (donor_name, amount) VALUES (?, ?)");
            preparedStatement.setString(1, donorName);
            preparedStatement.setDouble(2, donationAmount);
            preparedStatement.executeUpdate();
            System.out.println("Donation recorded successfully.");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    private void registerParticipant(String participantName) {
        try {
        	connection = DBConn.getDBConn();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO participants (ParticipantName) VALUES (?)");
            preparedStatement.setString(1, participantName);
            preparedStatement.executeUpdate();
            System.out.println("You have successfully registered for the adoption event.");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    private void displayPetListings() {
        try {
        	connection = DBconn.getDBConn();
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

    @Override
    public void adopt() {
        // Implement adopt method
    }
}
