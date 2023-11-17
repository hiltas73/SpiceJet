package com.spiceJet.pages;

import com.spiceJet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[.='From']")
    public static WebElement fromInputBox;

    @FindBy(xpath = "//*[.='To']")
    public WebElement toInputBox;

    @FindBy(xpath = "//div[text()='24']")
    public WebElement calendarFirstDate;

    @FindBy(xpath = "//*[.='Search Flight']")
    public WebElement searchFlightButton;


    public void selectFrom(String location){
        fromInputBox.click();
        Driver.getDriver().findElement(By.xpath("//*[.='"+ location + "']")).click();
    }

    public void selectTo(String location){
        toInputBox.click();
        Driver.getDriver().findElement(By.xpath("//*[.='"+ location + "']")).click();
    }

}
