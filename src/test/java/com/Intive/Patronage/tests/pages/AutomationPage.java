package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AutomationPage {

    private WebDriver driver;
    private static String Automation_URL = "http://www.automationpractice.com/";


    @FindBy(how = How.CLASS_NAME, using = "page-subheading")
    public WebElement CreateHeading;

    @FindBy(how = How.CLASS_NAME, using = "header_user_info")
    public WebElement SignInLink;

    @FindBy(how = How.ID, using = "email_create")
    public WebElement EmailCreateInput;

    @FindBy(how = How.ID, using="SubmitCreate")
    public WebElement SubmitCreate;

    @FindBy(how = How.CLASS_NAME,using = "alert-danger")
    public WebElement ErrorPopUp;

    @FindBy(how = How.ID, using="account-creation_form")
    public WebElement CreationForm;

    public void writeAndSubmit(String email ) {
        EmailCreateInput.sendKeys(email);
        SubmitCreate.click();
    }






    public AutomationPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openAutomation() {
        driver.get(Automation_URL);

    }
}
