package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {
     By dashboard = By.xpath("//h6[normalize-space()='Dashboard']");
     By profileLogo = By.xpath("//span[@class='oxd-userdropdown-tab']");
     By logout     = By.xpath("//a[normalize-space()='Logout']");

     public String dashboardText(){
         return getTextFromElement(dashboard);
     }
     public void LogoDropDown(){
         clickOnElement(profileLogo);
     }
     public void mouseHoverToElementAndClick(){
         clickOnElement(logout);
     }

}
