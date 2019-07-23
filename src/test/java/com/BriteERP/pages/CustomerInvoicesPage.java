package com.BriteERP.pages;

import com.BriteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerInvoicesPage {

    public CustomerInvoicesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//li[.='Customer Invoices']")
    public WebElement pageName;

    @FindBy (css = "button[accesskey='c']")
    public WebElement CreateButton;

    @FindBy (xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement Customer;

    @FindBy (xpath = "//a[.='Create and Edit...']")
    public WebElement createAndEdit;

    @FindBy (xpath = "//input[@placeholder='Name']")
    public WebElement Name;

    @FindBy (xpath = "//span[.='Save']")
    public WebElement saveName;

    @FindBy (xpath = "//button[@accesskey='s']")
    public WebElement saveInvoice;


}
