package org.example;

import org.openqa.selenium.By;

public class ReferToFriendRegisterPage extends Utils{
    LoadProp loadProp = new LoadProp();

    private By FirstName = By.id("FirstName");
    private By LastName = By.id("LastName");
    private By Email = By.id("Email");
    private By Password = By.id("Password");
    private By ConfirmPassword = By.id("ConfirmPassword");
    private By registerSubmitButton = By.id("register-button");

    public void EnterRegistrationReferToFriendDetails(){
        //type first name
        typeText(FirstName,loadProp.getProperty("FirstName"));

        //type last name
        typeText(LastName, loadProp.getProperty("LastName"));

        //type email address
        typeText(Email, "jiya@gmail.com");

        //type password
        typeText(Password, loadProp.getProperty("Password"));

        //type confirm password
        typeText(ConfirmPassword, loadProp.getProperty("ConfirmPassword"));

        //click on register submit button
        clickOnElement(registerSubmitButton);


    }
}
