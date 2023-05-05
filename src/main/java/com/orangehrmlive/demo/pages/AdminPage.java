package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {
    By userManagementTab = By.xpath("//span[normalize-space()='User Management']");
    By jobTab = By.xpath("//span[normalize-space()='Job']");
    By organizationTab = By.xpath("//span[normalize-space()='Organization']");
    By systemUserText = By.xpath("//h5[normalize-space()='System Users']");


    public void clickOnUserManagement(){
        clickOnElement(userManagementTab);
    }
    public void clickOnJob(){
        clickOnElement(jobTab);
    }
    public void clickOnOrganization(){
        clickOnElement(organizationTab);
    }
    public String verifySystemUserText(){
        return getTextFromElement(systemUserText);
    }


}
