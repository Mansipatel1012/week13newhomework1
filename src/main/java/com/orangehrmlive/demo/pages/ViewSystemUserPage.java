package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUserPage extends Utility {
    By systemUserText = By.xpath("//h5[normalize-space()='System Users']");
    By userNameField = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
    By userRollDropDown = By.xpath("//div[@class='oxd-select-wrapper']//following-sibling::div");
    By employeeNameField = By.xpath("//input[@placeholder='Type for hints...']");
    By statusDropDown = By.xpath("//div[@class='oxd-select-text-input']/self::div");
    By searchBtn = By.xpath("//button[normalize-space()='Search']");
    By resetButton = By.xpath("//button[normalize-space()='Reset']");
    By addButton = By.xpath("//button[normalize-space()='Add']");
    By deleteBtn = By.xpath("//button[normalize-space()='Delete Selected']");
    By userList = By.xpath("//div[contains(text(),'Manoj')]");
    By checkbox = By.xpath("//div[@role='columnheader']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']");
    By noRecordFound = By.xpath("//span[normalize-space()='No Records Found']");

    public String systmUser() {
        return getTextFromElement(systemUserText);
    }

    public void userName(String uName) {
        sendTextToElement(userNameField, uName);
    }

    public void userRole(String userDropDown) {
        clickOnElement(userRollDropDown);
        selectByVisibleTextFromDropDown(userRollDropDown, userDropDown);
    }

    public void empName(String employeeName) {
        sendTextToElement(employeeNameField, employeeName);
    }

    public void statusDDown(String staDropDown) {
        clickOnElement(statusDropDown);
        sendTextToElement(statusDropDown, staDropDown);
    }

    public void searchButton() {
        clickOnElement(searchBtn);
    }

    public void resetBtn(){
        clickOnElement(resetButton);
    }

    public void addButton() {
        clickOnElement(addButton);
    }

    public String verifyUserName(String user){
        return getTextFromElement(userList);
    }

    public void clickOnCheckbox() {
        clickOnElement(checkbox);
    }

    public void clickOnDeleteButton() {
        clickOnElement(deleteBtn);
    }
    public String verifyNoRecordFound(String text){
        return getTextFromElement(noRecordFound);
    }




}
