package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {
    By addUserText = By.xpath("//h6[normalize-space()='Add User']");

    By userRole = By.xpath("//div[@class='oxd-select-text oxd-select-text--focus']//div[@class='oxd-select-text-input'][normalize-space()='-- Select --']");
    By employeeNameField = By.xpath("//input[@placeholder='Type for hints...']");
    By usernameField = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]");
    By statusField = By.xpath("//div[contains(text(),'-- Select --')]");
    By passwordField = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
    By confirmPasswordField = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]");
    By saveButton = By.xpath("//button[normalize-space()='Save']");
    By successfullySavedText = By.linkText("Successfully Saved");



    public String verifyAddUserText(){
        return getTextFromElement(addUserText);
    }
    public void selectUserRole(){
        waitAndClick(userRole);
    }
    public void enterEmployeeName() {
        sendTextToElement(employeeNameField, "Kiara");
    }

    public void enterUsername(){
        sendTextToElement(usernameField, "Kparikh");
    }


    public void selectFromDropDownStatus()
    {
        waitAndClick(statusField);
    }

    public void enterPassword(){
        sendTextToElement(passwordField, "Alpha12345*");
    }

    public void confirmPassword(){
        sendTextToElement(confirmPasswordField, "Alpha12345*");
    }

    public void clickOnSaveButton(){
        clickOnElement(saveButton);
    }

    public String successfullySavedText(){
        return getTextFromElement(successfullySavedText);
    }
}
