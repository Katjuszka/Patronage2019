package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.GooglePage;
import com.Intive.Patronage.tests.pages.HomePagePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ContactUs extends DriverFactory {

    GooglePage googlePage = new GooglePage(driver);
    HomePagePage homePagePage = new HomePagePage(driver);


    @Given("^I open teatautomationpage$")
    public void iOpenTeatautomationpage() {
        googlePage.openAutomation();


    }

    @When("^I press ContactUs link$")
    public void iPressContactUsLink() {

        googlePage.ContactLink.isDisplayed();
        googlePage.ContactLink.click();

    }

    @And("^I press Send button$")
    public void iPressSendButton() {
        googlePage.ContactLink.isDisplayed();
        googlePage.SubmitButtonSend.click();
    }

    @Then("^I see error poo-up$")
    public void iSeeErrorPooUp() {
       // Assert.assertFalse(googlePage.alertMessage.isDisplayed());
        Assert.assertTrue(googlePage.alertMessage.isDisplayed());
    }
}
