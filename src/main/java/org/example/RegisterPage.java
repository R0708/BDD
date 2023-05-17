package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils{
     private By FirstName = By.id("FirstName");
     private By LastName = By.id("LastName");
     private By dayOfBirth = By.name("DateOfBirthDay");
     private By monthOfBirth = By.name("DateOfBirthMonth");
     private By yearOfBirth = By.name("DateOfBirthYear");
     private By Email = By.id("Email");
     private By Password = By.id("Password");
     private By ConfirmPassword = By.id("ConfirmPassword");
     private By registerSubmitButton = By.id("register-button");

     LoadProp loadProp = new LoadProp();

     public void enterRegistrationDetails(){
        //type first name
        typeText(FirstName, loadProp.getProperty("FirstName"));
        //type last name
         typeText(LastName, loadProp.getProperty("LastName"));
         //select day from drop down
         selectOptionByIndex(dayOfBirth, Integer.parseInt(loadProp.getProperty("dayOfBirth")));
         //select month from drop down
        selectOptionByText(monthOfBirth, loadProp.getProperty("monthOfBirth"));
        //select year from drop down
        selectOptionByValue(yearOfBirth, loadProp.getProperty("yearOfBirth"));
        //type email address
         typeText(Email, (loadProp.getProperty("EmailFirst")) + timestamp() +loadProp.getProperty("EmailSecond"));
        //type password
        typeText(Password, loadProp.getProperty("Password"));
        //type confirm password
        typeText(ConfirmPassword, loadProp.getProperty("ConfirmPassword"));
        //click on register submit button
        clickOnElement(registerSubmitButton);

     }
    public void enterRegistrationDetailsWithoutTimeStep(){
        //type first name
        typeText(FirstName, loadProp.getProperty("FirstName"));
        //type last name
        typeText(LastName, loadProp.getProperty("LastName"));
        //select day from drop down
        selectOptionByIndex(dayOfBirth, Integer.parseInt(loadProp.getProperty("dayOfBirth")));
        //select month from drop down
        selectOptionByText(monthOfBirth, loadProp.getProperty("monthOfBirth"));
        //select year from drop down
        selectOptionByValue(yearOfBirth, loadProp.getProperty("yearOfBirth"));
        //type email address
        typeText(Email, loadProp.getProperty("EmailWTS"));
        //type password
        typeText(Password, loadProp.getProperty("Password"));
        //type confirm password
        typeText(ConfirmPassword, loadProp.getProperty("ConfirmPassword"));
        //click on register submit button
        clickOnElement(registerSubmitButton);




    }
}
