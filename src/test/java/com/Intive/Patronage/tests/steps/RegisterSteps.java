package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.AutomationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegisterSteps extends DriverFactory {

    AutomationPage automationPage = new AutomationPage(driver);

    @Given("^User is in Automation page$")
    public void userIsInAutomationPage() {
        automationPage.openAutomation();

    }

    @When("^I click on Sign in link$")
    public void iClickOnSignIn() {
        automationPage.SignInLink.click();
    }

    @Then("^I see Create An Account$")
    public void iSeeCreateAnAccount() {
        Assert.assertTrue(automationPage.CreateHeading.isDisplayed());
    }

    @And("^I see Email address input$")
    public void iSeeEmailAddressInput() {
        Assert.assertTrue(automationPage.EmailCreateInput.isDisplayed());
    }


    @And("^I submit empty email input below Create an Account header$")
    public void iSubimtEmptyEmailInputBelowCreateAnAccountHeader() {
        automationPage.SubmitCreate.click();

    }



    @Then("^I see error pop-up$")
    public void iSeeErrorPopUp() {
        Assert.assertTrue(automationPage.ErrorPopUp.isEnabled());
        
    }

    @And("^I type invalid email$")
    public void iTypeInvalidEmail() {
        automationPage.EmailCreateInput.sendKeys("abc@gmail.");
        automationPage.SubmitCreate.click();

    }

    @And("^I submit correct email$")
    public void iSubmitCorrectEmail() {
        automationPage.EmailCreateInput.sendKeys("666@gmail.com");
        automationPage.SubmitCreate.click();

    }

    @Then("^I see an Account Creation form$")
    public void iSeeAnAccountCreationForm() {
        Assert.assertTrue(automationPage.CreationForm.isDisplayed());

    }


    @And("^I submit an email: \"([^\"]*)\"$")
    public void iSubmitAnEmail(String ExistingEmail)  {
        automationPage.writeAndSubmit(ExistingEmail);

    }
}
