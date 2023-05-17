package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HomePage extends Utils {

    By registerButton = By.className("ico-register");
    By _searchBox = By.cssSelector("input#small-searchterms");
    By searchButton = By.cssSelector("button.button-1.search-box-button");
    By CurrencyUSDollar = By.cssSelector("select#customerCurrency");
    By currencyEuro = By.cssSelector("select#customerCurrency");
    By priceList = By.xpath("//span[contains(@class,'price actual-price')]");
    By _productGrid = By.cssSelector("div.product-grid h2");
    By details = By.xpath("//a[contains(text(),'nopCommerce new release!')]");
    By BuildComputer = By.xpath("//button[contains(@class,'button-2 product-box-add-to-cart-button')]");
    By vote = By.cssSelector("button#vote-poll-1");
    By facebook = By.xpath("//a[contains(text(),'Facebook')]");
    By _welcomeMessage = By.cssSelector("div.topic-block-title h2");
    public void clickOnRegisterButton(){
        //click on register button
        clickOnElement(registerButton);
    }
    public void verifySearchAlertMessage(){
        //click on search button
        clickOnElement(searchButton);
        //get text
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Please enter some search keyword...");
        alert.accept();
    }
    public void verifyCurrencyAccordingly(){
        //select US Dollar currency
        selectOptionByText(CurrencyUSDollar,"US Dollar");
        System.out.println("Customer Currency accordingly chanced : ");

        //print featured product price in US Dollar to verify currency
        List<WebElement>productPrices = driver.findElements(priceList);
        for (WebElement e:productPrices){
            System.out.println(e.getText());
        }
        //select Euro currency
        selectOptionByText(currencyEuro,"Euro");
        System.out.println("Customer Currency accordingly chanced : ");

        //print featured product price in Euro to verify currency
        List<WebElement>productPrices2 = driver.findElements(priceList);
        for (WebElement e:productPrices2){
            System.out.println(e.getText());
        }
    }
    public void verifySearchFunctionalityWorkingFine() {
        //type search product
        typeText(_searchBox, "Camera");
        //click on search
        clickOnElement(searchButton);
        List<WebElement> productList = driver.findElements(_productGrid);
        for (WebElement e : productList) {
            System.out.println(e.getText());
        }
    }
    public void goToNopCommerceNewRelease(){
         //Click on Details
        clickOnElement(details);
    }
    public void goToBuildYourOwnComputer(){
        //click on add to cart
        clickOnElement(BuildComputer);
    }
    public void verifyVoteAlter(){
        //click on vote
        clickOnElement(vote);
        //get alter message
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Please select an answer");
        alert.accept();
    }
    public void clickOnFacebookFollowUs(){
        //click on Facebook
        clickOnElement(facebook);
        String MainWindow = driver.getWindowHandle();
        // To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
            }
        }
    }
    public void welcomeToOurStore () {
        String expectedWelcomeMessage = "Welcome to our store";
        String actualMessage = getTextFromElement(_welcomeMessage);
        System.out.println("get message on Homepage:" + actualMessage);
        //Close URL
        Assert.assertEquals(actualMessage, expectedWelcomeMessage, "Welcome Homepage");}

}





