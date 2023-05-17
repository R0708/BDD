package org.example;

import org.openqa.selenium.By;

public class ReferToFriendHomePage extends Utils{

    By registerButton = By.className("ico-register");

    public void ClickOnRegisterButtonToReferToFriend(){
        //click on register
        clickOnElement(registerButton);

    }
}
