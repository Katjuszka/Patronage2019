package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.RegisterFormPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegisterFormSteps extends DriverFactory {

    RegisterFormPage registerFormPage = new RegisterFormPage(driver);

    @Given("^User is in Register Form$")
    public void userIsInRegisterForm() {
        registerFormPage.openRegisterFormPage();
        registerFormPage.FirstEmailInput.sendKeys("idgh@gmail.com"); // należy zmienić adres przed każdym testem
        registerFormPage.SubmitCreateBut.click();
    }

    @When("^I choose state: \"([^\"]*)\" from dropdown$")
    public void iChooseStateFromDropdown(String state)  {
        registerFormPage.ChooseState(state);

    }


    @Then("^I see \"([^\"]*)\" in dropdown$")
    public void iSeeInDropdown(String state)  {
        String selectedOption = new RegisterFormPage(driver).getSelected();
        Assert.assertEquals("Alabama", selectedOption);


    }

    @When("^I submit empty form$")
    public void iSubmitEmptyForm() {
        registerFormPage.SubmitAccount.click();

    }

    @Then("^I can see error pop up$")
    public void iCanSeeErrorPopUp() {
        Assert.assertTrue(registerFormPage.ErrorPopUp.isEnabled());

    }

    @When("^I submit form only with required fields$")
    public void iSubmitFormOnlyWithRequiredFields() {
        registerFormPage.ChooseState("Alabama");
        registerFormPage.AliasInput.clear();
        registerFormPage.fillTexTInput("Jan","Nowak","Ulica 44/1","123456","Kutno","12345","111222333","home");


    }

    @Then("^I see info I am welcomed on site$")
    public void iAmAbleToCreateAnAccount() {
        Assert.assertTrue(registerFormPage.Heading.isDisplayed());
    }

    @When("^I submit form only with required fields and with three letter password$")
    public void iSubmitFormOnlyWithRequiredFieldsAndWithThreeLetterPassword() {
        registerFormPage.ChooseState("Alabama");
        registerFormPage.fillTexTInput("Jan","Nowak","Ulica 44/1","123","Kutno","12345","111222333","home");
        
    }

    @Then("^I see error password pop up$")
    public void iSeeErrorPasswordPopUp() {
        Assert.assertTrue(registerFormPage.ErrorPopUp.isEnabled());
    }

    @When("^I submit totally filled form$")
    public void iSubmitTotallyFilledForm() {
        registerFormPage.RadioButtonFemale.click();
        registerFormPage.ChooseDate(26,07,"1996");
        registerFormPage.NewsletterCheckBox.click();
        registerFormPage.OffertCheckBox.click();
        registerFormPage.fillNonRequiredInput("Firma","I am student","4614385");
        registerFormPage.ChooseState("Alabama");
        registerFormPage.AliasInput.clear();
        registerFormPage.fillTexTInput("Jan","Nowak","Ulica 44/1","123456","Kutno","12345","111222333","home");


    }
}
