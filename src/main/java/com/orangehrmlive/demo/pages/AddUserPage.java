package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {
    By userRoleDropDown = By.xpath("//div[@class='oxd-select-text-input']");
    By userRole = By.xpath("//select[@id='systemUser_userType']");
    By admin = By.xpath("//div[@class='oxd-select-text-input']/div");
    //div[@class='oxd-select-wrapper']//following-sibling::div
    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By userName = By.xpath("//label[normalize-space()='Username']");
    By statusDropDown = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]");
    By password = By.xpath(" //input[@fdprocessedid='bcvsx']");
    By confirmPassword = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
    By cancelbutton = By.xpath("//button[normalize-space()='Cancel']");
    By savebutton = By.xpath("//button[normalize-space()='Save']");
    By addUser = By.xpath("//h6[normalize-space()='Add User']");
    By successfullySavedText = By.cssSelector("div:nth-child(2) div.box.noHeader:nth-child(1) div.inner form:nth-child(1) > script:nth-child(3)");
    public void selectUserRoleByValue(String Value){
        clickOnElement(userRoleDropDown);
        selectByValueFromDropDown(userRoleDropDown,Value);
    }

    public void uRoleDropDown() {
        clickOnElement(userRoleDropDown);
        mouseHoverToElementAndClick(admin);
        selectByVisibleTextFromDropDown(admin, "Admin");
        selectByValueFromDropDown(admin,"0");

    }

    public void employeeName(String empName) {
        sendTextToElement(employeeName, empName);
    }

    public void userName1(String uname) {
        sendTextToElement(userName, uname);
    }

    public void statusDropDown1(String stDropDown) {
        sendTextToElement(statusDropDown, stDropDown);
    }

    public void password(String pword) {
        sendTextToElement(password, pword);
    }

    public void confirmPassword(String cFpassword) {
        sendTextToElement(confirmPassword, cFpassword);

    }

    public void cancelBtn() {
        clickOnElement(cancelbutton);
    }

    public void saveBtn() {
        clickOnElement(savebutton);
    }

    public String verifyTextOfSuccessfullySaved(){
        return getTextFromElement(successfullySavedText);

    }

    public String addUserText(){
        return getTextFromElement(addUser);
    }
}
