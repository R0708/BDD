package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ReferAFriendResultPage extends Utils{

    static String expectedReferProductMessage = "Your message has been sent.";


    public void VerifyUserAbleToReferAProductToAFriend(){

        // End of the process Actual message will come
        String actualMessage = getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        System.out.println("My Message:"+actualMessage);
        // Expected message
        Assert.assertEquals(actualMessage,expectedReferProductMessage,"Successfully message send");


    }

}
