package com.krushit.test;

import com.krushit.entity.DriverLicense;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DriverLicenseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        List<DriverLicense> licenses = new ArrayList<>();

        try {
            System.out.println("How many licenses do you want to add?");
            int numberOfLicenses = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numberOfLicenses; i++) {
                System.out.println("Enter details for license " + (i + 1) + ":");

                System.out.print("State Abbreviation (e.g., DL, MH): ");
                String stateAbbreviation = scanner.nextLine();

                System.out.print("State Code (e.g., 14, 12): ");
                int stateCode = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Issue Date (yyyy-MM-dd): ");
                Date issueDate = dateFormat.parse(scanner.nextLine());

                System.out.print("Expiry Date (yyyy-MM-dd): ");
                Date expiryDate = dateFormat.parse(scanner.nextLine());

                try {
                    DriverLicense license = new DriverLicense(i + 1, stateAbbreviation, stateCode, issueDate, expiryDate);
                    licenses.add(license);
                    System.out.println("License added successfully: " + license);
                } catch (IllegalArgumentException e) {
                    System.err.println("Error adding license: " + e.getMessage());
                }
            }

            System.out.println("\nDisplaying all licenses:");
            for (DriverLicense license : licenses) {
                System.out.println(license);
            }

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
