package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class RegisterFormPage {

    private static String RegisterForm_URL = "http://automationpractice.com/index.php?controller=authentication";
    private WebDriver driver;


    @FindBy(how = How.ID, using = "id_state")
    public WebElement StateDropDown;

    @FindBy(how = How.ID, using = "email_create")
    public WebElement FirstEmailInput;

    @FindBy(how = How.ID, using = "SubmitCreate")
    public WebElement SubmitCreateBut;

    @FindBy(how = How.CLASS_NAME, using = "info-account")
    public WebElement Heading;

    @FindBy(how = How.ID, using = "submitAccount")
    public WebElement SubmitAccount;

    @FindBy(how = How.CLASS_NAME, using = "alert-danger")
    public WebElement ErrorPopUp;

    @FindBy(how = How.ID, using = "customer_firstname")
    public WebElement FirstNameInput;

    @FindBy(how = How.ID, using = "customer_lastname")
    public WebElement LastNameIpnut;

    @FindBy(how = How.ID, using = "address1")
    public WebElement Address;

    @FindBy(how = How.ID, using = "passwd")
    public WebElement Password;

    @FindBy(how = How.ID, using = "city")
    public WebElement CityInput;

    @FindBy(how = How.ID, using = "postcode")
    public WebElement ZipInput;

    @FindBy(how = How.ID, using = "phone_mobile")
    public WebElement PhoneInput;

    @FindBy(how = How.ID, using = "alias")
    public WebElement AliasInput;

    @FindBy(how = How.ID, using = "id_gender2")
    public WebElement RadioButtonFemale;

    @FindBy(how = How.ID, using = "days" )
     public WebElement DayDropDown;

    @FindBy(how = How.ID, using = "months" )
    public WebElement MonthDropDown;

    @FindBy(how = How.ID, using ="years" )
     public WebElement YearDropDown;

    @FindBy(how = How.ID, using ="newsletter" )
     public WebElement NewsletterCheckBox;

    @FindBy(how = How.ID, using ="optin" )
     public WebElement OffertCheckBox;

    @FindBy(how = How.ID, using ="company" )
    public WebElement CompanyInput;

    @FindBy(how=How.ID,using="other")
    public WebElement OtherInfoInput;

    @FindBy(how=How.ID,using="phone")
    public WebElement HomePhoneInput;



    public void fillNonRequiredInput(String company, String other, String homePhone){
     CompanyInput.sendKeys(company);
     OtherInfoInput.sendKeys(other);
     HomePhoneInput.sendKeys(homePhone);

}
    public void fillTexTInput(String firstName, String lastName, String address, String password, String city, String zip, String phone, String alias){
        FirstNameInput.sendKeys(firstName);
        LastNameIpnut.sendKeys(lastName);
        Address.sendKeys(address);
        Password.sendKeys(password);
        CityInput.sendKeys(city);
        ZipInput.sendKeys(zip);
        PhoneInput.sendKeys(phone);
        AliasInput.sendKeys(alias);
        SubmitAccount.click();
    }


    public void ChooseState(String index){
        Select Choose = new Select(StateDropDown);
        Choose.selectByVisibleText(index);

    }
    public void ChooseDate(Integer day, Integer month, String year){
        Select ChooseDay = new Select(DayDropDown);
        ChooseDay.selectByIndex(day);
        Select ChooseMonth = new Select(MonthDropDown);
        ChooseMonth.selectByIndex(month);
        Select ChooseYear = new Select(YearDropDown);
        ChooseYear.selectByValue(year);
    }

    public String getSelected() {
        return new Select(StateDropDown).getFirstSelectedOption().getText().trim();
    }
    public RegisterFormPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openRegisterFormPage() {
        driver.get(RegisterForm_URL);
    }


}
