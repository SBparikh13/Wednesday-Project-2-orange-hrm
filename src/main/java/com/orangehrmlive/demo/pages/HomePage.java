package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By searchTab = By.xpath("//input[@placeholder='Search']");
    By adminTab = By.xpath("//a[@class='oxd-main-menu-item active']");
    By pimTab = By.xpath("//a[normalize-space()='']");
    By leaveTab = By.xpath("//span[normalize-space()='Leave']");
    By dashboardTab = By.xpath("//span[normalize-space()='Dashboard'");

    public void clickOnSearchTab(){
        clickOnElement(searchTab);
    }
    public void clickOnAdminTab(){
        clickOnElement(adminTab);
    }
    public void clickOnPIMTab(){
        clickOnElement(pimTab);
    }
    public void clickOnLeaveTab(){
        clickOnElement(leaveTab);
    }
    public void clickOnDashboardTab(){
        clickOnElement(dashboardTab);
    }



}
