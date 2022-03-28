package com.UserRegestrationJUnit;
import java.util.Scanner;

public class UserRegestrationJunit {
	Scanner sc = new Scanner(System.in);

    ValidatingUserRegistrationInformation userInformation = new ValidatingUserRegistrationInformation();

    public String validateFirstName() throws UserRegistrationException {
        System.out.println("Enter the First Name :- ");
        String userFirstName = sc.nextLine();
        return userInformation.validFirstName(userFirstName);
    }


    public String validateLastName() throws UserRegistrationException {
        System.out.println("Enter the Last Name :- ");
        String userLastName = sc.nextLine();
        return userInformation.validLastName(userLastName);
    }

    public String validateMailID() throws UserRegistrationException {
        System.out.println("Enter the Mail ID :- ");
        String userMailID = sc.nextLine();
        return userInformation.validMailID(userMailID);
    }

    public String validateMobileNumber() throws UserRegistrationException {
        System.out.println("Enter the Mobile Number :- ");
        String userMobileNumber = sc.nextLine();
        return userInformation.validMobileNumber(userMobileNumber);
    }

    public String validatePassword() throws UserRegistrationException {
        System.out.println("Enter the Password :- ");
        String userPassword = sc.nextLine();
        return userInformation.validPassword(userPassword);
    }
}