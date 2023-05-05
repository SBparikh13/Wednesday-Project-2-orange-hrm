package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsersTest extends BaseTest {
    AddUserPage addUserPage = new AddUserPage();
    AdminPage adminPage = new AdminPage();
    DashboardPage dashboardPage = new DashboardPage();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();




    @Test

    public void adminShouldAddUserSuccessFully(){
        // Login to Application
        loginPage.lunchApplication();
        //click On "Admin" Tab
        homePage.clickOnAdminTab();
        //Verify "System Users" Text
        Assert.assertEquals(adminPage.verifySystemUserText(),"System Users");
        //click On "Add" button
        viewSystemUsersPage.clickOnAddButton();
        //Verify "Add User" Text
        Assert.assertEquals(addUserPage.verifyAddUserText(),"Add User");
        //Select User Role "Admin"
        addUserPage.selectUserRole();
        addUserPage.enterEmployeeName();
        addUserPage.enterUsername();
        addUserPage.selectFromDropDownStatus();
        addUserPage.enterPassword();
        addUserPage.confirmPassword();
        addUserPage.clickOnSaveButton();

        //verifyText(driver, By.linkText("Successfully Saved"), "Successfully Saved");

    }
    @Test
    public void searchTheUserCreatedAndVerifyIt() {
        //Login to Application
        loginPage.lunchApplication();
        //click On "Admin" Tab
        homePage.clickOnAdminTab();
        //Verify "System Users" Text
        adminPage.verifySystemUserText();
       //Enter Username
        viewSystemUsersPage.enterUsername();
        //Select User Role
        viewSystemUsersPage.selectUserRoleFromDropDown();
        //Select Satatus
        viewSystemUsersPage.selectFromDropDownStatus();
        //Click on "Search" Button
        viewSystemUsersPage.clickOnSearchButton();
        //Verify the User should be in Result list.
        Assert.assertEquals(viewSystemUsersPage.verifyResultListText()," Result list");

    }
    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully () {
       //Login to Application
        loginPage.lunchApplication();
        //click On "Admin" Tab
        homePage.clickOnAdminTab();
        //Verify "System Users" Text
        Assert.assertEquals(adminPage.verifySystemUserText(),"System Users");
        //Enter Username
        viewSystemUsersPage.enterEmployeeName();
        //Select User Role
        viewSystemUsersPage.selectUserRoleFromDropDown();
        //Select Satatus
       viewSystemUsersPage.selectFromDropDownStatus();
        //Select Satatus
        viewSystemUsersPage.selectFromDropDownStatus();
        //Verify the User should be in Result list.
        Assert.assertEquals(viewSystemUsersPage.verifyResultListText()," Result list");
        //Click on Check box
        viewSystemUsersPage.clickOnCheckbox();
        //Click on Delete Button
        viewSystemUsersPage.clickOnDeleteButton();
        //Popup will display
        //	Click on Ok Button on Popup
        //verify message "Successfully Deleted"
        Assert.assertEquals(viewSystemUsersPage.successfullyDeletedText(),"Successfully Deleted");
    }
    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound () {
        //Login to Application
        loginPage.lunchApplication();
        //click On "Admin" Tab
        homePage.clickOnAdminTab();
        //Verify "System Users" Text
        Assert.assertEquals(adminPage.verifySystemUserText(),"System Users");
        //Enter Username
        loginPage.enterUserName();
        //Select User Role
        viewSystemUsersPage.selectUserRoleFromDropDown();
        //Select Satatus
        viewSystemUsersPage.selectFromDropDownStatus();
        //Click on "Search" Button
        viewSystemUsersPage.clickOnSearchButton();
        //verify message "No Records Found"

    }

    }
}
