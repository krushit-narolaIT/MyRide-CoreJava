package com.narola.krushit.test;

import com.narola.krushit.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User_Test {
    private List<User> userList;

    public User_Test() {
        userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
        System.out.println("User added successfully: " + user);
    }

    public void removeUserById(int id) {
        boolean userFound = false;

        for (User user : userList) {
            if (user.getId() == id) {
                userList.remove(user);
                System.out.println("User removed successfully: " + user);
                userFound = true;
                break;
            }
        }

        if (!userFound) {
            System.out.println("No user found with ID: " + id);
        }
    }

    public void displayUsers() {
        if (userList.isEmpty()) {
            System.out.println("No users available.");
        } else {
            System.out.println("List of Users:");
            for (User user : userList) {
                System.out.println(user);
            }
        }
    }

    public static void main(String[] args) {
        User_Test userTest = new User_Test();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add User");
            System.out.println("2. Remove User");
            System.out.println("3. Display Users");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter User ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter Password: ");
                    String pass = scanner.nextLine();

                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();

                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();

                    System.out.print("Enter User Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter User Phone: ");
                    String phone = scanner.nextLine();

                    User newUser = new User(id, pass, firstName, lastName, email, phone);
                    userTest.addUser(newUser);
                    break;

                case 2:
                    System.out.print("Enter User ID to Remove: ");
                    int userIdToRemove = scanner.nextInt();
                    userTest.removeUserById(userIdToRemove);
                    break;

                case 3:
                    userTest.displayUsers();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
