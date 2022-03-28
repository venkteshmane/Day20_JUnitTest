package TestUserRegestrationJUnit;

import org.junit.jupiter.api.Test;

import com.UserRegestrationJUnit.UserRegistrationException;
import com.UserRegestrationJUnit.ValidatingUserRegistrationInformation;

import org.junit.Assert;

class UserRegistrationJunitTest {
	String invalidResultExpected, invalidResultActual;

    ValidatingUserRegistrationInformation validUserInfo = new ValidatingUserRegistrationInformation();

    @Test
    public void validFirstName() throws UserRegistrationException {
        try {
            invalidResultExpected = "Happy:User Entry Validated Successfully";
            invalidResultActual = validUserInfo.validFirstName("Datta");
            Assert.assertEquals(invalidResultExpected, invalidResultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_FIRST_NAME, e.type);
        }
    }


    @Test
    public void invalidFirstName() throws UserRegistrationException {
        try {
            invalidResultExpected = "Sad:User Entry Validation Failed";
            invalidResultActual = validUserInfo.validFirstName("datta");
            Assert.assertEquals(invalidResultExpected, invalidResultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_FIRST_NAME, e.type);
        }
    }

    @Test
    public void lastNameValid() throws  UserRegistrationException {
        try {
            invalidResultExpected = "Happy:User Entry Validated Successfully";
            invalidResultActual = validUserInfo.validLastName("Bhure");
            Assert.assertEquals(invalidResultExpected, invalidResultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_FIRST_NAME, e.type);
        }
    }

    @Test
    public void lastNameInValid() throws UserRegistrationException {
        try {
            invalidResultExpected = "Sad:User Entry Validation Failed";
            invalidResultActual = validUserInfo.validLastName("bhure");
            Assert.assertEquals(invalidResultExpected, invalidResultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_FIRST_NAME, e.type);
        }
    }

    @Test
    public void emailValid() throws  UserRegistrationException {
        try {

            invalidResultExpected = "Happy:User Entry Validated Successfully";
            invalidResultActual = validUserInfo.validMailID("abc@yahoo.com");
            String validResultActual1 = validUserInfo.validMailID("abc-100@yahoo.com");
            String validResultActual2 = validUserInfo.validMailID("abc.100@yahoo.com");
            String validResultActual3 = validUserInfo.validMailID("abc111@abc.com");
            String validResultActual4 = validUserInfo.validMailID("abc-100@abc.net");
            String validResultActual5 = validUserInfo.validMailID("abc.100@abc.com.au");
            String validResultActual6 = validUserInfo.validMailID("abc@1.com");
            String validResultActual7 = validUserInfo.validMailID("abc@gmail.com.com");
            String validResultActual8 = validUserInfo.validMailID("abc+100@gmail.com");

            Assert.assertEquals(invalidResultExpected, invalidResultActual);
            Assert.assertEquals(invalidResultExpected, validResultActual1);
            Assert.assertEquals(invalidResultExpected, validResultActual2);
            Assert.assertEquals(invalidResultExpected, validResultActual3);
            Assert.assertEquals(invalidResultExpected, validResultActual4);
            Assert.assertEquals(invalidResultExpected, validResultActual5);
            Assert.assertEquals(invalidResultExpected, validResultActual6);
            Assert.assertEquals(invalidResultExpected, validResultActual7);
            Assert.assertEquals(invalidResultExpected, validResultActual8);

        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_MAIL_ID, e.type);
        }
    }

    @Test
    public void emailInValid()  {
        try {
            invalidResultExpected = "Sad:User Entry Validation Failed";
            String invalidResultActual = validUserInfo.validMailID("abc");
            String invalidResultActual1 = validUserInfo.validMailID("abc@.com.my");
            String invalidResultActual2 = validUserInfo.validMailID("abc123@gmail.a");
            String invalidResultActual3 = validUserInfo.validMailID("abc123@.com");
            String invalidResultActual4 = validUserInfo.validMailID("abc123@.com.com");
            String invalidResultActual5 = validUserInfo.validMailID(".abc@abc.com");
            String invalidResultActual6 = validUserInfo.validMailID("abc()*@gmail.com");
            String invalidResultActual7 = validUserInfo.validMailID("abc@%*.com");
            String invalidResultActual8 = validUserInfo.validMailID("abc..2002@gmail.com");
            String invalidResultActual9 = validUserInfo.validMailID("abc.@gmail.com");
            String invalidResultActual10 = validUserInfo.validMailID("abc@abc@gmail.com");
            String invalidResultActual11 = validUserInfo.validMailID("abc@gmail.com.1a");
            String invalidResultActual12 = validUserInfo.validMailID("abc@gmail.com.aa.au");


            Assert.assertEquals(invalidResultExpected, invalidResultActual);
            Assert.assertEquals(invalidResultExpected, invalidResultActual1);
            Assert.assertEquals(invalidResultExpected, invalidResultActual2);
            Assert.assertEquals(invalidResultExpected, invalidResultActual3);
            Assert.assertEquals(invalidResultExpected, invalidResultActual4);
            Assert.assertEquals(invalidResultExpected, invalidResultActual5);
            Assert.assertEquals(invalidResultExpected, invalidResultActual6);
            Assert.assertEquals(invalidResultExpected, invalidResultActual7);
            Assert.assertEquals(invalidResultExpected, invalidResultActual8);
            Assert.assertEquals(invalidResultExpected, invalidResultActual9);
            Assert.assertEquals(invalidResultExpected, invalidResultActual10);
            Assert.assertEquals(invalidResultExpected, invalidResultActual11);
            Assert.assertEquals(invalidResultExpected, invalidResultActual12);


        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_MAIL_ID, e.type);
        }
    }

    @Test
    public void validMobileNum() throws  UserRegistrationException {
        try {
            invalidResultExpected = "Happy:User Entry Validated Successfully";
            invalidResultActual = validUserInfo.validMobileNumber("91-9923064024");
            Assert.assertEquals(invalidResultExpected, invalidResultActual);
        } catch ( UserRegistrationException e) {

            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_MOBILE_NUMBER, e.type);
        }
    }

    @Test
    public void invalidMobileNum() throws UserRegistrationException {
        try {
            invalidResultExpected = "Sad:User Entry Validation Failed";
            invalidResultActual = validUserInfo.validMobileNumber("9923064024");
            Assert.assertEquals(invalidResultExpected, invalidResultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_MOBILE_NUMBER, e.type);
        }
    }

    @Test
    public void validPassword() throws UserRegistrationException {
        try {
            invalidResultExpected = "Happy:User Entry Validated Successfully";
            invalidResultActual = validUserInfo.validPassword("bd1gB&@z");
            Assert.assertEquals(invalidResultExpected, invalidResultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_PASSWORD, e.type);
        }
    }

    @Test
    public void invalidPassword() throws  UserRegistrationException {
        try {
            invalidResultExpected = "Sad:User Entry Validation Failed";
            invalidResultActual = validUserInfo.validPassword("bd1gBxzy");
            Assert.assertEquals(invalidResultExpected, invalidResultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_PASSWORD, e.type);
        }
    }
}