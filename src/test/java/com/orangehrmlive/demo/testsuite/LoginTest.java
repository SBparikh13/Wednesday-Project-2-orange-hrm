package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    AddUserPage addUserPage = new AddUserPage();
    AdminPage adminPage = new AdminPage();
    DashboardPage dashboardPage = new DashboardPage();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();


    @Test
    public void verifyUserShouldLoginSuccessFully() {
        //Enter username
        loginPage.enterUserName();
        //Enter password
        loginPage.enterPassword();
        //Click on Login Button
        loginPage.clickOnLogin();
        //Verify "Dashboard" Message
        Assert.assertEquals(dashboardPage.verifyDashboardText(), "Dashboard");

    }

//    @Test
//    public void VerifyThatTheLogoDisplayOnLoginPage() {
//        //Verify Logo is Displayed
//        loginPage.verifyLogoPresent();
//    }
    @Test
    public void VerifyUserShouldLogOutSuccessFully(){
        //Login To The application
        verifyUserShouldLoginSuccessFully();
        //Click on User Profile logo
        loginPage.clickOnProfile();
        // Mouse hover on "Logout" and click
        loginPage.clickOnLogout();
        //Verify the text "Login Panel" is displayed
        loginPage.isLoginTextDisplayed();



    }
}