package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By searchfield = By.xpath("//input[@placeholder='Search']");
    By adminbutton = By.xpath("//span[normalize-space()='Admin']");
    By PIMbutton = By.xpath("//a[@class='oxd-main-menu-item active']");
    By leavebutton = By.xpath("//span[normalize-space()='Leave']");
    By dashboardbutton = By.xpath("//span[normalize-space()='Dashboard']");

    public void enterText(String Text){
     sendTextToElement(searchfield,Text);
    }
    public void adminButton(){
        clickOnElement(adminbutton);
    }
    public void PIMButton(){
        clickOnElement(PIMbutton);
    }
    public void leaveButton(){
        clickOnElement(leavebutton);
    }
    public void dashBoardButton(){
        clickOnElement(dashboardbutton);
    }

}
