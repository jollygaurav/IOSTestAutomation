package TestClasses;

import Driver.DriverInitiator;
import Pages.LoginPage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Login {

    IOSDriver driver;
    DriverInitiator driverInitiator;
    LoginPage loginPageObject;

    public Login(){
        driverInitiator = new DriverInitiator();
        this.driver= driverInitiator.createDriver();
        loginPageObject=new LoginPage(driver);
    }

    @Test
    public void openApp() throws InterruptedException{
        Thread.sleep(2000);
        
    }

    @AfterSuite
    public void uninstallApp() {
        driver.removeApp("com.bzytan.appiumeveryday");
    }

}
