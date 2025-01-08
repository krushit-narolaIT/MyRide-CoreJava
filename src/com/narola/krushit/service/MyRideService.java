package com.narola.krushit.service;

import java.util.Scanner;

public class MyRideService {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\nWelcome to MyRide Service");
                System.out.println("1. Register as User");
                System.out.println("2. Register as Driver");
                System.out.println("3. Login as User");
                System.out.println("4. Login as Driver");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                String input = scanner.nextLine();

                if (!input.matches("\\d+")) {
                    System.out.println("Invalid input. Please enter a number between 1 and 5.");
                    continue;
                }

                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                        System.out.println("User registration selected.");
                        UserService userService = new UserService();
                        userService.registerUser();
                        break;

                    case 2:
                        System.out.println("Driver registration is under development...");
                        break;

                    case 3:
                        System.out.println("User login is under development...");
                        break;

                    case 4:
                        System.out.println("Driver login is under development...");
                        break;

                    case 5:
                        System.out.println("Exiting MyRide Service. Thank you!");
                        return; // Exit the program

                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                break; // Exit the loop if an exception occurs
            }
        }

        scanner.close(); // Close the scanner before exiting
    }
}
