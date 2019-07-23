package com.BriteERP.pages;

import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {

    public SigninPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//b[.='Sign in']")
    public WebElement signinButton;

    @FindBy (id = "login")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;

    @FindBy(xpath = "//p[contains(text(),'Wrong')]")
    public WebElement errorMessage;


    public void login(String email, String password){
        signinButton.click();
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        loginButton.click();
    }


}
