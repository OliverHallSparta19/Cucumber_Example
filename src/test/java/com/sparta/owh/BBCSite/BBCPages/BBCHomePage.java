package com.sparta.owh.BBCSite.BBCPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BBCHomePage {

    private WebDriver driver;
    private String HomePageURL = "https://www.bbc.co.uk/";
    private By SignInLink = By.id("idcta-link");

    public BBCHomePage(WebDriver driver){
        this.driver = driver;
    }

    public void goToHomePage(){
        driver.navigate().to(HomePageURL);
    }

    public void clickSignInLink(){
        driver.findElement(SignInLink).click();
    }



}
