package org.example;

import org.openqa.selenium.By;

public class ReferToFriendProduct extends Utils{
    LoadProp loadProp = new LoadProp();
    By AppleMacBook = By.linkText("Apple MacBook Pro 13-inch");
    private By EmailFriend = By.className("email-a-friend");
    private By friendEmail = By.className("friend-email");
    private By Message = By.id("PersonalMessage");
    private By SendEmail = By.name("send-email");

    public void ClickOnProductTORefer(){

        // Choose Apple MacBook Pro 13-inch
        clickOnElement(AppleMacBook);
        // Go to email friend
        clickOnElement(EmailFriend);
        // Put friend's email address
        typeText(friendEmail, loadProp.getProperty("FriendEmail"));
        // Type message
        typeText(Message, "This MacBook is a best");
        // Click on Send email button
        clickOnElement(SendEmail);
    }
}
