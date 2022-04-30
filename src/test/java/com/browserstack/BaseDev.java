package com.browserstack;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class BaseDev {

    protected  WebDriver driver;

    @BeforeMethod
    public void setup(){

    }
}
