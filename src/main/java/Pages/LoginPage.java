package Pages;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import Utils.Base;
import io.appium.java_client.ios.IOSDriver;

public class LoginPage extends Base{
    IOSDriver driver;


    public LoginPage(IOSDriver driver){
        super(driver);
        this.driver=driver;
    }


}
