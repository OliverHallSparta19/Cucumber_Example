package com.sparta.owh.BBCSite;

import com.sparta.owh.BBCSite.BBCPages.BBCHomePage;
import com.sparta.owh.BBCSite.BBCPages.BBCSignInPage;
import org.openqa.selenium.WebDriver;

public class BBCSite {

    private WebDriver driver;
    BBCHomePage bbcHomePage;
    BBCSignInPage bbcSignInPage;



    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public void quit(){
        driver.quit();
    }

//    public BBCHomePage bbcHomePage(){
//        return bbcHomePage;
//    }

    public BBCSite(WebDriver driver) {
        this.driver = driver;
    }


    public BBCHomePage bbcHomePage(){
        return new BBCHomePage( driver );
    }

    public BBCSignInPage bbcSignInPage(){
        return new BBCSignInPage(driver);
    }

}
