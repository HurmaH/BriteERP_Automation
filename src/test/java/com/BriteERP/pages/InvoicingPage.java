package com.BriteERP.pages;

import com.BriteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicingPage {

    public InvoicingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Invoicing')]")
    public WebElement Invoicing;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement Create;

    @FindBy (xpath = "//a[@href='/web#menu_id=201&action=']")
    public WebElement Documents;

    @FindBy (css = "span:contains('Customer Invoices')")
    public WebElement CustomerInvoices;

    @FindBy (xpath = "//li[.='Customer Invoices']")
    public WebElement pageName;

}
