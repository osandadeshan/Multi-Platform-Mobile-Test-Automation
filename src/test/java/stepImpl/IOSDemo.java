package stepImpl;

import io.appium.java_client.ios.IOSDriver;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static util.DriverSetup.APPIUM_HOST;
import static util.DriverSetup.APPIUM_PORT;


public class IOSDemo {

    private IOSDriver driver;
    public static final String APPIUM_SERVER_URL_ANDROID = "http://" + APPIUM_HOST + ":" + APPIUM_PORT + "/wd/hub";

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        File app = new File("/Users/unimaos/Desktop/SFC/NoDebug/MediaShareStaging.app");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("platformVersion", "10.3");
        caps.setCapability("deviceName", "iPhone 6");
        caps.setCapability("appiumversion", "1.6.5");
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("noReset", true);
        // caps.setCapability("bundleid", "com.pearsoned.flashcards.enterprise");
        caps.setCapability("app", app.getAbsolutePath());
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

    @Test
    public void testiOS() throws InterruptedException, IOException {
        driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"UserName\"]")).sendKeys("Osa");
        driver.findElement(By.xpath("//XCUIElementTypeSecureTextField[@name=\"Password\"]")).sendKeys("Osa");
        driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"SignIn\"]")).click();
        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}