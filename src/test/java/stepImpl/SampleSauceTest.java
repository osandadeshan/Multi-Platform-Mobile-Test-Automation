package stepImpl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;
import org.testng.Assert;
import java.net.URL;


public class SampleSauceTest {

    public static final String USERNAME = "p_SuperNova";
    public static final String ACCESS_KEY = "8c748bc0-edfa-4e71-afec-a7adb0ce68d1";
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

    public static void main(String[] args) throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "iPhone 6");
        capabilities.setCapability("platformVersion", "8.4");
        capabilities.setCapability("app", "https://s3.amazonaws.com/appium/TestApp8.4.app.zip");
       // capabilities.setCapability("browserName", "");
      //  capabilities.setCapability("deviceOrientation", "portrait");
       // capabilities.setCapability("appiumVersion", "1.5.3");

        WebDriver driver = new IOSDriver(new URL(URL), capabilities);

        String str = "test";
        Assert.assertEquals("test", str);

        driver.quit();
    }
}
