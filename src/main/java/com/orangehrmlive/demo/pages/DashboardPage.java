package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {
    By dashboardText = By.xpath("//header/div[1]/div[1]/span[1]/h6[1]");


    public String verifyDashboardText() {

        return getTextFromElement(dashboardText);
    }
}
