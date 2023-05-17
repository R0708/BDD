package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils{

    static String expectedRegistrationCompleteMsg = "Thank you for Register";

    public void VerifyUserRegisteredSuccessfully(){
        String actualMessage = getTextFromElement(By.className("result"));
        System.out.println("my message : "+actualMessage);

        Assert.assertEquals(actualMessage,expectedRegistrationCompleteMsg,"Register is not Completed.");
    }

}
