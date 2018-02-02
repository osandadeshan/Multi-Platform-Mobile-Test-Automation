package pages;

import io.appium.java_client.MobileDriver;
import org.openqa.selenium.support.PageFactory;
import util.DriverSetup;
import util.FileReadWrite;

import java.io.IOException;
import static pages.SettingsPage.SETTINGS_PAGE;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;
import static util.DriverSetup.prepareAndroidForAppium;


/**
 * Created by Osanda on 5/14/2017.
 */


public class PrivacyPolicyPage extends BasePage {

    public static final String PRIVACY_POLICY_PAGE = "PrivacyPolicyPage";
    public static final String PRIVACY_POLICY = "privacy_policy";
    public static final String PRIVACY_POLICY_TITLE_TEXTVIEW = "privacy_policy_title_textview";
    public static final String BACK_BUTTON = "back_button";
    public static final String PRIVACY_POLICY_URL = "https://pi.pearsoned.com/v1/piapi/login/static/html/PearsonPrivacyPolicy.html";

    public PrivacyPolicyPage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void navigateToPrivacyPolicyPage() throws IOException {
        tapElement(SETTINGS_PAGE, PRIVACY_POLICY);
    }

    public void savePrivacyPolicyPageContent(String filePath) throws IOException {
        saveHTMLPageSource(filePath);
    }

    public void navigateBackFromPrivacyPolicyPage() throws IOException {
        switchContextTo(NATIVE_APP);
        tapElement(PRIVACY_POLICY_PAGE, BACK_BUTTON);
    }


}
