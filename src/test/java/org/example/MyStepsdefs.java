package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepsdefs {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    ReferToFriendHomePage referToFriendHomePage = new ReferToFriendHomePage();
    ReferToFriendRegisterPage referToFriendRegisterPage = new ReferToFriendRegisterPage();
    ReferToFriendLoginPage referToFriendLoginPage = new ReferToFriendLoginPage();
    ReferToFriendProduct referToFriendProduct = new ReferToFriendProduct();
    ReferAFriendResultPage referAFriendResultPage = new ReferAFriendResultPage();

    @Given("I am on registration page")
    public void i_am_on_registration_page() {
        homePage.clickOnRegisterButton();
        referToFriendHomePage.ClickOnRegisterButtonToReferToFriend();
    }
    @When("I enter required registration details")
    public void i_enter_required_registration_details() {
        registerPage.enterRegistrationDetailsWithoutTimeStep();
       referToFriendRegisterPage.EnterRegistrationReferToFriendDetails();

    }
    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully() {
        registerResultPage.VerifyUserRegisteredSuccessfully();
    }

    @When("I enter required login details")
    public void i_enter_required_login_details() {
        referToFriendLoginPage.EnterLoginDetailsReferToFriend();
    }
    @Then("I should able to refer a friend by email")
    public void i_should_able_to_refer_a_friend_by_email() {
        referToFriendProduct.ClickOnProductTORefer();
    }
    @Then("I should able to refer a product to a friend successfully")
    public void i_should_able_to_refer_a_product_to_a_friend_successfully() {
        referAFriendResultPage.VerifyUserAbleToReferAProductToAFriend();
    }

}

