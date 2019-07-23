package com.BriteERP.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    //protected variable so whoever extends this class will extend these variables also

    protected WebDriver driver;
    protected SoftAssert softAssert;


    @BeforeMethod
    public void setupMethod() {
        driver = Driver.getDriver();
        softAssert = new SoftAssert();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("url"));

    }

    @AfterMethod
    public void tearDownMethod(ITestResult result) throws IOException {

        softAssert.assertAll();
        //Driver.closeDriver();


    }


}
