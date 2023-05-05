package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userNamefield = By.name("username");
    By passwordfield = By.name("password");
    By loginButton = By.xpath("//button[normalize-space()='Login']");
    By HRLogo = By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']");
    By loginPanel = By.xpath("//div[@class='orangehrm-login-slot']");

    public void enterUserName(String userName){
        sendTextToElement(userNamefield,userName);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordfield,password);
    }
    public void clickOnLoginbutton(){
        clickOnElement(loginButton);

    }
    public String hRForAll(){
        return getTextFromElement(HRLogo);
    }
    public String loginPanelText(){
        return getTextFromElement(loginPanel);
    }

}
