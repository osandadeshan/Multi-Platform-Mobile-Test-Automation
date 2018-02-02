package pages;

import io.appium.java_client.MobileDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import util.DriverSetup;
import util.FileReadWrite;

import java.io.IOException;
import static pages.SettingsPage.SETTINGS_PAGE;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 5/14/2017.
 */


public class TermsOfServicePage extends BasePage {

    public static final String TERMS_OF_SERVICE_PAGE = "TermsOfServicePage";
    public static final String TERMS_OF_SERVICE = "terms_of_service";
    public static final String TERMS_OF_SERVICE_TITLE_TEXTVIEW = "terms_of_service_title_textview";
    public static final String BACK_BUTTON = "back_button";
    public static final String TERMS_OF_SERVICE_URL = "https://pi.pearsoned.com/v1/piapi/login/static/html/PearsonEULA.html";

    public TermsOfServicePage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void navigateToTermsOfServicePage() throws IOException {
        tapElement(SETTINGS_PAGE, TERMS_OF_SERVICE);
    }

    public void saveTermsOfServicePageContent(String filePath) {
        saveHTMLPageSource(filePath);
        //getDriver().navigate().to(TERMS_OF_SERVICE_URL);
    }

    public void navigateBackFromTermsOfServicePage() throws IOException {
        switchContextTo(NATIVE_APP);
        tapElement(TERMS_OF_SERVICE_PAGE, BACK_BUTTON);
    }


}
