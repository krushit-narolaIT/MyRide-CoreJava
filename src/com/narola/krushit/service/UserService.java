package com.narola.krushit.service;

import com.narola.krushit.dao.UserDAOImpl;
import com.narola.krushit.entity.User;

import java.util.Scanner;

public class UserService {

    public void registerUser() {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter User First Name: ");
            String userFirstName = scanner.nextLine();

            System.out.println("Enter User Last Name: ");
            String userLastName = scanner.nextLine();

            System.out.println("Enter User Password: ");
            String userPass = scanner.nextLine();

            System.out.println("Enter User Email: ");
            String userEmail = scanner.nextLine();

            System.out.println("Enter User Phone: ");
            String userPhone = scanner.nextLine();

            User user = new User();
            user.setPass(userPass);
            user.setUserFirstName(userFirstName);
            user.setUserLastName(userLastName);
            user.setUserEmail(userEmail);
            user.setUserPhone(userPhone);

            UserDAOImpl userDAO = new UserDAOImpl();
            boolean isRegistered = userDAO.registerUser(user);

            if (isRegistered) {
                System.out.println("**************************************");
                System.out.println("*  User Registered Successfully...!!! ");
                System.out.println("**************************************");
            } else {
                System.out.println("**************************************");
                System.out.println("*     Oops..!!, Some error occur     *");
                System.out.println("**************************************");
            }

        } catch (Exception e) {
            System.out.println("Error occurred while registering the user..!!");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
