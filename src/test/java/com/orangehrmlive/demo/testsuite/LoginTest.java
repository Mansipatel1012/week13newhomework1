package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboard = new DashboardPage();


    @Test
    public void verifyUserShouldLoginSuccessFully() {
        // Enter username
        loginPage.enterUserName("Admin");
        //Enter password
        loginPage.enterPassword("admin123");
        // Click on Login Button
        loginPage.clickOnLoginbutton();
        // Verify "Dashboard" Message
        String actualWelcomeText = dashboard.dashboardText();
        String FinalText = actualWelcomeText.substring(0, 9);
        String expectedWelcomeText = "Dashboard";
        Assert.assertEquals(FinalText, expectedWelcomeText);

    }

    @Test
    public void VerifyThatTheLogoDisplayOnLoginPage() {
        // Launch the application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginbutton();
        // Verify Logo is Displayed
        dashboard.dashboardText();
    }

    @Test
    public void VerifyUserShouldLogOutSuccessFully() {
        //  Login To The application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginbutton();
        //  Click on User Profile logo
        dashboard.LogoDropDown();
        //  Mouse hover on "Logout" and click
        dashboard.mouseHoverToElementAndClick();
        //  Verify the text "Login Panel" is displayed
        loginPage.loginPanelText();
    }


}
