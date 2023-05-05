package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class LoginPage extends Utility {

    By userNameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@type= 'submit']");

    By hrForAllLogo = By.xpath("//a[normalize-space()='ITC Ltd.']\"(//img[@alt='orangehrm-logo'])[1]\"undefined");
    By loginPanelText = By.xpath("//a[normalize-space()='ITC Ltd.']\"//h5[normalize-space()='Login']\"undefined");

    By userProfileLogo = By.xpath("//header/div[1]/div[2]/ul[1]/li[1]/span[1]");
    By logoutButton = By.xpath("//a[contains(text(),'Logout')]");


    public void enterUserName() {
        sendTextToElement(userNameField, "Admin");
    }

    public void enterPassword() {
        sendTextToElement(passwordField, "admin123");
    }

    public void clickOnLogin() {
        clickOnElement(loginButton);
    }
    public void lunchApplication()
    {
        sendTextToElement(userNameField, "Admin");
        sendTextToElement(passwordField, "admin123");
        clickOnElement(loginButton);
    }

    public void isLoginTextDisplayed() {
        WebElement element = driver.findElement(loginPanelText);
        if (element.isSelected()) {
            System.out.println("Login text has not displayed");
            element.click();
        } else {
            System.out.println("Login text has displayed");
        }
    }
//    public void verifyLogoDisplay()
//    {
//        verifyText(driver,userProfileLogo,"/web/images/orangehrm-logo.png?1672659722816");
//    }


        public void verifyLogoPresent() {

            Boolean logoPresent = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", hrForAllLogo);
            //verify if status is true
            if (logoPresent) {
                System.out.println("Logo present");
            } else {
                System.out.println("Logo not present");
            }

        }
        public void clickOnProfile () {
            mouseHoverToElementAndClick(userProfileLogo);
        }
        public void clickOnLogout(){
        mouseHoverToElementAndClick(logoutButton);

        }


    }
