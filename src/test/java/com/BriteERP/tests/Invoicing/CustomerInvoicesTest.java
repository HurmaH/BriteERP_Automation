package com.BriteERP.tests.Invoicing;

import com.BriteERP.pages.CustomerInvoicesPage;
import com.BriteERP.pages.InvoicingPage;
import com.BriteERP.pages.SigninPage;
import com.BriteERP.utilities.Browser;
import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.Driver;
import com.BriteERP.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerInvoicesTest extends TestBase {

//    step1   Sign in with valid credentials
//    step2	Click on "Invoicing" button on top from menu bar
//    step3	Verify Customer Invoces Page is visible to user


    @Test
    public void customerInvoicesVisibility (){

        //1
        SigninPage signinPage = new SigninPage();
        signinPage.login(ConfigurationReader.getProperty("email"), ConfigurationReader.getProperty("password"));

        //2
        InvoicingPage invoicingPage = new InvoicingPage();
        Browser.wait(5);
        invoicingPage.Invoicing.click();

        //3.
        String expected = "Customer Invoices";
        String actual = invoicingPage.pageName.getText();
        Assert.assertEquals(actual, expected);
    }

//    step1   SignIn With Valid Credentials
//    step2	Click on "Invoicing" button on top from menu bar
//    step3	Click on "Create" button
//    step4	Click on "Customer" field
//    step5	Select "Create and Option"
//    step6	Click on "Name" field
//    step7	Enter sample name "Tom Jefry"
//    step8	Click on "Save" button
//    step9	Click on "Save" button one more time

    @Test
    public void createNewinvoice(){

        //1
        SigninPage signinPage = new SigninPage();
        signinPage.login(ConfigurationReader.getProperty("email"), ConfigurationReader.getProperty("password"));

        //2
        InvoicingPage invoicingPage = new InvoicingPage();
        Browser.wait(5);
        invoicingPage.Invoicing.click();

        //3
        CustomerInvoicesPage customerInvoicesPage = new CustomerInvoicesPage();
        customerInvoicesPage.CreateButton.click();

        //4 - there is frame
        customerInvoicesPage.Customer.click();

        //5.
        Browser.waitForClickablility(customerInvoicesPage.createAndEdit,10).click();
       // customerInvoicesPage.createAndEdit.click();

        //6.

        customerInvoicesPage.Name.click();
        customerInvoicesPage.Name.sendKeys("Tom Jerry");


        //7.
        customerInvoicesPage.saveName.click();

        //8.
        ((JavascriptExecutor)Driver.getDriver()).executeScript("window.scrollTo(0,"+customerInvoicesPage.saveInvoice.getLocation().y+")");
        customerInvoicesPage.saveInvoice.click();

    }

}
