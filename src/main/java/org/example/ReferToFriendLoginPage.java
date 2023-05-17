package org.example;

import org.openqa.selenium.By;

public class ReferToFriendLoginPage extends Utils{
    LoadProp loadProp = new LoadProp();
    By Login = By.className("ico-login");
    private By Email = By.id("Email");
    private By Password = By.id("Password");
    private By LoginButton = By.xpath("//div[@class=\"buttons\"]//button[@class=\"button-1 login-button\"]");



    public void EnterLoginDetailsReferToFriend(){
        // Open Login Page
        clickOnElement(Login);
        // Enter your email address
        typeText(Email, loadProp.getProperty("EmailWTS"));
        // Enter Password
        typeText(Password, loadProp.getProperty("Password"));
        // Click Log in button
        clickOnElement(LoginButton);

    }
}
