package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {
    AdminPage adminpage = new AdminPage();
    ViewSystemUserPage viewSystemUserPage = new ViewSystemUserPage();
    AddUserPage addUserPage = new AddUserPage();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();


    @Test
    public void adminShouldAddUserSuccessFully() {
        // Login to Application
       loginPage.enterUserName("Admin");
       loginPage.enterPassword("admin123");
       loginPage.clickOnLoginbutton();
        //  click On "Admin" Tab
        homePage.adminButton();
        // Verify "System Users" Text
        viewSystemUserPage.systmUser();
        // click On "Add" button
        viewSystemUserPage.addButton();
        //Verify "Add User" Text
        addUserPage.addUserText();
        //Select User Role "Admin"
        addUserPage.selectUserRoleByValue("1");
        //enter Employee Name "lisa Andrew"
        addUserPage.employeeName("Peter Anderson");
        // enter Username
        addUserPage.userName1("Krishna");
        // Select status "Disable"
        addUserPage.statusDropDown1("Disable");
        //enter password
        addUserPage.password("JollyLLB12@");
        //  enter Confirm Password
         addUserPage.confirmPassword("JollyLLB12@");
        //  click On "Save" Button
        addUserPage.saveBtn();
        // verify message "Successfully Saved"
        String actualText = addUserPage.verifyTextOfSuccessfullySaved();
        String expectedText = "Successfully Saved";
        Assert.assertEquals(actualText,expectedText);


    }
    @Test
    public void searchTheUserCreatedAndVerifyIt(){
        // Login to Application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginbutton();
       // click On "Admin" Tab
        homePage.adminButton();
        //Verify "System Users" Text
        viewSystemUserPage.systmUser();
       // Enter Username
       viewSystemUserPage.userName("Manoj");
        //Select User Role
       viewSystemUserPage.userRole("Admin");
       // Select Status
        viewSystemUserPage.statusDDown("Disable");
       // Click on "Search" Button
        viewSystemUserPage.searchButton();
       // Verify the User should be in Result list.
        String expectedText = "Manoj";
        String actualText = viewSystemUserPage.verifyUserName("Manoj");
        Assert.assertEquals(actualText,expectedText);

    }
    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully(){
       // Login to Application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginbutton();
       // click On "Admin" Tab
        homePage.adminButton();
       // Verify "System Users" Text
        viewSystemUserPage.systmUser();
//       // Enter Username
//        viewSystemUserPage.userName("Alice.Duval");
//        //Select User Role
//        viewSystemUserPage.userRole("Admin");
//       // Select Status
//        viewSystemUserPage.statusDDown("Disable");
//       // Click on "Search" Button
//        viewSystemUserPage.searchButton();
//       // Verify the User should be in Result list.
//        // Click on Check box
//        viewSystemUserPage.clickOnCheckbox();
//       // Click on Delete Button
//        viewSystemUserPage.clickOnDeleteButton();
//        // verify message "Successfully Deleted"
//        switchToAlert();
//        String expectedMessage = "Successfully Deleted";
//        String actualMessage = getTextFromAlert();
//        Assert.assertEquals(actualMessage, expectedMessage, "Successfully Deleted");
//        // click on "ok" button on popup.
//        acceptAlert();


    }
    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound(){
       // Login to Application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginbutton();
       // click On "Admin" Tab
        homePage.adminButton();
       // Verify "System Users" Text
        viewSystemUserPage.systmUser();
       // Enter Username
        viewSystemUserPage.userName("Alice.Duval");
       // Select User Role
        viewSystemUserPage.userRole("Admin");
      //  Select Status
        viewSystemUserPage.statusDDown("Disable");
      //  Click on "Search" Button
        viewSystemUserPage.searchButton();
       // verify message "No Records Found"
      String expectedText = "No Records Found";
      String actualText = viewSystemUserPage.verifyNoRecordFound("No Records Found");
      Assert.assertEquals(actualText,expectedText);
    }


}
