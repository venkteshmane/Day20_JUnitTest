package TestUserRegestrationJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.UserRegestrationJUnit.UserRegistrationException;
import com.UserRegestrationJUnit.ValidatingUserRegistrationInformation;

import org.junit.Assert;

class UserRegistrationJunitTest {
	String resultExpected, resultActual;

    ValidatingUserRegistrationInformation validUseInfo = new ValidatingUserRegistrationInformation();

    @Test
    public void validFirstName() throws UserRegistrationException {
        try {
            resultExpected = "Happy:User Entry Validated Successfully";
            resultActual = validUseInfo.validFirstName("Venktesh");
            Assert.assertEquals(resultExpected, resultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_FIRST_NAME, e.type);
        }
    }

    @Test
    public void invalidFirstName() throws UserRegistrationException {
        try {
            resultExpected = "Sad:User Entry Validation Failed";
            resultActual = validUseInfo.validFirstName("venktesh");
            Assert.assertEquals(resultExpected, resultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_FIRST_NAME, e.type);
        }
    }

    @Test
    public void lastNameValid() throws  UserRegistrationException {
        try {
            resultExpected = "Happy:User Entry Validated Successfully";
            resultActual = validUseInfo.validLastName("Mane");
            Assert.assertEquals(resultExpected, resultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_FIRST_NAME, e.type);
        }
    }

    @Test
    public void lastNameInValid() throws UserRegistrationException {
        try {
            resultExpected = "Sad:User Entry Validation Failed";
            resultActual = validUseInfo.validLastName("mane");
            Assert.assertEquals(resultExpected, resultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_FIRST_NAME, e.type);
        }
    }

    @Test
    public void emailIdValid() throws  UserRegistrationException {
        try {
            resultExpected = "Happy:User Entry Validated Successfully";
            resultActual = validUseInfo.validMailID("venktesh.mane18@gmail.com");
            Assert.assertEquals(resultExpected, resultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_MAIL_ID, e.type);
        }
    }

    @Test
    public void emailIdInValid() throws  UserRegistrationException {
        try {
            resultExpected = "Sad:User Entry Validation Failed";
            resultActual = validUseInfo.validMailID("venktesh.mane18.co.in");
            Assert.assertEquals(resultExpected, resultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_MAIL_ID, e.type);
        }
    }

    @Test
    public void validMobileNum() throws  UserRegistrationException {
        try {
            resultExpected = "Happy:User Entry Validated Successfully";
            resultActual = validUseInfo.validMobileNumber("91-9527872718");
            Assert.assertEquals(resultExpected, resultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_MOBILE_NUMBER, e.type);
        }
    }

    @Test
    public void invalidMobileNum() throws UserRegistrationException {
        try {
            resultExpected = "Sad:User Entry Validation Failed";
            resultActual = validUseInfo.validMobileNumber("9527872718");
            Assert.assertEquals(resultExpected, resultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_MOBILE_NUMBER, e.type);
        }
    }

    @Test
    public void validPassword() throws UserRegistrationException {
        try {
            resultExpected = "Happy:User Entry Validated Successfully";
            resultActual = validUseInfo.validPassword("vm18gB&@z");
            Assert.assertEquals(resultExpected, resultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_PASSWORD, e.type);
        }
    }

    @Test
    public void invalidPassword() throws  UserRegistrationException {
        try {
            resultExpected = "Sad:User Entry Validation Failed";
            resultActual = validUseInfo.validPassword("vm1gBxzy");
            Assert.assertEquals(resultExpected, resultActual);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_USER_PASSWORD, e.type);
        }
    }
}