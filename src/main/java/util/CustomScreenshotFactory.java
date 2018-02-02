package util;

import com.thoughtworks.gauge.screenshot.ICustomScreenshotGrabber;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.BasePage;


/**
 * Created by Osanda on 5/25/2017.
 */


public class CustomScreenshotFactory implements ICustomScreenshotGrabber {

    BasePage basePageObj = new BasePage();

    // Return a screenshot byte array
    public byte[] takeScreenshot() {
        return ((TakesScreenshot) basePageObj.getDriver()).getScreenshotAs(OutputType.BYTES);
    }


}
