package com.UserRegestrationJUnit;

public class UserRegistrationRegexPattern {

    public static void main(String[] args) {

    	UserRegestrationJunit userEntry = new UserRegestrationJunit();

        System.out.println(userEntry.validateFirstName());
        System.out.println(userEntry.validateLastName());
        System.out.println(userEntry.validateMailID());
        System.out.println(userEntry.validateMobileNumber());
        System.out.println(userEntry.validatePassword());
    }
}