package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {
    By usermanagementBtn = By.xpath("//span[normalize-space()='User Management']");
    By jobBtn = By.xpath("//span[normalize-space()='Job']");
    By organization = By.xpath("//span[normalize-space()='Organization']");

}
